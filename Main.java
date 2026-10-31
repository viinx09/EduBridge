class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor with 1 parameter
    Time(int totalSeconds) {
        this.hours = totalSeconds / 3600;
        this.minutes = (totalSeconds % 3600) / 60;
        this.seconds = totalSeconds % 60;

        System.out.println("Constructor with 1 parameter called (Total Seconds).");
    }

    // Constructor with 2 parameters
    Time(int totalMinutes, int seconds) {
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
        this.seconds = seconds;

        System.out.println("Constructor with 2 parameters called (Minutes, Seconds).");
    }

    // Constructor with 3 parameters
    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        System.out.println("Constructor with 3 parameters called (Hours, Minutes, Seconds).");
    }

    void displayTime() {
        System.out.printf("Time -> %02d:%02d:%02d%n%n",
                hours, minutes, seconds);
    }
}

class Main {
    public static void main(String[] args) {
        Time t1 = new Time(3665);
        t1.displayTime();

        Time t2 = new Time(90, 15);
        t2.displayTime();

        Time t3 = new Time(2, 45, 30);
        t3.displayTime();
    }
}
