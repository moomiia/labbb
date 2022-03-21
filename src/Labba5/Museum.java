package Labba5;

import Labba5.Building;

public class Museum extends Building {
    public Museum(int height, int popularity, int numberOfVisitors, int ticketCost) {
        super(height, popularity);
        this.numberOfVisitors=numberOfVisitors;
        this.ticketCost=ticketCost;

    }

    @Override
    void open() {
        System.out.println("музей открыт!");
    }

    @Override
    void close() {
        System.out.println("музей закрыт!");

    }
    int numberOfVisitors;
    int ticketCost;
    void holdAnExhibition(){
        popularity=popularity+1000;
        numberOfVisitors=numberOfVisitors+1000;
        System.out.println("внимание! проводится выставка в музее!");
    }
}
