import java.util.Scanner;

public class review {
    public static void main(String[] args) {
        System.out.println("Nhập hai số là :");
        int a = checkNumber();
        int b = checkNumber();
//        tìm số lớn nhất trong hai số
        System.out.println("Số lớn nhất trong hai số là :  " + testSLN(a, b));
//        tìm số thứ 2 của mảng
        System.out.println("Số lớn thứ hai của mảng là : " + check1SLN2(new int[]{32, 13, 121, 421, 1}));
        System.out.println("Số lớn thứ hai của mảng là : " + check2SLN2(new int[]{32, 13, 121, 421, 1}));
        System.out.println("Số lớn thứ hai của mảng là : " + check3SLN2(new int[]{32, 13, 121, 421, 1}));
    }
    public static int checkNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            try {
                n = scanner.nextInt();
                check =  true;
            }catch (Exception e) {
                System.out.println("Bạn phải nhập số ....");
                scanner.nextLine();
            }
        }
        return n;
    }
    public static int testSLN(int a, int b) {
        if(a < b) {
            return b;
        }else {
            return a;
        }
    }
    public static  int check1SLN2(int[] arr) {
        int temp = 0;
        int leng = arr.length;
        for(int i = 0; i < leng; i++) {
            for(int j = i; j < leng; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr[leng-2];
    }
    public static  int check2SLN2(int[] arr) {
        int max = 0;
        int max2 = 0;
        int leng = arr.length;
        for(int i = 0; i < leng; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i = 0; i < leng; i++){
            if(max == arr[i]){
                continue;
            }else if(max2 < arr[i]) {
                max2 = arr[i];
            }
        }
        return max2;
    }
    public static  int check3SLN2(int[] arr) {
        int max = 0;
        int max2 = 0;
        int leng = arr.length;
        for(int i = 0; i < leng; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i = 0; i < leng; i++){
            if(max2 < arr[i] && arr[i] != max){
                max2 = arr[i];
            }
        }
        return max2;
    }
}
