package oopAbstract;

public class main {
    public static void main(String[] args) {
        Parent parent = new Parent();
//        khi kế thừa thi
        Parent children = new Children();



        Triangle triangle = new Triangle(10,"Tam giác", 10 );
        Square square = new Square(10, "Hình Tròn");
        Circle circle = new Circle(5, "Hình Vuông");

        triangle.print();
        square.print();
        circle.print();

    }
}
