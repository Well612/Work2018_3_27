import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
    Student stud1 = new Student(); //類別
    stud1.showAll();
        System.out.println("設定");
        System.out.print("姓名:");
        stud1.setName(scn.next());
        System.out.print("ID:");
        stud1.setId(scn.next());
        System.out.print("系別:");
        stud1.setDept(scn.next());
        System.out.print("導師:");
        stud1.setTutoTeacher(scn.next());

    }
    public 
}
//高紹維   106021095    資訊工程學系  周永振