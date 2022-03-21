package Labba5;

import Labba5.Building;

public class Theatre extends Building {
    public Theatre(int height, int popularity, int numberOfVisitors, int ticketCost) {
        super(height, popularity);
        this.numberOfVisitors=numberOfVisitors;
        this.ticketCost=ticketCost;
    }

    @Override
    void open() {
        System.out.println("театр открылся!");

    }

    @Override
    void close() {
        System.out.println("театр закрылся!");

    }
    int numberOfVisitors;
    int ticketCost;
    void makePerfomance(){
        popularity=popularity+1000;
        numberOfVisitors=numberOfVisitors+1000;
        System.out.println("проводится представление!");
    }

}
