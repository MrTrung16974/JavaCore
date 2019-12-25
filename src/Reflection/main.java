package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws Exception {
//        lấy ra contructor
        Class<Girl> girlClass = Girl.class;

        System.out.println("Class " + girlClass.getConstructor());
        try {
//            tạo một object từ class girl (không khỏi tạo thám só)
            Girl girl1 = girlClass.newInstance();
            System.out.println("Girl1 là : " + girl1);

//            lấy ra hàm contrucstor với tham số là 1 string
//            chính là -> public Girl(String name) {}
            Constructor<Girl> girlConstructor = girlClass.getConstructor(String.class);
            Girl girl2 = girlConstructor.newInstance("Hello");

            System.out.println("Girl2 là : " + girl2);
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("******************************");
        Class<Girl> girlClass1 = Girl.class;
//      Lấy ra Method
        Method[] methods = girlClass1.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println();
            System.out.println("Method : " + method.getName());
            System.out.println("Paramaters : " + Arrays.toString(method.getParameters()));
        }

//        lấy ra method tên là setName và truyền vào 1 tham só
        Method methodSetName = girlClass1.getMethod("setAddress", String.class);

        Girl girl3 = new Girl();
//        Thực hiện hàm getName() và truyền vào 1 tham số "Ngọc trinh"
        methodSetName.invoke(girl3, "Dương Mịch");
        System.out.println(girl3);

        System.out.println("******************************");
//        getClass là lấy ra cả 1 class Girl
//        getDeclaredFields là trả về tất cả các thuộc tích của class mà ta đã khai báo
//        Và nó trả về 1 List<Field> các thuộc tính
//        Lấy ra thuộc tính
        Girl girl = new Girl();
        girl.setName("Ngọc Trinh");

        for (Field field: girl.getClass().getDeclaredFields()) {
            if(field.getType().getTypeName().equals("java.lang.String")) {
                //        cho phép truy câp và sử các giá trị (kể cả khi nó là private)
                field.setAccessible(true);

                //        thay giá trị cho 'girl'
                field.set(girl, "Ngọc Trinh");
//                in ra giá trị của các thuộc tính trong girl
                System.out.println(girl);
            }
//            System.out.println();
////           trả về tên của thuộc tính
//            System.out.println("Field : " + field.getName());
////            trả về kiểu dữ liệu của thuộc tính
//            System.out.println("Type : " + field.getType());
        }

//        Field nameField = girl.getClass().getDeclaredField("name");
////        cho phép truy câp và sử các giá trị (kể cả khi nó là private)
//        nameField.setAccessible(true);
//
////        thay giá trị cho 'girl'
//        nameField.set(girl, "Balla");
//
//        System.out.println(girl.toString());
    }
}
