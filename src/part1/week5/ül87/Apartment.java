package part1.week5.ül87;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment apartment){
        return this.squareMeters > apartment.squareMeters;
    }

    public int priceDifference(Apartment apartment){
        return Math.abs(pricePerSquareMeter * this.squareMeters - apartment.pricePerSquareMeter * apartment.squareMeters);
    }

    public boolean moreExpensiveThan(Apartment apartment){
        return this.pricePerSquareMeter * this.squareMeters > apartment.pricePerSquareMeter * apartment.squareMeters;
    }
}

