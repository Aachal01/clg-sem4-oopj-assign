import java.util.Scanner;

public class AssociateProfessor extends Professor {
    String subject;
    AssociateProfessor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("AssociateProfessor~ Enter Subject: ");
        this.subject = sc.next();
    }
}