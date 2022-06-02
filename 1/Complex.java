import java.util.Scanner;  // Import the Scanner class

/*
Tasks to do:
- class ‘Complex’
 (data memebers):
  - real
  - imaginary
- constructors
  - default (user input)
  - parameterized
-perform arithmatic operations
*/


/*
---------------------------------------------
            About Constructor
---------------------------------------------
1. It must have same name as class name
2. It must have no explicit return type.

*/
public class Complex{
    double real, imaginary;
    //default constructor
    Complex(){
        this.real = 0;
        this.imaginary = 0;
    }

    Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    void userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real part of complex number: ");
        this.real = sc.nextDouble();
        System.out.print("Enter the imaginary part of complex number: ");
        this.imaginary = sc.nextDouble();
    }

    static Complex add(Complex a, Complex b){
        double real = a.real + b.real;
        double imaginary = a.imaginary + b.imaginary;
        Complex result = new Complex(real, imaginary);
        return result;
    }

    static Complex sub(Complex a, Complex b){
        double real = a.real - b.real;
        double imaginary = a.imaginary - b.imaginary;
        Complex result = new Complex(real, imaginary);
        return result;
    }

    void display(){
        System.out.printf("%f + %fi\n", this.real, this.imaginary);
    }

}
