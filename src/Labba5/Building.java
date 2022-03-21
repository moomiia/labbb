package Labba5;

abstract class Building {
    protected int height;
    protected int popularity;
    abstract void open();
    abstract void close();
    int getHeight(){
        return height;
    }
    int getPopularity(){
        return popularity;
    }
public Building(int height, int popularity){
     this.height=height;
     this.popularity=popularity;
}

}
