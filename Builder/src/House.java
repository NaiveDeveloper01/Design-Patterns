public class House {
    private String material;
    private int size;
    private int doors;
    private int windows;
    private String floor;
    private String walls;
    private String roof;

    private House(String material, int size, int doors, int windows, String floor, String walls, String roof) {
        this.material = material;
        this.size = size;
        this.doors = doors;
        this.windows = windows;
        this.floor = floor;
        this.walls = walls;
        this.roof = roof;
    }

    public static House getHouse(Builder builder) {
        return new House(builder.getMaterial(), builder.getSize(), builder.getDoors(), builder.getWindows(), builder.getFloor(), builder.getWalls(), builder.getRoof());
    }

    @Override
    public String toString() {
        return "House{" +
                "material='" + material + '\'' +
                ", size=" + size +
                ", doors=" + doors +
                ", windows=" + windows +
                ", floor='" + floor + '\'' +
                ", walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
