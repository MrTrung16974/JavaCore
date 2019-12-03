package exercise;

public class sortNumber {
    public static void main(String[] args) {
        sortNumber xx = new sortNumber();
        int[] arr =  {3,2,0,9,0,7};
        xx.sortArr(arr);
    }
    public void sortArr(int[] arr) {
        int temp = 0;
        int length = arr.length;
        for (int i = 0; i < length ; i++) {
            for (int j = i; j < length ; j++) {
                if(arr[j] == 0) {
                    continue;
                }else {
                    if (arr[i] > arr[j]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
        System.out.println("Mảng đã xắp xếp là  : ");
        for (int i = 0; i < length ; i++) {
            System.out.print(arr[i]);
        }
    }
}
