public interface Builder {
    void setMaterial(String material);

    void setSize(int size);

    void setDoors(int doors);

    void setWindows(int windows);

    void setFloor(String floor);

    void setWalls(String walls);

    void setRoof(String roof);

    String getMaterial();

    int getSize();

    int getDoors();

    int getWindows();

    String getFloor();

    String getWalls();

    String getRoof();

    House buildHouse(Builder builder);
}
