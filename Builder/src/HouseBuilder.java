public class HouseBuilder implements Builder {

    private String material;
    private int size;
    private int doors;
    private int windows;
    private String floor;
    private String wall;
    private String roof;

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public void setWalls(String walls) {
        this.wall = walls;
    }

    @Override
    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public int getDoors() {
        return this.doors;
    }

    @Override
    public int getWindows() {
        return this.windows;
    }

    @Override
    public String getFloor() {
        return this.floor;
    }

    @Override
    public String getWalls() {
        return this.wall;
    }

    @Override
    public String getRoof() {
        return this.roof;
    }

    @Override
    public House buildHouse(Builder builder) {
        return House.getHouse(builder);
    }

}
