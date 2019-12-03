package BookManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Author {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String contry;
    private int age;

    public void inputAuthor() {
        List<Book> books = new ArrayList<>();
        T3hBookStore store = new T3hBookStore(books);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Thông tin tác giả: ");
        System.out.println("Mời bạn nhập tên tác giả : ");
        name = scanner.nextLine();
        System.out.println("Mời bạn nhập tên Quê hương tác giả : ");
        contry = scanner.nextLine();
        System.out.println("Mời bạn nhập tuổi của tác giả : ");
        age = store.inputNumber();
    }
}
