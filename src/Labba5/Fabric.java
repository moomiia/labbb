package Labba5;

import Labba5.Building;

public class Fabric extends Building {
    public Fabric(int height, int popularity, int numberOfMachines, int numberOfWorkers) {
        super(height, popularity);
        this.numberOfMachines=numberOfMachines;
        this.numberOfWorkers=numberOfWorkers;
    }

    @Override
    void open() {
        System.out.println("фабрика открыта!");
    }

    @Override
    void close() {
        System.out.println("фабрика закрыта!");

    }
    int numberOfWorkers;
    int numberOfMachines;
    void produceProducts(){
        System.out.println("производятся продукты на фабрике!");
    }

}
