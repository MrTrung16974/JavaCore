package EmployeeManager;

public class Proofeader extends Employee {
    private int numberErrors;
    private int salary;

    public int getNumberErrors() {
        return numberErrors;
    }

    public void setNumberErrors(int numberErrors) {
        this.numberErrors = numberErrors;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void input(){
        System.out.println("Kiểm chứng viên : ");
        super.input();
        System.out.println("Mời bạn nhập số lỗi mà kiểm soát viên phát hiên được : ");
        numberErrors = intNumber();
    }

    @Override
    public int sumSalary() {
        return (int) (getBasicSalary() + numberErrors * 50000);
    }

    @Override
    public String toString() {
        return "Kiểm chứng viên : " +
                super.toString()
            + "\n Lương của kiểm chứng viên là : " + salary + ". " +
            "\n Số lỗi của nhận kiểm soát viên tìm được là : " + numberErrors + ". ";
    }


}
