public class ShipTest {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("SS Minnow", "1967");
        ships[1] = new CruiseShip("Voyager", "1996", 3120);
        ships[2] = new CargoShip("Black Pearl", "2003", 50000);

        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }
}