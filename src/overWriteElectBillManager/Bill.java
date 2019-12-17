package overWriteElectBillManager;

import checkYear.Date;

public abstract class Bill {
    private String id;
    private String name;
    private Date date;

    public Bill(String id, String name, checkYear.Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date;
    }

    public Bill(String id) {
        this.id = id;
    }

    public abstract float pay();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
