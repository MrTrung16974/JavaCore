package Reflection;

import java.lang.reflect.Field;

public class Main1 {
    public static void main(String[] args) throws IllegalAccessException {
        student stu = new student();
        Field[] fields = stu.getClass().getDeclaredFields();
        for (Field field: stu.getClass().getDeclaredFields()) {
            if(field.getType().getTypeName().equals("java.lang.String")) {
//                cho phép sử thuộc tính
                field.setAccessible(true);
                field.set(stu, "ConGa");
            }
        }
        for(int i = 0; i < fields.length; i++) {
            NotEmptg notEmptg = fields[i].getAnnotation(NotEmptg.class);
            if(notEmptg != null) {
                try {
                    fields[i].setAccessible(true);
                    System.out.println(String.valueOf(fields[i].get(stu)));
                    if(fields[i].get(stu) == null || String.valueOf(fields[i].get(stu)).equals("null")) {
                        System.out.println("Error");
                    }else {
                        System.out.println("No Error");
                    }
                }catch (Exception e) {
                   e.printStackTrace();
                }
            }
            System.out.println("*******************");
        }
        System.out.println(stu.toString());
    }
}
