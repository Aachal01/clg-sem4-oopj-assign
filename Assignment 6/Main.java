/*Design and develop a context for given case study and implement an interface for Vehicles Consider the
example of vehicles like bicycle, car, and bike. All Vehicles have common functionalities such as Gear  Change,
Speed up and apply brakes. Make an interface and put all these common functionalities.
Bicycle,  Bike, Car classes should be implemented for all these functionalities in their own class in their own way*/

public class Main {
    public static void main(String[] args) {
        Car my_car = new Car();
        Bicycle my_bicycle = new Bicycle();
        Bike my_bike = new Bike();

        my_car.gearChange(45);
        my_bicycle.gearChange(3);
        my_bike.gearChange(10);

        my_car.printStatus();
        my_bicycle.printStatus();
        my_bike.printStatus();
    }
}
