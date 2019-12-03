package oopAbstract;

public class Circle extends shape{

    @Override
    public int area() {
        int s = (int) (Math.PI * a*a);
        return s;
    }

    public Circle(int a, String name) {
        super(a, name);
    }

    @Override
    public void print() {
        System.out.println("Diện tích của hình " + name + "là : " + area());
    }
}
