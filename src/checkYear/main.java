package checkYear;


public class main {
    public static void main(String[] args) {
        Date date = new Date(11, 11, 2000);

        System.out.println(date.toString());
        if(date.isLeapYear(date.getYear())) {
            System.out.println("Đây là năm nhuận");
        }else {
            System.out.println("Đây ko phải là năm nhuận");
        }

    }
}

