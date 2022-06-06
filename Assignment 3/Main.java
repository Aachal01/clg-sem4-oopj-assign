public class Main {
    public static void main(String[] args) {
        // add book in library
        Book book1 = new Book();
        book1.orderCopies();
        book1.saleCopy();

        Book book2 = new Book();
        book2.orderCopies();
        book2.saleCopy();

        // add magzine in library
        Magazine magazine = new Magazine();
        magazine.currentIssue();
        magazine.receiveIssue();


        // stats: book
        System.out.printf("%s, Order: %d", book1.title, book1.orderQty);
        System.out.printf("%s, Order: %d", book2.title, book2.orderQty);

        // stats: publication
        System.out.printf("Total Sale of Publication: %d\n", Publication.totalSales);
    }
}