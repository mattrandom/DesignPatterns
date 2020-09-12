package flyweight.lesson.objects;

/**
 * field stats uses singleton instance of UnitStats which is initialized at UnitStatsRepository.class
 */
public class Destroyer {
    private int xCoordinate;
    private int yCoordinate;
    private int hpLeft;
    private UnitStats stats;

    public Destroyer(int xCoordinate, int yCoordinate) {
        stats = UnitStatsRepository.getDestroyerStats();
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.hpLeft = stats.getHp();
    }
}
