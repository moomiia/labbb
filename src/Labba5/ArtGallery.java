package Labba5;

public class ArtGallery extends Building {
    public ArtGallery(int height, int popularity, int numberOfVisitors, int ticketCost) {
        super(height, popularity);
        this.numberOfVisitors=numberOfVisitors;
        this.ticketCost=ticketCost;

    }

    @Override
    void open() {
        System.out.println("арт галерея открыта!");
    }

    @Override
    void close() {
        System.out.println("арт галерея закрыта!");

    }
    int numberOfVisitors;
    int ticketCost;
    void holdAnExhibition(){
        popularity=popularity+1000;
        numberOfVisitors=numberOfVisitors+1000;
        System.out.println("внимание! проводится выставка в арт галерее!");
    }
}
