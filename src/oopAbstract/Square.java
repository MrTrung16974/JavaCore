package oopAbstract;

public class Square extends shape {

    @Override
    public int area() {
        int s = a*a;
        return s;
    }

    public Square(int a, String name) {
        super(a, name);
    }

    @Override
    public void print() {
        System.out.println("Diện tích của hình " + name + "là : " + area());
    }


}
