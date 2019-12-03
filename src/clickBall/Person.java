package clickBall;

public class Person {
    int f;

    public Person(int f) {
        this.f = f;
    }

    void kick(Ball ball) {
        System.out.println("Vị trí sau khi sút là : " + ball.move(f));
    }
}
