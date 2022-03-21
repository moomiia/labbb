package Labba5;

import Labba5.Creature;

public class Worker extends Creature {
    int dissatisfaction=0;
    int numberOfChildren=0;
    private int salary;
    public Worker(int dissatisfaction, int numberOfChildren, int salary, int satiety,int tiredness, int happiness, int numberOfPartners ) {
        super(satiety, tiredness, happiness, numberOfPartners);
        this.dissatisfaction=dissatisfaction;
        this.numberOfChildren=numberOfChildren;
        this.salary=salary;
    }


    public void work () {
        dissatisfaction=  (dissatisfaction+10);
        salary=salary+10;
        tiredness=  (tiredness+10);
        satiety=satiety-10;
    }
    private void goToSleep(){
        tiredness=  (tiredness-10);


        System.out.println("zzzz");
    }
    void marry(){
        happiness=  (happiness+10);
        numberOfPartners= (numberOfPartners+1);
        numberOfChildren=  (numberOfChildren+1);

    }


    @Override
    public void say() {

        System.out.println("как же тяжело работать...");

    }

    @Override
    public void shout() {
        System.out.println("свергнем этот режим!");

    }

    @Override
    public void whisper() {
       System.out.println("кажется у меня что-то за спиной");

    }

    @Override
    public void loseSmth() {
        if (Math.random()>0.5){
            salary=salary-500;
            System.out.println("о нет! я потерял свои сбережения!");
        }
        else {
            satiety=satiety-10;
            System.out.println("о нет! я потерял насыщенность!");
        }

    }

    @Override
    public void getSick() {
        happiness=  (happiness-30);
        tiredness=  (tiredness+10);
        System.out.println("о нет! я заболел");

    }
}

    class children{
        public void annoy(){
            System.out.println("вам мешает ребенок!");

        }


    }



