package builder.lesson.house.classicbuilder;

// ConcreteBuilders
public class BigHouseClassicBuilder implements HouseClassicBuilder {
    private HouseClassic houseClassic;

    public BigHouseClassicBuilder() {
        this.houseClassic = new HouseClassic();
    }

    @Override
    public void buildWalls() {
        this.houseClassic.setWalls("big walls");
    }
    @Override
    public void buildFloors() {
        this.houseClassic.setFloors("big floors");
    }
    @Override
    public void buildRooms() {
        this.houseClassic.setRooms("big rooms");
    }
    @Override
    public void buildRoof() {
        this.houseClassic.setRoof("big roof");
    }
    @Override
    public void buildWindows() {
        this.houseClassic.setWindows("big windows");
    }
    @Override
    public void buildDoors() {
        this.houseClassic.setDoors("big doors");
    }
    @Override
    public void buildGarage() {
        this.houseClassic.setGarage("big garage");
    }

    @Override
    public HouseClassic getHouseClassic() {
        return houseClassic;
    }
}
