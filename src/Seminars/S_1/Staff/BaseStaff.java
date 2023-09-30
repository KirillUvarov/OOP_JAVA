package Seminars.S_1.Staff;

public abstract class BaseStaff {

    protected Integer serviceNumber;
    private String name;
    protected String title;

    public BaseStaff(Integer serviceNumber, String name, String title) {
        this.serviceNumber = serviceNumber;
        this.name = name;
        this.title = title;
    }

    public Integer getServiceNumber() {
        return serviceNumber;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setServiceNumber(Integer serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
