package overWriteElectBillManager;

import checkYear.Date;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Customer customer = new Customer("Sinh Hoạt",50, 30000.0f, 200);
        Date d = new Date(1, 2, 2019);
        BillVietNam vn1 = new BillVietNam("1", "Heo Mập", d ,customer );
        BillForeign ng1 = new BillForeign("2", "Heo Xinh", new Date(2,
                9, 2013), "UK" , 150, 4000);
        BillVietNam vn2 = new BillVietNam("3", "Heo Béo", d ,customer );
        BillForeign ng2 = new BillForeign("4", "Heo Đẹp", new Date(2,
                9, 2013), "US" , 100, 4000);
        //        tạo kho
        Repository repository = new Repository();
        //        lấy ra danh sách bill trong kho
        List<BillVietNam> billVietNamsList =  new ArrayList<>();
        List<BillForeign> billForeignsList =  new ArrayList<>();

//        thêm các hóa đơn vào danh sách
        billVietNamsList.add(vn1);
        billForeignsList.add(ng1);
        billVietNamsList.add(vn2);
        billForeignsList.add(ng2);
//        đặt lại vào trong kho
        repository.setBillVietNamsList(billVietNamsList);
        repository.setBillForeignsList(billForeignsList);

//        in ra cách hóa đơn
        System.out.println("Hóa đơn Việt Nam: ");
        for (BillVietNam vietNam : repository.getBillVietNamsList()) {
            System.out.println("Hóa đơn : ");
            System.out.println(vietNam.toString());
        }
        System.out.println("Hóa đơn nước ngoài: ");
        for (BillForeign foreign : repository.getBillForeignsList()) {
            System.out.println("Hóa đơn : ");
            System.out.println(foreign.toString());
        }
        System.out.println("*************************************************************");

//        tông hóa đơn của từng loại khách hàng
        repository.subBill();

        System.out.println("**************************************************************");
//        tổng số tiền trung bình của từng khách nước ngoài
        repository.sumForeign();
        repository.sumVienNam();
        System.out.println("*************************************************************");
        for (BillVietNam vietNam : billVietNamsList) {
            if(vietNam.getDate().getMonth() == 9 && vietNam.getDate().getYear() == 2013) {
                System.out.println(vietNam.toString());
            }
        }
        for (BillForeign foreign : billForeignsList) {
            if(foreign.getDate().getMonth() == 9 && foreign.getDate().getYear() == 2013) {
                System.out.println(foreign.toString());
            }
        }

    }
}
