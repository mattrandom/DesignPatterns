package builder.lesson.house.classicbuilder;

// Director
public class HouseClassicDirector {
    private HouseClassicBuilder houseClassicBuilder;

    public HouseClassicDirector(HouseClassicBuilder houseClassicBuilder) {
        this.houseClassicBuilder = houseClassicBuilder;
    }

    public void buildHouseClassic() {
        houseClassicBuilder.buildWalls();
        houseClassicBuilder.buildFloors();
        houseClassicBuilder.buildRooms();
        houseClassicBuilder.buildRoof();
        houseClassicBuilder.buildWindows();
        houseClassicBuilder.buildDoors();
        houseClassicBuilder.buildGarage();
    }

    public HouseClassic getHouseClassic() {
        return this.houseClassicBuilder.getHouseClassic();
    }
}
