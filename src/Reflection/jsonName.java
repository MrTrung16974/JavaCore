package Reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//tồn tại trong lúc chạy chương trình
@Retention(RetentionPolicy.RUNTIME)

//được sử dụng trên class, interface, trền biến
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})

public @interface jsonName {
    String value();
//    các giá trị trong @interface đều ở dạng abstract , không tham số
}
