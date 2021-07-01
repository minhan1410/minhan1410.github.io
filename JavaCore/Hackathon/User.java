import java.util.LinkedHashMap;
import java.util.Map;

public class User {
    private static Map<String,String> mapUser= new LinkedHashMap<String,String>();

    public boolean DangKi(String sdt,String mk){
        boolean flag = false;
        if(Validation.validateSTK(sdt)){
            mapUser.put(sdt, mk);
            flag = true;
        }
        return flag;
    }

    public void print(){
        mapUser.forEach((k,v)-> System.out.println(k+" - "+v));
    }

    public boolean DangNhap(String sdt,String mk){
        return mapUser.containsKey(sdt);
    }
}
