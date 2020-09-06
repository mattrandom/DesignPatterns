package builder.lesson.house.classicbuilder;

// ConcreteBuilders
public class SmallHouseClassicBuilder implements HouseClassicBuilder {
    private HouseClassic houseClassic;

    public SmallHouseClassicBuilder() {
        this.houseClassic = new HouseClassic();
    }

    @Override
    public void buildWalls() {
        this.houseClassic.setWalls("small walls");
    }
    @Override
    public void buildFloors() {
        this.houseClassic.setFloors("small floors");
    }
    @Override
    public void buildRooms() {
        this.houseClassic.setRooms("small rooms");
    }
    @Override
    public void buildRoof() {
        this.houseClassic.setRoof("small roof");
    }
    @Override
    public void buildWindows() {
        this.houseClassic.setWindows("small windows");
    }
    @Override
    public void buildDoors() {
        this.houseClassic.setDoors("small doors");
    }
    @Override
    public void buildGarage() {
        this.houseClassic.setGarage("small garage");
    }

    @Override
    public HouseClassic getHouseClassic() {
        return houseClassic;
    }
}
