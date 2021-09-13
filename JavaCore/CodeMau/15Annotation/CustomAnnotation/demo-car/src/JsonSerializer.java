import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Objects;

public class JsonSerializer {
    public String serialize(Object object) throws JsonSerializeException {

        try {
            Class<?> objectClass = Objects.requireNonNull(object).getClass(); //requireNonNull: kiểm tra xem tham chiếu đối tượng có là null hay không, 
            //nếu phải thì ném ra ngoại lệ NullPointerException
            Map<String, String> jsonElements = new HashMap<>();

            for (Field field: objectClass.getDeclaredFields()) { // Trả về một mảng các đối tượng đại diện cho tất cả các bản ghi
                field.setAccessible(true);
                if (field.isAnnotationPresent(JsonField.class)) {//Kiêm tra xem trường đó có được ghi chú bằng @JsonField không
                    jsonElements.put(getSerializedKey(field), (String) field.get(object));
                }
            }
            System.out.println(toJsonString(jsonElements));
            return toJsonString(jsonElements);
        }
        catch (IllegalAccessException e) {
            throw new JsonSerializeException(e.getMessage());
        }
    }

    private String toJsonString(Map<String, String> jsonMap) { //Chuyển đổi chuỗi sang JSON
        String elementsString = jsonMap.entrySet()
                .stream()
                .map(entry -> "\""  + entry.getKey() + "\":\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(","));
        return "{" + elementsString + "}";
    }

    private static String getSerializedKey(Field field) { 
        String annotationValue = field.getAnnotation(JsonField.class).value();

        if (annotationValue.isEmpty()) {
            return field.getName(); //Lấy tên trường
        }
        else {
            return annotationValue;
        }
    }
}
