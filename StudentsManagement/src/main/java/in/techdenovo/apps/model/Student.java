package in.techdenovo.apps.model;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String city;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String mobileNo, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
