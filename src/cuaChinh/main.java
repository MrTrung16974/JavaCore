package cuaChinh;

import DependecyInjection.Girl;

public class main {
    public static void main(String[] args) {
        student s1 = new student("trung", 170);
        student s2 = new student("nam", 205);
        student s3 = new student("thủy", 163);
        student s4 = new student("naruto", 180);
        student s5 = new student("Tiến", 210);
        door d = new door(200);
        s1.move(d.h);
        s2.move(d.h);
        s3.move(d.h);
        s4.move(d.h);
        s5.move(d.h);


    }
}
