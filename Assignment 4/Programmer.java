import java.util.Scanner;

public class Programmer extends Employee {
    String team;
    Programmer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programmer~ Enter Team Name: ");
        this.team = sc.next();
    }
}