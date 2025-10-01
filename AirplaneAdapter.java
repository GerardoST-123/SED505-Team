/**
 * Adapter that wraps the legacy Airplane to conform to the Vehicle interface.
 */
class AirplaneAdapter implements Vehicle {
    private final Airplane adaptee;

    public AirplaneAdapter(Airplane adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void travel(double distanceKm) {
        adaptee.airplaneTravel(distanceKm);
    }

    @Override
    public void addFuel(double litres) {
        adaptee.airplaneAddFuel(litres);
    }

    @Override
    public double getDistanceKm() {
        return adaptee.getAirplaneDistance();
    }

    @Override
    public double getTravelTimeHours() {
        return adaptee.getAirplaneTime();
    }

    @Override
    public double getFuelLevelLitres() {
        return adaptee.getAirplaneFuelLevel();
    }

    @Override
    public double getFuelCostDollars() {
        return adaptee.getAirplaneFuelCost();
    }
}

