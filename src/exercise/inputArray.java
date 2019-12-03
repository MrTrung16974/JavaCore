package exercise;

import java.util.Scanner;

public class inputArray {
    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.println("Hãy nhập chiều dài mảng : ");
        int j = nhap();
        for (int i = 0; i < j; i++) {
            System.out.print("Nhập phần tử thứ " + i + " : " );
            int n = nhap();
            arr[i] = n;
        }
        inputArray array = new inputArray();
        System.out.println("Tổng 5 phần tử đầu là : " + array.tinhTong5SoDau(arr));
        System.out.println("Tổng 5 phần tử đầu là : " + array.tinhTong5SoCuoi(arr));
        System.out.println("Tổng các phần tử lẻ trong mảng là : " + array.tinhTongCacSoLe(arr));
    }

    public static int nhap() {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            try {
                n = scanner.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Bạn phải nhập số hãy nhập lại");
                scanner.nextLine();
            }
        }
        return n;
    }
    public int tinhTong5SoDau(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i < (arr.length/2)) {
                sum += arr[i];
            }
        }
        return sum;
    }
    public int tinhTong5SoCuoi(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i >= (arr.length/2)) {
                sum += arr[i];
            }
        }
        return sum;
    }
    public int tinhTongCacSoLe(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(!(arr[i] % 2 == 0)) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
