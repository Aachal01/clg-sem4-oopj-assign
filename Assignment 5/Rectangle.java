import java.util.Scanner;

public class Rectangle extends Shape {

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of Rectangle: ");
        this.a = sc.nextDouble();

        System.out.println("Enter the height of Rectangle");
        this.b = sc.nextDouble();
    }

    @Override
    public void area() {
        double area = a*b;
        System.out.println("Area of Rectangle is: " + area);
    }
}
