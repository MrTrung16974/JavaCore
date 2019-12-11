package electricBillManager;

public class main {
    public static void main(String[] args) {
        int numberCustomerVN = 3, numberCustomerNG, sumAmountVN = 0, sumAmountNG = 0, mediumPrice = 0, totalPrice = 0;
        Customer customer = new Customer();
        System.out.print("Mời bạn nhập số khách hàng việt nam :  ");
        numberCustomerVN = customer.intNumber();
        System.out.println(numberCustomerVN);
        Customer[] customerVietnamese = new Customer[numberCustomerVN];
        for(int i = 0; i < numberCustomerVN; i++) {
            System.out.println("*************************************");
            System.out.println("Nhập khách hàng việt nam thứ " + (i + 1) + " : ");
            customerVietnamese[i] = new CustomerVietnamese();
            customerVietnamese[i].input();
        }
        System.out.print("Mời bạn nhập số khách hàng Nước ngoài :  ");
        numberCustomerNG = customer.intNumber();
        Customer[] customerForeing = new Customer[numberCustomerNG];
        for(int i = 0; i < numberCustomerNG; i++) {
            System.out.println("*************************************");
            System.out.println("Nhập khách hàng nước ngoài thứ thứ " + (i + 1) + " : ");
            customerForeing[i] = new CustomerForeign();
            customerForeing[i].input();
        }
        System.out.println("**********************************************************");
        System.out.print("Tổng số lượng KW tiêu thụ của khác hàng nước ngoài là : ");
        for(int i = 0; i < numberCustomerNG; i++ ) {
            System.out.print(sumAmountVN += customerForeing[i].sumAmount());
        }
        System.out.println();
        System.out.print("Tổng số lượng KW tiêu thụ của khách hành việt nam là : " );
        for(int i = 0; i < numberCustomerVN; i++ ) {
            System.out.print(sumAmountNG += customerVietnamese[i].sumAmount());
        }
        System.out.println();
        System.out.println("**************************************************************");
        System.out.println("Thông tin của tất cả các khách hàng là : ");
        for(int i = 0; i <  numberCustomerNG; i++) {
            System.out.println();
            System.out.println("Khách hàng thứ " +  (i + 1) + " : ");
            System.out.println(customerForeing[i].toString());
        }
        for(int i = 0; i <  numberCustomerVN; i++) {
            System.out.println();
            System.out.println("Khách hàng thứ " +  (i + 1) + " : ");
            System.out.println(customerVietnamese[i].toString());
        }
        System.out.println("\n***********************************************************");
        System.out.println("Trung binh tiền của khách hàng nước ngoài là : ");
        for(int i = 0; i < numberCustomerNG; i++) {
            totalPrice += customerForeing[i].sumPrice();
        }
        System.out.print( mediumPrice = totalPrice / (numberCustomerNG + numberCustomerVN));
        System.out.println();
        System.out.println("**********************************************************s");
        System.out.printf("Xuất ra hóa đơn của các khác hàng trong tháng 09 năm 2013 là : ");
        for (int i = 0; i < numberCustomerVN; i++) {
            if(customerVietnamese[i].getMonth() == 9 && customerVietnamese[i].getYear() == 2013) {
                customerVietnamese[i].toString();
            }
        }
        for (int i = 0; i < numberCustomerNG; i++) {
            if(customerForeing[i].getMonth() == 9 && customerForeing[i].getYear() == 2013) {
                customerForeing[i].toString();
            }
        }
    }

}
