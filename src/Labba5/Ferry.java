package Labba5;

public class Ferry extends Transport {
    int numberOfPassengers;
    int numberOfCrew;
    public Ferry(int numberOfCrew, int numberOfPassengers, int speed, int acceleration, int numberOfSeats){
        super(speed, acceleration, numberOfSeats);
        this.numberOfCrew=numberOfCrew;
        this.numberOfPassengers=numberOfPassengers;
    }
}
