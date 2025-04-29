package se.emma.lektioner;

import java.util.ArrayList;
import java.util.Random;

public class Compliments {
    ArrayList <String> compliments = new ArrayList <>();


    public Compliments(){
        compliments.add("Vad stark du är");
        compliments.add("Vad smart du är");
        compliments.add("Bra jobbat idag");
        compliments.add("Du är en riktig kung");
        compliments.add("Snabbare än blixten är du");
    }

    public String getRandomCompliment(){
        Random r = new Random();
        return compliments.get(r.nextInt(compliments.size()-1));
    }
}
