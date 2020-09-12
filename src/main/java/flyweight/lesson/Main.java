package flyweight.lesson;

import flyweight.lesson.objects.Destroyer;
import flyweight.lesson.objects.Rifleman;
import flyweight.lesson.objects.TeslaTank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> activeUnits = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            activeUnits.add(new TeslaTank( 0, 0));
            activeUnits.add(new Rifleman(0, 0));
            activeUnits.add(new Destroyer(0, 0));
        }
    }
}
