// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello");

        Logistics airLogistics = new Logistics(new AirTransport());
        airLogistics.shipProduct();

        Logistics roadLogistics = new Logistics(new RoadTransport());
        roadLogistics.shipProduct();

        Logistics waterLogistics = new Logistics(new WaterTransport());
        waterLogistics.shipProduct();
    }
}