package me.snajdovski.vezbi6.primer3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortiranjeNaListaOdFakulteti {

    public static void main(String[] args) {

        ArrayList<String> fakulteti = new ArrayList<>();
        fakulteti.add("FIKT");
        fakulteti.add("FINKI");
        fakulteti.add("PMF");
        fakulteti.add("FEIT");

        //sort the collection
        Collections.sort(fakulteti);

    for(String s: fakulteti){
        System.out.println(s);
    }

    }



}
