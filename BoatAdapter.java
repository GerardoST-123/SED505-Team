/**
 * Adapter that wraps the legacy Boat to conform to the Vehicle interface.
 */
class BoatAdapter implements Vehicle {
    private final Boat adaptee;

    public BoatAdapter(Boat adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void travel(double distanceKm) {
        adaptee.boatTravel(distanceKm);
    }

    @Override
    public void addFuel(double litres) {
        adaptee.boatAddFuel(litres);
    }

    @Override
    public double getDistanceKm() {
        return adaptee.getBoatDistance();
    }

    @Override
    public double getTravelTimeHours() {
        return adaptee.getBoatTime();
    }

    @Override
    public double getFuelLevelLitres() {
        return adaptee.getBoatFuelLevel();
    }

    @Override
    public double getFuelCostDollars() {
        return adaptee.getBoatFuelCost();
    }
}

