package staff;

public class FullTimeEmployee extends Staff {
    private double bonus;
    private double fine;
    private double hardsalary;

    public FullTimeEmployee(double bonus, double fine, double hardsalary) {
        this.bonus = bonus;
        this.fine = fine;
        this.hardsalary = hardsalary;
    }

    public FullTimeEmployee(String id, String name, int age, int phonenumber, String email, double bonus, double fine, double hardsalary) {
        super(id, name, age, phonenumber, email);
        this.bonus = bonus;
        this.fine = fine;
        this.hardsalary = hardsalary;
    }

    public FullTimeEmployee(String id, String name, int phonenumber, String email, double bonus, double fine, double hardsalary) {
    }

    public FullTimeEmployee() {

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getHardsalary() {
        return hardsalary;
    }

    public void setHardsalary(double hardsalary) {
        this.hardsalary = hardsalary;
    }

    @Override
    public double foodreceived() {
        return hardsalary+(bonus-fine);
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + name +
                ", phonenumber=" + phonenumber +
                ", email='" + email + '\'' +
                "bonus=" + bonus +
                ", fine=" + fine +
                ", hardsalary=" + hardsalary +
                "} ";
    }
}
