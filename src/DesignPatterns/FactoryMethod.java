package DesignPatterns;

interface Vehicle{
    void drive();
}

class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}

class Bike implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving a bike");
    }
}

abstract class VehicleFactory{
    public abstract Vehicle createVehicle();

    public void driveVehicle(){
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }
}

class CarFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

class BikeFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}

public class FactoryMethod {
    public static void main(String[] args) {

        VehicleFactory carFactory = new CarFactory();
        VehicleFactory bikeFactory = new BikeFactory();

        carFactory.driveVehicle();
        bikeFactory.driveVehicle();
    }
}


