import java.util.Scanner;

public class Employee {
    String id;
    String name;
    String address;
    String email;
    String mobile;
    double basicPay;

    Employee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee~ Enter ID: ");
        this.id = sc.next();
        System.out.println("Employee~ Enter Name: ");
        this.name = sc.next();
        System.out.println("Employee~ Enter Address: ");
        this.address = sc.next();
        System.out.println("Employee~ Enter Email: ");
        this.email = sc.next();
        System.out.println("Employee~ Enter Mobile: ");
        this.mobile = sc.next();
        System.out.println("Employee~ Enter Basic Pay: ");
        this.basicPay = sc.nextDouble();
    }

    void printSalarySlip() {
        double da = 0.1 * this.basicPay;
        double hra = 0.12 * this.basicPay;
        double pf = 0.001 * this.basicPay;
        double grossSalary = this.basicPay + da + hra;
        double netSalary = grossSalary - pf;
        System.out.println("Employee~ Name: " + this.name + ", Gross Salary: " + grossSalary + ", Net Salary: " + netSalary);
    }
}