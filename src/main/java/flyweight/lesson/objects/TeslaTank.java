package flyweight.lesson.objects;

/**
 * field stats uses singleton instance of UnitStats which is initialized at UnitStatsRepository.class
 */
public class TeslaTank {
    private int xCoordinate;
    private int yCoordinate;
    private int hpLeft;
    private UnitStats stats;

    public TeslaTank(int xCoordinate, int yCoordinate) {
        stats = UnitStatsRepository.getTeslaTankStats();
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.hpLeft = stats.getHp();
    }
}
