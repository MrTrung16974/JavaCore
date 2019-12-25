package Reflection;

public class Girl {
    private String Name;
    private String Address;
    private String FirstName;
    private String LastName;
    private String Color;
    private int Age;
    private int Mony;
    private int Account;
    private int Background;
    private int View;
    public Girl() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getMony() {
        return Mony;
    }

    public void setMony(int mony) {
        Mony = mony;
    }

    public int getAccount() {
        return Account;
    }

    public void setAccount(int account) {
        Account = account;
    }

    public int getBackground() {
        return Background;
    }

    public void setBackground(int background) {
        Background = background;
    }

    public int getView() {
        return View;
    }

    public void setView(int view) {
        View = view;
    }

    public Girl(String name) {
        this.Name = name;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Color='" + Color + '\'' +
                ", Age=" + Age +
                ", Mony=" + Mony +
                ", Account=" + Account +
                ", Background=" + Background +
                ", View=" + View +
                '}';
    }
}
