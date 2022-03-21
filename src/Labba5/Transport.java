package Labba5;

public class Transport {
    public int speed;
    public int acceleration;
    public int numberOfSeats;
    public Transport(int speed, int acceleration, int numberOfSeats){
        this.speed=speed;
        this.acceleration=acceleration;
        this.numberOfSeats=numberOfSeats;

    }
    public void goTo(String destination){
        System.out.println("вы направляетесь в "+ destination);

    }

}
