import java.util.Scanner;

public class AssistantProfessor extends Professor {
    String subject;
    AssistantProfessor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("AssistantProfessor~ Enter Subject: ");
        this.subject = sc.next();
    }
}