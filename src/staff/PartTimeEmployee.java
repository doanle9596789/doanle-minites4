package staff;

public class PartTimeEmployee extends Staff {
    private double worktime;

    public PartTimeEmployee(double worktime) {
        this.worktime = worktime;
    }

    public PartTimeEmployee(String id, String name, int age, int phonenumber, String email, double worktime) {
        super(id, name, age, phonenumber, email);
        this.worktime = worktime;
    }

    public PartTimeEmployee() {

    }

    public double getWorktime() {
        return worktime;
    }

    public void setWorktime(double worktime) {
        this.worktime = worktime;
    }

    @Override
    public double foodreceived() {
        return worktime*1000000;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "worktime=" + worktime +
                "} " + super.toString();
    }
}
