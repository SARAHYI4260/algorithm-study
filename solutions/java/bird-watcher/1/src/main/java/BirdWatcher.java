
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] date = {0, 2, 3, 4, 5, 7, 8};
        return date;
    }

    public int getToday() {
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        return birdsPerDay[5];
    }

    public void incrementTodaysCount() {
        birdsPerDay[5]++;
    }

    public boolean hasDayWithoutBirds() {
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        for(int i = 0; i < birdsPerDay.length; i++) {
            if(birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        for(int i = 0; i < numberOfDays; i++) {
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int busyDay = 0;
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        for(int i = 0; i < birdsPerDay.length; i++) {
            if(5 <= birdsPerDay[i]) {
                busyDay++;
            }
        }
        return busyDay;
    }
}
