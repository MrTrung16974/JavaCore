package EmployeeManager;

public class Programmer extends Employee {

    private int overTime;
    private int salary;

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void input() {
        System.out.printf("Lập trình viên : ");
        super.input();
        System.out.println("Mời bạn nhập số giờ làm thêm của nhân viên : ");
        overTime = intNumber();

    }
    @Override
    public int sumSalary() {
        this.salary = (int)(getBasicSalary() + overTime * 200000);
        return this.salary;
    }

    @Override
    public String toString() {
        return "Lâp trình viên : " +
                super.toString()
                + "\n Số thời gian là thêm giờ của lâp trình viên là : " + overTime + ". "
                + "\n Lương của lập trình viên là : " + salary + ". ";
    }

}
