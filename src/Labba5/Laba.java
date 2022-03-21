package Labba5;

import Labba5.ArtGallery;
import Labba5.Ferry;
import Labba5.Hospital;

public class Laba {
    public static void main(String[] args) throws StadiumException {
        System.out.println("начало");
Richpeople richpeople0= new Richpeople(100,100,1,0,5,500,500, RichPeopleCapital.EURO);
Richpeople richpeople1= new Richpeople(100,100,1,0,5,500,500, RichPeopleCapital.EURO);
Worker workers []= new Worker[20];
for (int i=0; i<20; i ++){
    System.out.println("недовольные накапливаются!");

    workers[i]=new Worker(50,2,600,100,50,1,0);
}
System.out.println("недовольные накопились и устроили митинг!");
        for (int i=0; i<20; i ++){
            workers[i].shout();
        }
        richpeople1.loseSmth();
        richpeople0.loseSmth();
        richpeople0.loseSmth();
        richpeople1.loseSmth();
        richpeople0.thinkAboutMoney();
        richpeople1.thinkAboutMoney();
        richpeople0.getJob();
        richpeople1.getJob();
        System.out.println("рабочие решили построить здания:");
        Theatre theatre= new Theatre(90,90,90,90);
        theatre.open();
        theatre.makePerfomance();
        Museum museum= new Museum(90,90,90,90);
        museum.open();
        museum.holdAnExhibition();
        ArtGallery artGallery= new ArtGallery(90,90,90,90);
        artGallery.open();
        artGallery.holdAnExhibition();
        Stadium stadium=new Stadium(90,90,90,90);
        stadium.open();
        try{
        stadium.holdFootballMatch();}
        catch (StadiumException e){
            System.out.println("нельзя провести матч!");
        }
        Hospital hospital=new Hospital(90,90,90,90);
        hospital.open();
        hospital.makeOperation();
        hospital.makeVaccination();
        Ferry ferry=new Ferry(5,5,90,10,90);
        ferry.goTo("Москва");
        System.out.println("конец");










}
}
