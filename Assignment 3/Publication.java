import java.util.Scanner;

public class Publication {
    String title;
    int price;
    int copies;
    static int totalSales = 0;

    void saleCopy() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("No. of Copies of %s to sale: ", title);
        int toSale = sc.nextInt();

        if(copies >= toSale) {
            copies -= toSale;
            totalSales += toSale;
            System.out.printf("%d Sold Successfully!\n", toSale);
        }
        else {
            System.out.println("Stock Unavailable!");
        }
    }
}