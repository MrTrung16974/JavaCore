import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello Word");
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = a + b;
        System.out.println( "Tổng : " + c);
        //sum(100, 200);

        // cộng hai số
        System.out.println( sum(100, 200));

        // chuyển tiền
        transfer(1000, 2000, 500);

        // Kiểm tra chắn lẻ
        if(checkChanLe(3)) {
            System.out.println("Đây là số chẵn");
        }else {
            System.out.println("Đây là số lẻ");
        }
        System.out.println(checkNumber(30));
        // kiểm tra hôm nay là thứ mấy
        checkDay(3);

        // tổng các số nguyên tố từ 1 đến 100
        System.out.println("Tổng các số từ 1 đến 100 :" + sumPrime());
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static void transfer(int acountA, int acountB, int money){
        if( acountA < 0 || acountB < 0) {
            return;
        }
        if(money < 0 && money > acountA) {
            System.out.println("Bạn không đủ số tiền để chuyền!!!");
        }
        acountA -= money;
        acountB += money;
        System.out.println("Số tiền còn lại của acountA là " + acountA + "\nSố tiền còn lại của acountB là " + acountB);
    }
    public  static  boolean checkChanLe(int number) {
        if(number%2 == 0) {
            return true;
        }
        return false;

    }
    public static int checkNumber(int a) {
        if (a % 6 == 0) {
            return 6;
        }
        if(a%3 == 0) {
            return 3;
        }
        if(a%2 == 0) {
            return 2;
        }
        return a;
    }
    public static void checkDay(int day) {
        switch (day) {
            case 2:
                System.out.println("Hôm nay là thứ hai");
                break;
            case 3:
                System.out.println("Hôm nay là thứ ba");
                break;
            case 4:
                System.out.println("Hôm nay là thứ tư");
                break;
            case 5:
                System.out.println("Hôm nay là thứ năm");
                break;
            case 6:
                System.out.println("Hôm nay là hứ sáu");
                break;
            case 7:
                System.out.println("Hôm nay là thứ bảy");
                break;
            case 8:
                System.out.println("Hôm nay là chủ nhật");
                break;
            default:
                System.out.println("Không có này như vậy");
        }
    }
    public static boolean checkPrime(int number) {
        if(number <= 0) {
            return false;
        }
        if(number <= 2 ){
            return true;
        }
        for(int i = 2; i < Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int sumPrime() {
        int sum = 0;
        for(int i = 0; i <= 100; i++) {
            if(checkPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

}


