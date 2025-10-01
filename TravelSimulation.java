class TravelSimulation {
    public static void main(String[] args) {
        Vehicle boat = new BoatAdapter(new Boat());
        Vehicle car = new CarAdapter(new Car());
        Vehicle airplane = new AirplaneAdapter(new Airplane());

        // the boat travels 100km and information about the boat is printed
        boat.travel(100.0);
        VehicleUtility.printVehicleInformation(boat, "Boat");

        // the car travels 1000km and information about the car is printed
        car.travel(1000.0);
        VehicleUtility.printVehicleInformation(car, "Car");

        // the airplane travels 10000km and information about the airplane is printed
        airplane.travel(10000.0);
        VehicleUtility.printVehicleInformation(airplane, "Airplane");

        // Add fuel to each
        System.out.println();
        System.out.println("Adding fuel...");
        System.out.println();

        boat.addFuel(120);
        car.addFuel(40);
        airplane.addFuel(50000);

        // Travel again
        // Boat
        boat.travel(100.0);
        VehicleUtility.printVehicleInformation(boat, "Boat");

        // Car
        car.travel(1000.0);
        VehicleUtility.printVehicleInformation(car, "Car");

        // Airplane
        airplane.travel(10000.0);
        VehicleUtility.printVehicleInformation(airplane, "Airplane");

        new java.util.Scanner(System.in).nextLine();
    }
}
