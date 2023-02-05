package run;

import managerstaff.ManagerStaff;
import staff.FullTimeEmployee;
import staff.PartTimeEmployee;
import staff.Staff;

import java.util.Scanner;

public class Run {
   static ManagerStaff managerStaff=new ManagerStaff();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do {
        System.out.println("menu-------");
        System.out.println("xin mời chọn menu");
        System.out.println("""
                1. thêm nhân viên toàn thời gian
                2. thêm nhân viên bán thời gian
                3.sửa nhân viên fulltime
                4.sửa nhân viên fulltime
                5.xóa nhân viên
                6.hiện thị danh sách nhân viên
                7.lương trung bình của nhân viên công ty
                8. liệt kê danh sách nhân viên toàn thời gian có mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty.
                9.số lương phải trả cho tất cả các nhân viên bán thời gian.
                10.sắp xếp nhân viên toàn thời gian theo số lương tăng dần.
                0.thoat chương trình""");
        int menu=sc.nextInt();
        switch (menu){
            case 1:
                managerStaff.createfulltime();
                break;
            case 2:
           managerStaff.createPartime();
           break;
            case 3:
                managerStaff.updateFulltime();
                managerStaff.readStaff();
                break;
            case 4:
                managerStaff.updatePartime();
                managerStaff.readStaff();
                break;
            case 5:
                managerStaff.deleteStaff();
                break;
            case 6:
                managerStaff.readStaff();
                break;
            case 7:
                managerStaff.averageWage();
                break;
            case 8:
            case 0:
        }
    }while (true);
    }
}
