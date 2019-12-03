package BookManagement;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T3hBookStore {
    Scanner scanner = new Scanner(System.in);
    private static String name= "T3h Book Store";
    List<Book> bookList = new ArrayList<>();


    //    thêm dách vào kho sách
    public List<Book> addBook(int n) {
        for (int i = 0; i < n; i++) {
            Book book = new Book();
            System.out.println("Quyển sách thứ "  + (i+1) + " : ");
            book.inputBook();
            this.bookList.add(book);
        }
        return this.bookList;
    }

//    contructor
    public T3hBookStore(List<Book> bookList) {
        this.bookList = bookList;
    }

//    nhâp number
    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean check = false;
        while (!check) {
            try{
                n = scanner.nextInt();
                check = true;
            }catch (Exception e) {
                System.out.println("Bạn phải nhập số hãy nhập lại !");
                scanner.nextLine();
            }

        }
        return n;
    }

    public float inputNumberFloat() {
        Scanner scanner = new Scanner(System.in);
        float n = 0;
        boolean check = false;
        while (!check) {
            try{
                n = scanner.nextFloat();
                check = true;
            }catch (Exception e) {
                System.out.println("Bạn phải nhập số hãy nhập lại !");
                scanner.nextLine();
            }

        }
        return n;
    }

    //    sửa sách
    public  List<Book> setBook(int id, String name) {
        List<Book> listBook = new ArrayList<>();
        for(Book b : this.bookList ) {
            if(b.getId() == id) {
                b.setName(name);
                listBook.add(b);
            }
        }
        return listBook;
    }

//    xóa sách
    public  List<Book> removeBook(int id) {
        List<Book> listBook = new ArrayList<>();
        for(Book b : this.bookList ) {
            listBook.add(b);
            if ((int)b.getId() == (int)id) {
                listBook.remove(b);
            }
        }
        return listBook;
    }
    //    tìm kiếm sách theo tên tác giả
    public List<Book> findBookByAthor(String namAuthor) {
        List<Book> listSeach = new ArrayList<>();
        for (Book b : this.bookList) {
            if(b.getAuthor().getName().toUpperCase().equals(namAuthor.toUpperCase())) {
                listSeach.add(b);
            }
        }
        return listSeach;
    }

//    xắp sếp sách theo thứ tự giá bán
    public List<Book> sortBook() {
        List<Book> listBook = new ArrayList<>();
        for(Book b : this.bookList ) {
            listBook.add(b);
        }
        for (int i = 0; i < listBook.size(); i++) {
            for (int j = 0; j < listBook.size(); j++) {
                if((int)listBook.get(i).getPrice() < (int)listBook.get(j).getPrice()) {
                    Object temp = listBook.get(i);
                    listBook.set(i, listBook.get(j));
                    listBook.set(j, (Book) temp);

                }
            }
        }
        return listBook;
    }

//    in ra mảng
    public void printListBook() {
        for (Book b : this.bookList) {
            System.out.println(b.toString());
        }
    }


}
