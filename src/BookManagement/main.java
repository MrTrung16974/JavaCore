package BookManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        Book book = new Book();
        T3hBookStore store = new T3hBookStore(books);

        int i = 0, Choice = 0;
        while (i == 0) {
            System.out.println("*********MENU************");
            System.out.println("1. Thêm Sách");
            System.out.println("2. Sửa Sách");
            System.out.println("3. Xóa Sách");
            System.out.println("4. Tìm Kiếm Sách ");
            System.out.println("5. Xắp xếp sách");
            System.out.println("6. Thoát");
            System.out.println("\n***************************");
            System.out.print("Hãy nhập vào điều mong ước của bạn Chúng tôi sẽ thực hiện mong ước đó bởi một bà tiên củ chuối or chuối cả nải nào đó :  ");
            Choice = store.inputNumber();
            switch(Choice) {
                case 1:
                    System.out.println("Nhập số sách bạn muốn thêm vào : ");
                    int n = store.inputNumber();
                    System.out.println("Sách Được thêm vào : \n" + store.addBook(n));
                    break;
                case 2:
                    if(books.isEmpty()){
                        System.out.println("Bạn cần nhập sinh viên trước mới sửa được : \n");
                        System.out.println("Nhập số sinh viên trong danh sách : ");
                        n = store.inputNumber();
                        System.out.println("Sách Được thêm vào : \n" + store.addBook(n));
                    }else {
                        System.out.println("Hãy nhập vào id sách mà bạn muốn sửa : ");
                        int j = store.inputNumber();
                        System.out.println("Hãy nhập vào tên mà bạn muôn sửa : ");
                        String name = scanner.nextLine();
                        System.out.println("Quyển sách được sửa là : \n" + store.setBook(j, name));
                    }
                    break;
                case 3:
                    if(books.isEmpty()){
                        System.out.println("Bạn cần nhập sinh viên trước mới xóa được : \n");
                        System.out.println("Nhập số sinh viên trong danh sách : ");
                        n = store.inputNumber();
                        System.out.println("Sách Được thêm vào : \n" + store.addBook(n));
                    }else {
                        System.out.println("Hãy nhập vào id sách mà bạn muốn xóa : ");
                        int id = store.inputNumber();
                        System.out.println("Danh sách sau khi bị xoa quyên sách mà bạn muốn xóa là : \n" + store.removeBook(id));
                    }
                    break;
                case 4:
                    if(books.isEmpty()){
                        System.out.println("Bạn cần nhập sinh viên trước mới tìm kiếm được : \n");
                        System.out.println("Nhập số sinh viên trong danh sách : ");
                        n = store.inputNumber();
                        System.out.println("Sách Được thêm vào : \n" + store.addBook(n));
                    }else {
                        System.out.println("Hãy nhập vào tên tác giả sách mà bạn muốn tìm kiếm : ");
                        String name = scanner.nextLine();
                        System.out.println("Quyển sách bạn muốn tìm là : \n" + store.findBookByAthor(name));
                    }
                    break;
                case 5:
                    if(books.isEmpty()){
                        System.out.println("Bạn cần nhập sinh viên trước mới xắp xếp được : \n");
                        System.out.println("Nhập số sinh viên trong danh sách : ");
                        n = store.inputNumber();
                        System.out.println("Sách Được thêm vào : \n" + store.addBook(n));
                    }else {
                        System.out.println("Danh sách sách đã được xắp xếp theo giá sách là : \n" + store.sortBook());
                    }
                    break;
                case 6:
                    i = 1;
                    System.out.println("Bạn đã thoát ra ngoài menu");
                    break;
                default:
                    System.out.println("Lựa chọn của bạn là sai lần cơ hội chỉ có 1 thôi lo mà bắt lấy đi");
                    break;
            }

        }
    }
}
