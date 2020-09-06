package builder.lesson;

import builder.lesson.house.House;

public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .buildWalls("walls")
                .buildFloors("floors")
                .buildRooms("rooms")
                .buildRoof("roof")
                .buildWindows("windows")
                .buildDoors("doors")
                .buildGarage("garage")
                .build();

//        House build = House.HouseBuilder
//                .create()
//                .buildWalls("Builder with static factory method .create()")
//                .build();


    }
}
