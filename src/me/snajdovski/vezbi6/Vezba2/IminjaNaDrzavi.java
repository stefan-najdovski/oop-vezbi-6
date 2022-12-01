package me.snajdovski.vezbi6.Vezba2;

import java.util.ArrayList;
import java.util.List;

/**
 * Да се креира листа од стрингови во која ќе се сместуваат имиња на држави. Да се
 * додадат неколку држави. Да се испечати големината на листата. Доколку се
 * внесени три држави, да се додадат уште две и да се испечатат елементите од
 * листата. Во спротивно, само да се испечатат елементите од листата.

 */


public class IminjaNaDrzavi {

    public static void main(String[] args) {

        List<String> drzavi = new ArrayList<>();
        drzavi.add("Makedonija");
        drzavi.add("Srbija");
        drzavi.add("Bugarija");
        drzavi.add("Grcija");

        System.out.println("Listata sodrzhi: " + drzavi.size() + " elementi.");
        System.out.println("Elementite na listata se: " + drzavi);
        if(drzavi.size() > 3){
            drzavi.add("Hrvatska");
            drzavi.add("Bosna i Hercegovina");
            System.out.println("Elementite na listata se: " + drzavi);
        }

    }

}

