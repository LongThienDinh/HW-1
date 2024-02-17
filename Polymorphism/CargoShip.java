public class CargoShip extends Ship {
    private int cargoCapacityInTonnage;

    public CargoShip(String nameOfTheShip, String shipBuiltYear, int cargoCapacityInTonnage) {
        super(nameOfTheShip, shipBuiltYear);
        this.cargoCapacityInTonnage = cargoCapacityInTonnage;
    }

    public int getCargoCapacityInTonnage() {
        return cargoCapacityInTonnage;
    }

    public void setCargoCapacityInTonnage(int cargoCapacityInTonnage) {
        this.cargoCapacityInTonnage = cargoCapacityInTonnage;
    }

    @Override
    public void print() {
        System.out.println("+ Name of cargo ship: " + getNameOfTheShip()); 
        System.out.println("+ Ship's cargo capacity: " + cargoCapacityInTonnage + " in tonnage");
    }
}