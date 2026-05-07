public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        int roast = 40;
        return roast;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timeInOven) {
        int time = expectedMinutesInOven() - timeInOven;
        return time;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes (int layer) {
        int takeTime = 2 * layer;
        return takeTime;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layer, int roast) {
        int totalCookingTime = (2*layer) + roast;
        return totalCookingTime;
    }
}
