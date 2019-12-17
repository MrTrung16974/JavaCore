package overWriteElectBillManager;

import java.util.List;

public class Repository {
    private List<BillVietNam> billVietNamsList;
    private List<BillForeign> billForeignsList;

    public Repository() {}
    public Repository(List<BillVietNam> billVietNams, List<BillForeign> billForeigns) {
        this.billVietNamsList = billVietNams;
        this.billForeignsList = billForeigns;
    }
    public void subBill() {
        System.out.println("Số lượng hóa đơn tiền điện ở việt nam là : "  + this.billVietNamsList.size());
        System.out.println("Số lượng hóa đơn tiền điện ở Nước ngoài là : " +  this.billForeignsList.size());
    }

    public void sumForeign() {
        float sum = 0;
        for(BillForeign foreign : billForeignsList) {
            sum += foreign.pay();
        }
         sum = sum / this.billForeignsList.size();
        System.out.println("Tổng số tiền trung bình khách hàng nước ngoài là : " + sum);
    }

    public void sumVienNam() {
        float sum = 0;
        for(BillVietNam vietNam : billVietNamsList) {
            sum += vietNam.pay();
        }
        sum = sum / this.billVietNamsList.size();
                System.out.println("Tổng số tiền trung bình khách hàng việt nam là : " + sum);
    }
    public List<BillVietNam> getBillVietNamsList() {
        return billVietNamsList;
    }

    public void setBillVietNamsList(List<BillVietNam> billVietNamsList) {
        this.billVietNamsList = billVietNamsList;
    }

    public List<BillForeign> getBillForeignsList() {
        return billForeignsList;
    }

    public void setBillForeignsList(List<BillForeign> billForeignsList) {
        this.billForeignsList = billForeignsList;
    }
}
