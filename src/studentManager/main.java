//package studentManager;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class main {
//    ArrayList<student> arrSV = new ArrayList<>();
//    Scanner scanner = new Scanner(System.in);
//    public void sortListSV (ArrayList<student> arrSV) {
//        int sise = arrSV.size();
//        for(int i = 0; i < sise; i++) {
//            for(int j = 0; j < sise; j++) {
//                if(arrSV.get(i).getPoint() < arrSV.get(j).getPoint()) {
//                    student sv = new student();
//                    sv = arrSV.get(i);
//                    arrSV.set(i, arrSV.get(j));
//                    arrSV.set(j, sv);
//                }
//            }
//        }
//    }
//    public void showListSV(ArrayList<student> arrSV) {
//        int sise = arrSV.size();
//        for (int i = 0; i < sise; i++) {
//            arrSV.get(i).outputInfoSV();
//        }
//    }
//    public void inputListSV(int n) {
//       for (int i = 0; i < n; i++) {
//           System.out.println("Mời bạn nhập sinh viên : " + (i+1));
//           student sv = new student();
//           sv.inputInfoSV();
//           arrSV.add(sv);
//           System.out.println("**************************************");
//       }
//    }
//    public void searchSV(ArrayList<student> arrSV, String name) {
//        int sise = arrSV.size();
//        int j = 0;
//        for (int i = 0; i < sise; i++) {
//            if(arrSV.get(i).getName().lastIndexOf(name) >= 0) {
//                arrSV.get(i).outputInfoSV();
//                j = 1;
//            }
//        }
//        if(j == 1) {
//            System.out.println("Không tìm thấy sinh viên trong danh sách");
//        }
//    }
//    public void correctSV(ArrayList<student> arrSV) {
//        student sv = new student();
//        System.out.println("Hãy nhập sinh viên mà bạn muốn sửa");
//        String nameSV = scanner.nextLine();
//        int size = arrSV.size();
//        int j = 0;
//        for (int i = 0; i < size; i++) {
//            if (arrSV.get(i).getName().lastIndexOf(name) >= 0) {
//                System.out.println("1. Sửa mã SV");
//                System.out.println("2. Sửa tên SV");
//                System.out.println("3. Sửa năm sinh SV");
//                System.out.println("4. Sửa địa chỉ SV");
//                System.out.println("5. Sửa điểm SV \n");
//
//                System.out.println("Hãy nhập thông tin mà bạn muốn sửa");
//                int fixWhat = scanner.nextInt();
//                switch (fixWhat) {
//                    case 1:
//                        int Id = scanner.nextInt();
//                        sv.setId(Id);
//                        break;
//                    case 2:
//                        String name = scanner.nextLine();
//                        sv.setName(name);
//                        break;
//                    case 3:
//                        int year = scanner.nextInt();
//                        sv.setYear(year);
//                        break;
//                    case 4:
//                        String address = scanner.nextLine();
//                        sv.setAddress(address);
//                        break;
//                    case 5:
//                        int point = scanner.nextInt();
//                        sv.setPoint(point);
//                        break;
//                    default:
//                        System.out.println("Thông tin bạn muốn sửa ko có trong danh sách");
//                        break;
//                }
//            }
//            if (j == 1) {
//                System.out.println("Không tìm thấy sinh viên trong danh sách");
//            }
//        }
//    }
//    public int nhapNumber() {
//        Scanner scanner = new Scanner(System.in);
//        boolean check = false;
//        int n = 0;
//        while (!check) {
//            try {
//                n = scanner.nextInt();
//                check = true;
//            }catch (Exception e) {
//                System.out.println("Bạn phải nhập số hãy nhập lại: ");
//                scanner.nextLine();
//            }
//        }
//        return n;
//    }
//    public static void main(String[] args) {
//        main QLSV = new main();
//        int lua_chon = 0, i = 0;
//        while (i == 0) {
//            System.out.println("***************Menu*********************");
//            System.out.println("1. Nhập danh sách sinh viên");
//            System.out.println("2. Hiện thị thông tin sinh viên");
//            System.out.println("3. Xắp xếp danh sách sinh viên");
//            System.out.println("4. Tìm kiếm sinh viên");
//            System.out.println("5. Thoát \n");
//
//            System.out.println("1. Nhập lựa chọn của bạn : ");
//            lua_chon = QLSV.nhapNumber();
//            switch (lua_chon) {
//                case 1:
//                    System.out.print("Bạn hãy nhập số sinh viên trong dang sách : ");
//                    int n = QLSV.nhapNumber();
//                    QLSV.inputListSV(n);
//                    break;
//                case 2:
//                    if(QLSV.arrSV.isEmpty()) {
//                        System.out.println("Bạn chưa nhập thông tin sinh viên: ");
//                        System.out.print("Bạn hãy nhập số sinh viên trong dang sách : ");
//                        n = QLSV.nhapNumber();
//                        QLSV.inputListSV(n);
//                    }
//                    QLSV.showListSV(QLSV.arrSV);
//                    break;
//                case 3:
//                    if(QLSV.arrSV.isEmpty()) {
//                        System.out.println("Bạn chưa nhập thông tin sinh viên: ");
//                        System.out.print("Bạn hãy nhập số sinh viên trong dang sách : ");
//                        n = QLSV.nhapNumber();
//                        QLSV.inputListSV(n);
//                    }
//                    QLSV.sortListSV(QLSV.arrSV);
//                    System.out.println("*********************************");
//                    QLSV.showListSV(QLSV.arrSV);
//                    break;
//                case 4:
//                    if(QLSV.arrSV.isEmpty()) {
//                        System.out.println("Bạn chưa nhập thông tin sinh viên: ");
//                        System.out.print("Bạn hãy nhập số sinh viên trong dang sách : ");
//                        n = QLSV.nhapNumber();
//                        QLSV.inputListSV(n);
//                    }
//                    System.out.println("Mời bạn nhập tên sinh viên cần tìm : ");
//                    String name = QLSV.scanner.nextLine();
//                    QLSV.searchSV(QLSV.arrSV, name);
//                    break;
//                case 5:
//                    i = 1;
//                    System.out.println("Bạn đã thoát ra menu");
//                    break;
//                default:
//                    System.out.println("Lựa chọn của bạn ko tồn tại");
//                    break;
//            }
//
//        }
//    }
//
