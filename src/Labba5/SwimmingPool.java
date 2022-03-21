package Labba5;

import Labba5.Building;

public class SwimmingPool extends Building {
    public SwimmingPool(int height, int popularity, int numberOfVisitors, int ticketCost) {
        super(height, popularity);
        this.numberOfVisitors=numberOfVisitors;
        this.ticketCost=ticketCost;
    }

    @Override
    void open() {
        System.out.println("бассейн открыт!");
    }

    @Override
    void close() {
        System.out.println("бассейн закрыт!");

    }
    int numberOfVisitors;
    int ticketCost;
    void holdTraining(){
        System.out.println("в бассейне занимаютя!");
    }

}
