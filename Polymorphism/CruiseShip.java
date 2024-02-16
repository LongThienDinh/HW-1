public class CruiseShip extends Ship {
    private int maximumNumberOfPassengers;

    public CruiseShip(String nameOfTheShip, String shipBuiltYear, int maximumNumberOfPassengers) {
        super(nameOfTheShip, shipBuiltYear);
        this.maximumNumberOfPassengers = maximumNumberOfPassengers;
    }

    public void setMaximumNumberOfPassengers(int maximumNumberOfPassengers) {
        this.maximumNumberOfPassengers = maximumNumberOfPassengers;
    }

    public int getMaximumNumberOfPassengers() {
        return maximumNumberOfPassengers;
    }

    @Override
    public void print() {
        System.out.println("+ Name of the cruise ship: " + getNameOfTheShip());
        System.out.println("+ Maximum number of passengers: " + maximumNumberOfPassengers + " people");
    }
}