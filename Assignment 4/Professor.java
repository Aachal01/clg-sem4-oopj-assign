import java.util.Scanner;

public class Professor extends Employee {
    String department;
    Professor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Professor~ Enter Department: ");
        this.department = sc.next();
    }
}