package oopAbstract;

public abstract class shape {

    protected int a;
    protected String name;

    public shape(int a, String name) {
        this.a = a;
        this.name = name;
    }
//    protected có thể sử dụng trong class và con của class đó
//    protected int a;

//    abstract method là một phương thức khi ta chưa biết phương thức đấy dùng để làm
    public abstract int area();
    public abstract void print();
}

