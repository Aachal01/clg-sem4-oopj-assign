public class Car implements Vehicles{
    int speed = 0;
    int gear = 0;
    @Override
    public void applyBreaks() {
        this.speed = 0;
    }

    @Override
    public void gearChange(int target_gear) {
        this.gear = target_gear;
        this.speed = this.gear * 50;
    }

    @Override
    public void printStatus() {
        System.out.println("Speed: " + this.speed + " Gear: " + this.gear);
    }
}
