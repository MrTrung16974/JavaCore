package Reflection;

public class student {
    @NotEmptg
    private String Fristname;
    @NotEmptg
    private String Lastname;
    private int age;
    public student() {

    }
    public student(String fristname, String lastname, int age) {
        Fristname = fristname;
        Lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "Fristname='" + Fristname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFristname() {
        return Fristname;
    }

    public void setFristname(String fristname) {
        Fristname = fristname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

