public class Director {

    public House getWoodenHouse(Builder builder)
    {
        builder.setMaterial("Wood");
        builder.setSize(800);
        builder.setDoors(4);
        builder.setWindows(8);
        builder.setFloor("tiles");
        builder.setWalls("Thick");
        builder.setRoof("carved");
        House woodenHouse = builder.buildHouse(builder);
        return woodenHouse;
    }

    public House getGlassHouse(Builder builder)
    {
        builder.setMaterial("glass");
        builder.setSize(800);
        builder.setDoors(4);
        builder.setWindows(8);
        builder.setFloor("carpet");
        builder.setWalls("Heavy");
        builder.setRoof("Designed");
        House woodenHouse = builder.buildHouse(builder);
        return woodenHouse;
    }

    public House getCastleHouse(Builder builder)
    {
        builder.setMaterial("HardRock");
        builder.setSize(800);
        builder.setDoors(4);
        builder.setWindows(8);
        builder.setFloor("Hard tiles");
        builder.setWalls("Heavy");
        builder.setRoof("Spherical");
        House woodenHouse = builder.buildHouse(builder);
        return woodenHouse;
    }
}
