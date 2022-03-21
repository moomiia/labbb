package Labba5;

import Labba5.Building;

public class Stadium extends Building {
    public Stadium(int height, int popularity,int numberOfVisitors, int ticketCost) {
        super(height, popularity);
        this.numberOfVisitors=numberOfVisitors;
        this.ticketCost=ticketCost;
    }

    @Override
    void open() {
        System.out.println("стадион открыт!");

    }

    @Override
    void close() {
        System.out.println("стадион закрыт!");

    }
int numberOfVisitors;
int ticketCost;
void holdFootballMatch() throws StadiumException {
    popularity=popularity+1000;
    numberOfVisitors=numberOfVisitors+1000;
    if (numberOfVisitors<10000){
        System.out.println("футбольный матч начался!");
    } else {
        throw new StadiumException("на стадионе не хватает мест!");
    }


}

}
