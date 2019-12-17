package electricBillManager;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Repository {
    private List<BillForeign> listBillForeing;
    private List<BillVietnamese> listBillVienNam;
    public Repository() {

    }
    public Repository(List<BillForeign> listBillForeing, List<BillVietnamese> listBillVienNam) {
        this.listBillForeing = listBillForeing;
        this.listBillVienNam = listBillVienNam;
    }

    public List<BillForeign> getListBillForeing() {
        return listBillForeing;
    }

    public void setListBillForeing(List<BillForeign> listBillForeing) {
        this.listBillForeing = listBillForeing;
    }

    public List<BillVietnamese> getListBillVienNam() {
        return listBillVienNam;
    }

    public void setListBillVienNam(List<BillVietnamese> listBillVienNam) {
        this.listBillVienNam = listBillVienNam;
    }

    public void numberUnit() {
        System.out.println("Số lượng hóa đơn khách nước ngoài là : " + this.listBillForeing.size());
        System.out.println("Số lượng hóa đơn khách việt nam là : " + this.listBillVienNam.size());
    }

    public void averagePayFG() {
        float sum = 0;
        for(BillForeign foreign : listBillForeing) {
            sum += foreign.sumPrice();
        }
        sum /=  this.listBillForeing.size();
        System.out.println("Số tiền trung bình của khách hàng nước ngoài là : " + sum);
    }

    public void findCustomer(int month, int year) {
        System.out.println("Số hóa đơn trong tháng " + month + " năm " + year + " là : ");
        for (BillForeign foreign: listBillForeing){
            if(foreign.getDate().getMonth() == month && foreign.getDate().getYear() == year) {
                System.out.println("\n " + foreign.toString());
            }
        }
        for(BillVietnamese vietnamese : listBillVienNam) {
            if(vietnamese.getDate().getMonth() == month && vietnamese.getDate().getYear() == year) {
                System.out.println("\n " + vietnamese.toString());
            }
        }
    }

}
