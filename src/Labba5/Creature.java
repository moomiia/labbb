package Labba5;

import java.io.IOException;

abstract class Creature implements Speak, Fate {
   protected int satiety;
protected int tiredness;
protected int happiness;
protected int numberOfPartners;
Creature(int satiety, int tiredness, int happiness, int numberOfPartners){
    this.satiety=satiety;
    this.tiredness=tiredness;
    this.happiness=happiness;
    this.numberOfPartners=numberOfPartners;
}

public void eat (){
    satiety= (satiety+10);
    System.out.println("вы покушали");
}
public void sleep (){
    tiredness=  (tiredness-10);
    System.out.println("вы поспали");
}
public void laugh() throws IOException {
    happiness= (happiness+10);
    System.out.println("axaxxaaxaxa");
}
public int getSatiety(){
    return satiety;
}
public int getTiredness(){
    return tiredness;
}
public int getHappiness(){
    return happiness;
}
public int getNumberOfPartners(){
    return numberOfPartners;
}

}
