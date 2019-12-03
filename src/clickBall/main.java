package clickBall;

public class main {
    public static void main(String[] args) {
        Ball ball = new Ball(3, 0);

//        System.out.println("Giá trị của m là : " + ball.m);
//        System.out.println("Giá trị của distance là : " + ball.distance);

        Person person = new Person(10);

        person.kick(ball);
        person.kick(ball);
    }

}
