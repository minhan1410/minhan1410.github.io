import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //Annotation sẽ tốn tại khi rumtime
@Target(ElementType.FIELD)  // Chỉ có thể áp dụng cho các trường (Field)
public @interface JsonField{
    public String value() default "";
    //Nội dung của annotation là một chuỗi có tên là value và có giá trị mặcđịnh là một chuỗi rỗng
}