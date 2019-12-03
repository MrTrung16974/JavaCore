package scope;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    nếu dung thì phương thức giông và tham só truyền vào cùng phải giống ko báo lỗi
//    @Override
//    String nên so sanh qua equals
    public boolean equals(Dog dog) {
        if(this.age == dog.age && this.name.equals(dog.name)) {
            return true;
        }
        return false;
    }

}