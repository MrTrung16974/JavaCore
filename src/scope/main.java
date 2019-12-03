package scope;

public class main {
    public static void main(String[] args) {
        Superman superman = new Superman();
        System.out.println(superman.name);
        System.out.println(Superman.address);
        System.out.println();

//        khi khơi tao qua dấu bằng
//        khi khởi tạo string thì sẽ tạo một một vùng nhớ trong bộ nhớ Stringpuer
        String abc = "123";
//        nếu khơi tạo một chuỗi nó sẽ kiểm tra xem trong bộ nhớ heap thì sẽ ko khợi tạo lại nữa chỉ trỏ đến
        String def = "123";
//        khi khợi tạo đối tượng với từ khóa new se lưu trong bộ nhớ heap
        String hjk = new String("123");
//        nó kiểm tra cả nội dung và vị trí ô nhớ của đối tượng
        System.out.println(abc == def);
        System.out.println(abc == hjk);

//        bỏ qua địa chỉ ô nhớ chỉ kiểm tra giá trị của đối tượng
//        equals là một phương thức bắt nguồn từ object để so sánh hai đối tượng với nhau
        System.out.println(abc.equals(def));
        System.out.println(abc.equals(hjk));


        Integer number1 = 10;
        int number2 = 10;
        Integer number3 = new Integer(10);

        System.out.println(number2 == number3);
        System.out.println(number2 == number1);
        System.out.println(number1 == number3);

        System.out.println("___________________");

        Dog dog1 = new Dog("Shiba", 10);
        Dog dog2 = new Dog("Shiba", 10);

        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));

        int[] arr1 = {5,4,3,2,1};
        int[] arr2 = {6,7,10,8,9};
        int length = arr1.length + arr2.length;
        int[] arr3 = new int[arr1.length + arr2.length];
        for(int i = 0; i < length ; i++) {
            if(i < arr1.length) {
                arr3[i] = arr1[i];
            }else {
                arr3[i] = arr2[i - arr1.length];
            }
        }
        for (int i = 0; i < arr3.length ; i++) {
            for (int j = 0; j < arr3.length ; j++) {
                if(arr3[i] < arr3[j]) {
                    int temp = arr3[j];
                    arr3[j] = arr3[i];
                    arr3[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr3.length ; i++) {
            System.out.println("Number : " + arr3[i]);

        }
    }
}
