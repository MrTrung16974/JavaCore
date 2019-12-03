package cuaChinh;

public class student {
    String name;
    int hSV;

    public student(String name, int hSV) {
        this.name = name;
        this.hSV = hSV;
    }
    void move(int h) {
        if(hSV < h) {
            System.out.println(this.name + " sinh viên này có thể đi qua. " + " Chiều cao của sinh viên là : "  + this.hSV);
        }else {
            System.out.println(this.name + " sinh viên này ko thể đi qua. " + " Chiều cao của sinh viên là : " +  this.hSV);
        }
    }
}
