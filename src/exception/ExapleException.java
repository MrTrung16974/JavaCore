package exception;

public class ExapleException  {
    public static void main(String[] args) {
        int a = 5;
//        chưa đoạn code có nguy cơ lỗi
//        try catch có thể bỏ qua 1 trong 2 finally hoặc catch
//        có thể băt nhiều lỗi
//        nhưng exception thủy tổ phải để ở cuỗi
        try {
            System.out.println("Bắt đầu thực hiện phép chia");
            String b = null;
            System.out.println(b.length());
            System.out.println("Kết quả của phép chia là : " + a / 0);
        }
        catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Không thể đo độ dài của biến vì ko có giá trị gì");
            System.out.println("Lỗi null Pointer");
        }
//        câu lênh thực thi khi lỗi xảy ra
        catch (Exception e) {
//            hiện thị lỗi nào và ở đâu
            e.printStackTrace();
            System.out.println("Bạn không thể chia cho không");
        }
//        câu lênh dù lỗi hay ko vẫn thực thì
//        thường dùng khi open file nếu ko thoát ra thì tốn ram
        finally {
            System.out.println("Luôn luôn thực hiện");
        }
        System.out.println("Good job");
//        trong vòng lặp for có thể bỏ qua tất cả biểu thức
        for(; ;) {
            int i = 0;
            if(i < 10) {
                break;
            }
            System.out.println(i++);
        }

        System.out.println("******************************");

        int acount1 = 5000;
        int acount2 = 3000;
        int chuyen = 8000;
        try {
            if(acount1 <= 0 || acount1 < chuyen || chuyen < 0) {
                throw new moneyException("Số tiền ko hợp lệ");
            }
            acount1 -= chuyen;
            acount2 += chuyen;
        }
        catch (moneyException moneyException) {
            moneyException.printStackTrace();
            System.out.println("Bạn không thể chuyển đi số tiền lớn hơn số tiền trong tài khoản bạn!");
        }
        catch (Exception e) {
            System.out.println("Gõ ngáo vcl ko có lỗi này mà vẫn ép ra được giỏi");
        }finally {
            System.out.println("Số tiền của của acount 1 là : " + acount1);
            System.out.println("Số tiền của của acount 2 là : " + acount2);
            System.out.println("Số tiền chuyển đi là : " + chuyen);
        }

    }
}
