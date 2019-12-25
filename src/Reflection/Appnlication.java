package Reflection;

import java.lang.reflect.Field;

public class Appnlication {
    public static void main(String[] args) {
        Employee employee = new Employee("aaaaaaaaaaaaa","áiuhiusahduha");
        Field[] fields = employee.getClass().getDeclaredFields();
        for(int i = 0; i < fields.length; i++) {
            Normalizer normalizer = fields[i].getAnnotation(Normalizer.class);
            if(normalizer != null) {
                try{
                    fields[i].setAccessible(true);
//                    lấy giá trị của thuộc tính name
                    if(fields[i].get(employee) != null) {
                        fields[i].set(employee, String.valueOf(fields[i].get(employee)).replaceAll("[^A-Za-z0-9]",""));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
