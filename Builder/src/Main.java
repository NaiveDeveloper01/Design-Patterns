// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Builder builder = new HouseBuilder();
        Director d = new Director();
        House h = d.getWoodenHouse(builder);
        System.out.println(h.toString());
    }
}