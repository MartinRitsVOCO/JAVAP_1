package tund1.ül5;

public class Main {
    public static void main(String[] args) {
        int days = 365;
        int hours = 24;
        int minutes = 60;
        int seconds = 60;

        System.out.println("There are " + days + " days in a year.");
        System.out.println("There are " + hours + " hours in a day.");
        System.out.println("There are " + minutes + " minutes in an hour.");
        System.out.println("There are " + seconds + " seconds in a minute.");

        int secondsInYear = days * hours * minutes * seconds;

        System.out.println("Therefore, there are " + secondsInYear + " seconds in a year.");
    }
}
