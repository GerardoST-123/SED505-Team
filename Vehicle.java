import java.text.DecimalFormat;

/**
 * Unified vehicle interface expected by the contemporary travel simulator.
 * Implementations adapt legacy vehicle classes to this interface.
 */
public interface Vehicle {
    /** Instruct the vehicle to travel the requested distance in kilometers. */
    void travel(double distanceKm);

    /** Add the specified amount of fuel in litres. */
    void addFuel(double litres);

    /** @return total distance traveled so far in kilometers. */
    double getDistanceKm();

    /** @return total travel time so far in hours. */
    double getTravelTimeHours();

    /** @return current fuel level in litres. */
    double getFuelLevelLitres();

    /** @return total fuel cost in dollars, based on the legacy model. */
    double getFuelCostDollars();
}

/**
 * Utility methods for reporting vehicle information in a consistent format.
 */
class VehicleUtility {
    private static final DecimalFormat DISTANCE_FMT = new DecimalFormat("#.###");
    private static final DecimalFormat TIME_FMT = new DecimalFormat("#.####");
    private static final DecimalFormat GENERIC_FMT = new DecimalFormat("#.####");

    public static void printVehicleInformation(Vehicle vehicle, String vehicleType) {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Travel Distance: " + DISTANCE_FMT.format(vehicle.getDistanceKm()) + "km");
        System.out.println("Travel Time: " + TIME_FMT.format(vehicle.getTravelTimeHours()) + " hours");
        System.out.println("Current Fuel Level: " + GENERIC_FMT.format(vehicle.getFuelLevelLitres()) + "L");
        System.out.println("Fuel Cost: $" + GENERIC_FMT.format(vehicle.getFuelCostDollars()));
        System.out.println();
    }
}