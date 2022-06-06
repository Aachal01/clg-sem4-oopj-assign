import java.util.Scanner;

public class Book extends Publication {
    String author;
    int orderQty = 0;

    Book() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        this.title = sc.next();
        System.out.print("Enter Name of Author: ");
        this.author = sc.next();
        System.out.print("Enter Book Price: ");
        this.price = sc.nextInt();
        System.out.print("Enter No. of Copies: ");
        this.copies = sc.nextInt();
    }

    void orderCopies() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Book: No. of Copies of %s to order: ", title);
        orderQty = sc.nextInt();

        if(copies < orderQty) {
            orderQty = 0;
            System.out.println("Book: Sorry, Stock Unavailable!");
        }
        else {
            System.out.println("Book: Order Placed Successfully!");
        }
    }
}