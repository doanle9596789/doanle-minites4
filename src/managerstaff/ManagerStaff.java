package managerstaff;

import staff.FullTimeEmployee;
import staff.PartTimeEmployee;
import staff.Staff;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerStaff {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Staff> liststaff = new ArrayList<>();

    public static ArrayList<Staff> getListstaff() {
        return liststaff;
    }

    public static void setListstaff(ArrayList<Staff> liststaff) {
        ManagerStaff.liststaff = liststaff;
    }

    public ManagerStaff(ArrayList<Staff> liststaff) {
        this.liststaff = liststaff;
    }

    public ManagerStaff() {
    }

    public void addStaff(Staff staff) {
        liststaff.add(staff);
    }

    public void editStaff(Staff staff, int index) {
        liststaff.set(index, staff);
    }

    public void delete(int index) {
        liststaff.remove(index);
    }

    public void createfulltime() {
        System.out.println("xin mời nhập id");
        scanner.nextLine();
        String id = scanner.nextLine();
        System.out.println("xin mời nhập tên");
        String name = scanner.nextLine();
        System.out.println("xin mời nhập tuổi");
        int age = scanner.nextInt();
        System.out.println("xin mời nhập sô điện thoại");
        int phonenumber = scanner.nextInt();
        System.out.println("xin mời nhập email");
        scanner.nextLine();
        String email = scanner.nextLine();

        System.out.println("xin mời nhập tiền thưởng");
        double bonus = scanner.nextDouble();
        System.out.println("xin mời nhập tiền phạt");
        double fine = scanner.nextDouble();
        System.out.println("xin mời nhập lương cứng");
        double hardsalary = scanner.nextDouble();
        Staff staff1 = new FullTimeEmployee(id, name, age, phonenumber, email, bonus, fine, hardsalary);
        liststaff.add(staff1);
    }

    public void createPartime() {
        System.out.println("xin mời nhập id");
        String id1 = scanner.nextLine();
        System.out.println("xin mời nhập tên");
        String name1 = scanner.nextLine();
        System.out.println("xin mời nhập tuổi");
        int age1 = scanner.nextInt();
        System.out.println("xin mời nhập sô điện thoại");
        int phonenumber1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("xin mời nhập email");
        String email1 = scanner.nextLine();
        System.out.println("xin mời nhập thoi gian lam viec");
        double worktime = scanner.nextDouble();
        Staff staff2 = new PartTimeEmployee(id1, name1, age1, phonenumber1, email1, worktime);
        liststaff.add(staff2);
    }

    public void updateFulltime() {
      deleteStaff();
      createfulltime();
    }

    public void updatePartime() {
        deleteStaff();
        createPartime();
    }

    public void deleteStaff() {
        System.out.println("nhập vị trí bạn muốn xóa");
        int index = scanner.nextInt();
        liststaff.remove(index);
    }

    public void readStaff() {
        for (Staff k:liststaff) {
            System.out.println(k);
        }
            }
    public double totaFulltime() {
        int totalfulltime = 0;
        for (Staff k : liststaff) {
            if (k == (FullTimeEmployee) k) {
                totalfulltime += 1;
            }

        } return totalfulltime;
    }
    public double totalParttime(){
        int totalparttime=0;
        for (Staff k:liststaff) {
            if (k==(PartTimeEmployee)k){
                totalparttime+=1;
            }
        }return totalparttime;
    }
    public double averageWage(){
        int everageWage=0;
        FullTimeEmployee fullTimeEmployee=new FullTimeEmployee();
        PartTimeEmployee partTimeEmployee=new PartTimeEmployee();
       return everageWage+=(totaFulltime()*fullTimeEmployee.foodreceived()+totalParttime()*partTimeEmployee.foodreceived());
    }
}