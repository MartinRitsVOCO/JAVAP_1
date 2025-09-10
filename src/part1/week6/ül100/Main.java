package part1.week6.ül100;

public class Main {
    public static void main(String[] args) {
        NightSky nightSky = new NightSky(0.1, 50, 25);
        nightSky.print();
        nightSky.starsInLastPrint();

        NightSky nightSky2 = new NightSky(0.2);
        nightSky2.print();
        nightSky2.starsInLastPrint();

        NightSky nightSky3 = new NightSky(20, 15);
        nightSky3.print();
        nightSky3.starsInLastPrint();
    }
}
