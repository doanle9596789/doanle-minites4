package staff;

public abstract class Staff {
    protected String id;
    protected String name;
    protected int age;
    protected int phonenumber;
    protected String email;

    public Staff() {
    }

    public Staff(String id, String name, int age, int phonenumber, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.email = email;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    } public abstract double foodreceived();
}
