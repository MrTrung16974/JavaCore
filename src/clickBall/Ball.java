package clickBall;

public class Ball {
    int m;
    int distance;

//    phương thức
    int move(int f) {
//        s là khoản các
        int s = f * m;
        this.distance += s;
        return distance;
    }
//    khởi tạo giá trị mặc định của m và distance
    Ball(int m, int distance) {
        this.m = m;
        this.distance = distance;
    }
//    void moveAnother(int f) {
//        int s = f * m;
//        this.distance += s;
//        System.out.println("Khoản cách hiện tại là : " + this.distance);
//    }
}
