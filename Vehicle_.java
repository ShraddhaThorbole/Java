interface Vehicle 
{
    void changeGear(int gear);
    void speedUp(int speedUp);
    void applyBrakes(int decrement);
}

class Bicycle implements Vehicle 
{
    int speed;
    int gear;

    @Override
    public void changeGear(int gear) 
    {
        this.gear = gear;
    }

    @Override
    public void speedUp(int increment) 
    {
        speed =speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) 
    {
        speed =speed - decrement;
    }

    public void printStatus() 
    {
        System.out.println("---Bicycle--- \nSpeed : " + speed + "\nGear : " + gear);
    }
}

class Bike implements Vehicle 
{
    int speed;
    int gear;

    @Override
    public void changeGear(int gear) 
    {
        this.gear = gear;
    }

    @Override
    public void speedUp(int increment) 
    {
        speed =speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) 
    {
        speed =speed - decrement;
    }

    public void printStatus() 
    {
        System.out.println("\n---Bike--- \nSpeed : " + speed + "\nGear : " + gear);
    }
}

class Car implements Vehicle 
{
    int speed;
    int gear;

    @Override
    public void changeGear(int gear) 
    {
        this.gear = gear;
    }

    @Override
    public void speedUp(int increment) 
    {
        speed =speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) 
    {
        speed =speed - decrement;
    }

    public void printStatus() 
    {
        System.out.println("\n---Car--- \nSpeed : " + speed + "\nGear : " + gear);
    }
}

public class Vehicle_
{
    public static void main(String[] args) 
    {
        Bicycle bicycle = new Bicycle();
        Bike bike = new Bike();
        Car car = new Car();

        bicycle.changeGear(1);
        bicycle.speedUp(10);
        bicycle.applyBrakes(5);
        bicycle.printStatus();

        bike.changeGear(2);
        bike.speedUp(20);
        bike.applyBrakes(10);
        bike.printStatus();

        car.changeGear(3);
        car.speedUp(30);
        car.applyBrakes(15);
        car.printStatus();
    }
}
