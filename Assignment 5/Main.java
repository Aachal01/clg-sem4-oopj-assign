/* Design a base class shape with two double type values and member
functions to input the data and  compute_area() for calculating area of figure. Derive two classes’
triangle and rectangle. Make  compute_area() as an abstract function and redefine this function in the derived
class to suit their  requirements. Write a program that accepts dimensions of triangle/rectangle and displays calculated area.
Implement dynamic binding for given case study.

 */

public class Main {

    public static void main(String[] args) {
        Shape tr = new Triangle();
        Shape rec = new Rectangle();
        tr.input();
        tr.area();
        rec.input();
        rec.area();
    }
}
