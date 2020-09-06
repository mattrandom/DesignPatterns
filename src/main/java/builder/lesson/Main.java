package builder.lesson;

import builder.lesson.house.classicbuilder.BigHouseClassicBuilder;
import builder.lesson.house.classicbuilder.HouseClassic;
import builder.lesson.house.classicbuilder.HouseClassicDirector;
import builder.lesson.house.classicbuilder.SmallHouseClassicBuilder;
import builder.lesson.house.innerstaticbuilder.House;

public class Main {
    public static void main(String[] args) {
//        House house = new House.HouseBuilder()
//                .buildWalls("walls")
//                .buildFloors("floors")
//                .buildRooms("rooms")
//                .buildRoof("roof")
//                .buildWindows("windows")
//                .buildDoors("doors")
//                .buildGarage("garage")
//                .build();

//        House build = House.HouseBuilder
//                .create()
//                .buildWalls("Builder with static factory method .create()")
//                .build();


        // Product (Main.class)
        SmallHouseClassicBuilder smallHouseClassicBuilder = new SmallHouseClassicBuilder();
        HouseClassicDirector smallHouseClassicDirector = new HouseClassicDirector(smallHouseClassicBuilder);
        smallHouseClassicDirector.buildHouseClassic();
        HouseClassic smallHouse = smallHouseClassicDirector.getHouseClassic();
        System.out.println(smallHouse);

        BigHouseClassicBuilder bigHouseClassicBuilder = new BigHouseClassicBuilder();
        HouseClassicDirector bigHouseClassicDirector = new HouseClassicDirector(bigHouseClassicBuilder);
        bigHouseClassicDirector.buildHouseClassic();
        HouseClassic bigHouse = bigHouseClassicDirector.getHouseClassic();
        System.out.println(bigHouse);

    }
}
