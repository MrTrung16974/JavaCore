package collection;

import jdk.nashorn.internal.objects.NativeUint8Array;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class collection {
    public static void main(String[] args) {
//        mảng tĩnh
//        String[] str = new String[];

//        Khái báo một mảng động có sữ liệu là String
//        khi khai báo mảng động nó sẽ ko định nghĩa kích thước
        List<String> list = new ArrayList();
        List<String> list2 = new ArrayList<String>();
        List<String> arr1 = new LinkedList<>();
//        mảng động ko được khai báo kiểu dữ liệu nguyên thủy
//        List<int> arr1 = new ArrayList();

//        CÁC PHƯƠNG THỨC

        System.out.println(list.size());
//        arr.length
//        list.add("abc");

        System.out.println(list.size());
        list.add("abc");
        list.add("hfr");
        list.add("khd");
        list.add(1, "abc");
        list2.add("ABC");
//        nối 2 mảng
        list.addAll(list2);
        list2.addAll(1, list2);


//        check xem mảng có phần tử chưa truyền vào chưa
        System.out.println("check xem mảng có phần tử chưa truyền vào chưa :"+list.contains("hfr"));
//        lấy phần từ ở vị trí ta truyền vào
        System.out.println("lấy phần từ ở vị trí ta truyền vào : "+list.get(1));

//        trả về vị trí phần tử mà ta truyền vào và nếu có hai phần tử giống nhau thì nó sẽ trả về phần tử đâu tiên nó thấy
        System.out.println(" trả về vị trí phần tử mà ta truyền vào và nếu có hai phần tử giống nhau thì nó sẽ trả về phần tử đâu tiên nó thấy : "+list.indexOf("abc"));
//        System.out.println(list.size());

//        xóa tất cả phần tử
//        list.clear();
//        kiểm tra mảng có rỗng hay ko
        System.out.println("kiểm tra mảng có rỗng hay ko : "+list.isEmpty());

//        truyền vào kiểu dữ liệu tieps truyền vào mảng ta muốn duyệt
        System.out.println("*************************");
        for (String a: list){
            System.out.println(a);
        }
        System.out.println("****************************");
//        xoa phần tử ở vị trí ta truyền vào
        System.out.println("Xóa phần tử ở vị trí ta truyền vào : "+list.remove("ABC"));
//        Sửa phần tử ở vị trí ta truyền vào
        System.out.println("Sửa phần tử ở vị trí ta truyền vào : " + list.set(0, "HFS"));

//        chuyển tử mảng động về mảng tĩnh
        System.out.println("Chuyển tử mảng động về mảng tĩnh : " + list.toArray());
        for( String item: list ) {
            System.out.println(item);
        }
        System.out.println("*******************");
        List<String> tmp = Arrays.asList("123", "456");
//      hascode là dùng để kiển kha xem dối tượng nó có phải là duy nhất hay ko
        Set<String> set = new HashSet<>();
        set.add("123");
        set.add("123");
        set.add("234");
        set.add("456");


        for (String i: set) {
            System.out.println(i);
        }
//        bảo mật co ra một mã bất kỹ
        System.out.println(tmp.get(1).hashCode());

        System.out.println("**********************");
//      tự động sắp xêp theo thứ tự tăng dần
        Set<Integer> setInteger = new TreeSet<>();
        setInteger.add(1);
        setInteger.add(4);
        setInteger.add(2);
        for (Integer i: setInteger) {
            System.out.println(i);
        }

        System.out.println("***********************");
//        json là kiể dữ liệu key value
//        Map cũng là kiểu key value
        Map<String, Integer> map = new HashMap<>();
        map.put("java", 123);
        map.put("css", 345);
        map.put("html", 657);
//        entryset nó sẽ trả về 1 set các phần tử
        System.out.println(map.entrySet());
//        khi dung foreach với hashmap thì nó sẽ ko quan tâm đến vị tri key và value nó sẽ xắp xếp lung tung
//        lấy ra các key của mảng
        System.out.println(map.keySet());
        for(String s: map.keySet()) {
            System.out.println("Key là : " + s);
            System.out.println("Value là : " + map.get(s));
        }

//        value sẽ là kiểu objcet và cũng là một mảng các integer
        Map<String,List<Integer>> map2 = new TreeMap<>();
        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(1);
        map2.put("d", listNumber);
//        muốn pus list vào ta phả tạo một list trước
        map2.put("a", listNumber);
        listNumber.add(2);
        map2.put("a", listNumber);

        for (String f: map2.keySet()) {
            System.out.println("Key là : " + f + " có giá trị là : " + map2.get(f).size());
        }
        System.out.println("******************");
        List<Integer> arr = Arrays.asList(1,2,1,1,5,2,3);
        Map<Integer, Integer> number = new HashMap<>();
        for(Integer i : arr) {
//          contaiskey check xem key có tồn tại hay chưa
//            về là ko dùng key nhưng vầ in ra được số lần suất hiện của phần tử
            if(number.containsKey(i)) {
                number.put(i, number.get(i) + 1);
            }else {
                number.put(i, 1);
            }
        }
        System.out.println("****************");
        for(Integer i : arr) {
//          contaiskey check xem key có tồn tại hay chưa
//            về là ko dùng key nhưng vầ in ra được số lần suất hiện của phần tử
            if(number.get(i) == null) {
                number.put(i, 1);
            }else {
                number.put(i, number.get(i) + 1);
            }
        }
        for(Integer key: number.keySet()) {
            System.out.println("Key là : " + key + " xuất hiện " + number.get(key) + " lần");
        }
        System.out.println("**************************");
        Queue<String> queue = new ArrayDeque<>();
        queue.add("Item 1");
        queue.add("Item 2");
//        lấy ra phần tử được thêm đầu tiên nhưng ko xóa khỏi mảng
        System.out.println(queue.peek());
        System.out.println(queue.peek());
//       lấy ra phần tử được thêm đầu tiên và xóa luôn khỏi mảng
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println("****************");
        Stack<String> stack = new Stack<>();
        stack.add("Item 1");
        stack.add("Item 2");
//        lấy được thêm vào sau trên cùng nhưng ko xóa
        System.out.println(stack.peek());
//        lấy được thêm vào sau và xóa luôn
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}
