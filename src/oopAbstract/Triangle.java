package oopAbstract;

public class Triangle extends shape {
    private int h;

    @Override
    public int area() {
        int s = (a * h)/2;
        return s;
    }

    public Triangle(int a, String name, int h) {
        super(a, name);
        this.h = h;
    }

    @Override
    public void print() {
        System.out.println("Diện tích của hình " + name + "là : " + area());
    }
    public void showAttribute() {
        System.out.println("Chiều cao là : " + a);
        System.out.println("Tền hình là : " + a);
        System.out.println("Cạch đáy  là : " + a);
    }
}
