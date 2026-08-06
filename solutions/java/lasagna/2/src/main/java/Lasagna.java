public class Lasagna {
    public int expectedMinutesInOven() {
        int roast = 40;
        return roast;
    }

    public int remainingMinutesInOven(int timeInOven) {
        int time = expectedMinutesInOven() - timeInOven;
        return time;
    }

    public int preparationTimeInMinutes (int layer) {
        int takeTime = 2 * layer;
        return takeTime;
    }

    public int totalTimeInMinutes(int layer, int roast) {
        return preparationTimeInMinutes(layer) + roast;
    }
}
