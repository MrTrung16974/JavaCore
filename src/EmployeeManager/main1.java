//package electricBillManager;
//
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//        int numberCustomerVN = 0, numberCustomerNG = 0, sumAmount = 0, mediumPrice = 0, totalPrice = 0;
//        Customer customer = new Customer();
//        System.out.print("Mời bạn nhập số khách hàng việt nam :  ");
//        numberCustomerVN = customer.intNumber();
//        System.out.print("Mời bạn nhập số khách hàng nước ngoài :  ");
//        numberCustomerNG = customer.intNumber();;
//        Customer[] customerVietnamese = new Customer[numberCustomerVN];
//        Customer[] customerForeing = new Customer[numberCustomerNG];
//
//        for(int i = 0; i < numberCustomerNG + numberCustomerVN; i++) {
//            System.out.println("Nhập khách hàng thứ " + i+1 + " : ");
//            System.out.println("Chọn loại khách hàng 1(Khách hàng việt nam ), 2(khách hàng nước ngoài) : ");
//            int choose = customer.intNumber();
//            if(choose == 1) {
//                customerVietnamese[i] = new CustomerVietnamese();
//                customerVietnamese[i].input();
//            }else if(choose == 2) {
//                customerForeing[i] = new CustomerForeign();
//                customerForeing[i].input();
//            }else {
//                System.out.println("Ko có loại nhân viên mà bạn muốn lựa chọn");
//            }
//        }
//        System.out.println("Tổng số lượng KW tiêu thụ của khác hàng nước ngoài là : ");
//        for(int i = 0; i < numberCustomerNG; i++ ) {
//            System.out.println(sumAmount += customerForeing[i].sumAmount());
//        }
//        System.out.println("Tổng số lượng KW tiêu thụ của khách hành việt nam là : " );
//        for(int i = 0; i < numberCustomerVN; i++ ) {
//            System.out.println(sumAmount += customerVietnamese[i].sumAmount());
//        }
//        System.out.println("**************************************************************");
//        System.out.println("Thông tin của tất cả các khách hàng là : ");
//        for(int i = 0; i <  numberCustomerVN + numberCustomerNG; i++) {
//            System.out.println("*********************");
//            System.out.println("Khách hàng thứ " +  (i + 1) + " : ");
//            System.out.println(customerForeing[i].toString());
//            System.out.println("Khác hàng thứ " + (i + 2) + " : ");
//            System.out.println(customerVietnamese[i].toString());
//        }
//        System.out.println("\n***********************************************************");
//        System.out.println("Trung binh tiền của khách hàng nước ngoài là : ");
//        for(int i = 0; i < numberCustomerNG; i++) {
//            totalPrice += customerForeing[i].sumPrice();
//        }
//        System.out.println( mediumPrice = totalPrice / (numberCustomerNG+ numberCustomerVN));
//
//        System.out.println("**********************************************************s");
//        System.out.printf("Xuất ra hóa đơn của các khác hàng trong tháng 09 năm 2013 là : ");
//        for (int i = 0; i < numberCustomerNG + numberCustomerVN; i++) {
//            if(customerForeing[i].getMonth() == 9 && customerForeing[i].getYear() == 2013) {
//                customerForeing[i].toString();
//            }
//            if(customerVietnamese[i].getMonth() == 9 && customerVietnamese[i].getYear() == 2013) {
//                customerVietnamese[i].toString();
//            }
//        }
//    }
//
//}
