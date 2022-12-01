package me.snajdovski.vezbi6.Vezba1;

import java.util.ArrayList;
import java.util.List;

/***
 * 1. Да се креира листа од стрингови во која ќе се сместуваат имињата на градовите. Да
 * се додадат пет градови и да се испечатат елементите на листата.
 */

public class IminjaNaGradovi {

    public static void main(String[] args) {

        List<String> gradovi = new ArrayList<>();
        gradovi.add("Bitola");
        gradovi.add("Skopje");
        gradovi.add("Ohrid");
        gradovi.add("Kumanovo");
        gradovi.add("Veles");
        gradovi.add("Prilep");
        gradovi.add("Strumica");
        gradovi.add("Kavadarci");
        gradovi.add("Kicevo");
        gradovi.add("Tetovo");
        gradovi.add("Gostivar");
        gradovi.add("Stip");
        gradovi.add("Kratovo");
        gradovi.add("Kochani");

        for(String s: gradovi){
            System.out.println(s);
        }

    }


}
