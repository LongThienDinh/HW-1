public class Ship {
    private String nameOfTheShip;
    private String shipBuiltYear;

    public Ship(String nameOfTheShip, String shipBuiltYear) {
        this.nameOfTheShip = nameOfTheShip;
        this.shipBuiltYear = shipBuiltYear;
    }

    public void setNameOfTheShip(String nameOfTheShip) {
        this.nameOfTheShip = nameOfTheShip;
    }

    public String getNameOfTheShip() {
        return nameOfTheShip;
    }

    public void setShipBuiltYear(String shipBuiltYear) {
        this.shipBuiltYear = shipBuiltYear;
    }

    public String getShipBuiltYear() {
        return shipBuiltYear;
    }

    public void print() {
        System.out.println("+ Name of the ship: " + nameOfTheShip);
        System.out.println("+ Year the ship was built: " + shipBuiltYear +"s");
    }
}