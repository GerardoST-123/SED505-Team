/**
 * Adapter that wraps the legacy Car to conform to the Vehicle interface.
 */
class CarAdapter implements Vehicle {
    private final Car adaptee;

    public CarAdapter(Car adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void travel(double distanceKm) {
        adaptee.carTravel(distanceKm);
    }

    @Override
    public void addFuel(double litres) {
        adaptee.carAddFuel(litres);
    }

    @Override
    public double getDistanceKm() {
        return adaptee.getCarDistance();
    }

    @Override
    public double getTravelTimeHours() {
        return adaptee.getCarTime();
    }

    @Override
    public double getFuelLevelLitres() {
        return adaptee.getCarFuelLevel();
    }

    @Override
    public double getFuelCostDollars() {
        return adaptee.getCarFuelCost();
    }
}

