import java.util.Scanner;

public class Magazine extends Publication  {
    int orderQty = 0;

    Magazine() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Magazine Title: ");
        this.title = sc.next();
        System.out.print("Enter Magazine Price: ");
        this.price = sc.nextInt();
        System.out.print("Enter No. of Copies: ");
        this.copies = sc.nextInt();
    }

    void currentIssue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Magazine: Enter Quantity to Issue: ");
        orderQty = sc.nextInt();
        if(orderQty > copies) {
            orderQty = 0;
            System.out.println("Magazine: Sorry, Stock Unavailable!");
        }
        else {
            System.out.println("Magazine: Issue Placed Successfully!");
        }
    }

    void receiveIssue() {
        if(orderQty == 0) {
            System.out.println("Magazine: Please place an issue to receive!");
            return;
        }
        System.out.printf("Magazine: Issue for %s, Delivered Successfully!\n", title);
        orderQty = 0;
    }
}