package Labba5;

import Labba5.Building;

public class Hospital extends Building {
    public Hospital(int height, int popularity, int numberOfVisitors, int numberOfDoctors) {
        super(height, popularity);
        this.numberOfDoctors=numberOfDoctors;
        this.numberOfVisitors=numberOfVisitors;

    }

    @Override
    void open() {
        System.out.println("открылась больница!");
    }

    @Override
    void close() {
        System.out.println("больница закрылась!");

    }
    int numberOfVisitors;
    int numberOfDoctors;
    void makeOperation(){
        System.out.println("проводится операция!");
    }
    void makeVaccination(){
        System.out.println("проводится вакцинация!");
    }

}
