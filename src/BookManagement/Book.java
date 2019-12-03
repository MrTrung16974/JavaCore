package BookManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    private int id;
    private String name;
    private float price;
    private Author author;

    @Override
    public String toString() {
        return "\nbook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author=" + author.getName() +
                '}'+ '\n';
    }


    public void inputBook() {
        List<Book> books = new ArrayList<>();
        T3hBookStore store = new T3hBookStore(books);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập ID sách : ");
        id = store.inputNumber();
        System.out.println("Mời bạn nhập tên sách : ");
        name = scanner.nextLine();
        System.out.println("Mới bạn nhập giá sách : ");
        price = store.inputNumberFloat();
        Author author1 = new Author();
        author1.inputAuthor();
        author = author1;
        System.out.println("***********************");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
