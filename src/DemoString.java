public class DemoString {
    public static void main(String[] args) {
        String str = "Nguyễn Tiến Trung";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        str = "Đây là đoạn văn thứ 2";
        System.out.println(str);
        String test = "Nguyễn Tiến Trung";
        String TestB = "Nguyễn Tiến Trung";
        String TestC = "abc";
//        lấy kí tự ở vị trí index truyền vào
//
        System.out.println();
//      Nối chuỗi
        System.out.println(str.concat(" Hello"));
//
        System.out.println(str.length() + "-" + test.length());
        System.out.println(str.compareTo(test));
        System.out.println(str.length());
        System.out.println(test.compareTo(str));
        System.out.println(TestC.length() + "-" + TestB.length());
        System.out.println(TestC.compareTo(TestB));
//      kiểm tra chuỗi có tồn tại ký tự truyền vào ko trả về boolead
        System.out.println(str.contains("h"));
//
        System.out.println(str.equals("Đây là đoạn văn thư 2"));

//        String a = "abcd";
//        System.out.println(a.length());
//        System.out.println(a.charAt(0));

//        kiểm tra user
        System.out.println(checkUser("hoanghiep8921"));
        if(checkUser("hoanghiep8921")) {
            System.out.println("Bạn đăng nhập thành công");
        }else {
            System.out.println("Bạn nhập sai tài khoản hoặc Mk");
        }

        System.out.println("Kí tự xuất hiện nhiều nhất trong chuỗi là : " + testString("bbcbcaaaa"));
    }
    public static char testString(String str) {
        int max = 0;
        char c = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for(int j = i; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if(count > max) {
                max = count;
                c = str.charAt(i);
            }
        }
        return c;
    }
    public static boolean checkUser(String str) {
        String acount = new String("HoangHiep8921");
        if(acount.toUpperCase().equals(str.toUpperCase())) {
            return true;
        }
        return false;
    }

}
