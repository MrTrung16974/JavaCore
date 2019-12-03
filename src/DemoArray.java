public class DemoArray {
    public static void main(String[] args) {
        int[] a = new int[5];
//        a[4] = 10;
//        System.out.println(a[4]);
        for(int i = 0; i <a.length; i++) {
            a[i] = i;
        }
        for(int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
        System.out.println("Sắp xếp mảng");
        int[] arr = new int[]{2,3,14,1,41,1};
        int temp = 0;
        int leng = arr.length;
        for(int i = 0; i < leng; i++) {
            for (int j = i; j < leng; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Tìm số thứ 2 của mảng");
    }
}
