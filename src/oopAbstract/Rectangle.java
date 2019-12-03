package oopAbstract;

public class Rectangle extends shape implements caculate, Test{
    public Rectangle(int a, String name) {
        super(a, name);
    }

    @Override
    public int area() {
        return 0;
    }

    @Override
    public void print() {
        System.out.println("Diện tích của hình " + name + "là : " + area());
    }
}
