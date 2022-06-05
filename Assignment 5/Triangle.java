import java.util.Scanner;

public class Triangle extends Shape {
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of triangle: ");
        this.a = sc.nextDouble();

        System.out.println("Enter the height of triangle");
        this.b = sc.nextDouble();
    }

    @Override
    public void area() {
        double area = (0.5)*a*b;
        System.out.println("Area of triangle is: " + area);
    }
}
