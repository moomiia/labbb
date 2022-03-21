package Labba5;

import Labba5.Creature;

public class Richpeople extends Creature {
    int numberOfFabrics;
    int incomePerMonth;
    private int pocketMoney;
    RichPeopleCapital currency;
    Richpeople(int satiety, int tiredness, int happiness, int numberOfPartners, int numberOfFabrics, int incomePerMonth, int pocketMoney, RichPeopleCapital currency) {
        super(satiety, tiredness, happiness, numberOfPartners);
        this.numberOfFabrics=numberOfFabrics;
        this.incomePerMonth=incomePerMonth;
        this.pocketMoney=pocketMoney;
        this.currency=currency;
    }
    public void getJob(){
        System.out.println("богач теперь работает");
        happiness= (happiness+10);

    }
    void thinkAboutMoney(){
        class Capital{

            RichPeopleCapital checkCurrency(){
                return currency;

            }


        }
        System.out.println("думает о деньгах");

    }
    void buySmth(){
        pocketMoney=pocketMoney-100;
        System.out.println("богач потратился и у него осталось: "+pocketMoney+" денег");

    }


    @Override
    public void say() {
        System.out.println("пора пить кофе");

    }

    @Override
    public void shout() {
        System.out.println("ПОЙДУ РАБОТАТЬ!");

    }

    @Override
    public void whisper() {
        System.out.println("кажется у меня что-то за спиной");

    }

    @Override
    public void loseSmth() {
        if (Math.random()>0.5){
            numberOfFabrics=numberOfPartners-1;
            System.out.println("о нет! я потерял фабрику!");
        }
        else {
            satiety=satiety-10;
            System.out.println("о нет! я потерял насыщенность!");
        }

    }

    @Override
    public void getSick() {
        happiness=  (happiness-30);
        tiredness= (tiredness+10);
        System.out.println("о нет! я заболел");
        incomePerMonth=incomePerMonth-100;

    }
}

