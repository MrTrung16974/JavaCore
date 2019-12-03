package exception;

public class moneyException extends Exception {
    moneyException(String error) {
        super(error);
//        System.out.println("Lỗi ko thể trừ cho không");
    }
}
