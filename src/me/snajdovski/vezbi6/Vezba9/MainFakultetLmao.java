package me.snajdovski.vezbi6.Vezba9;

import java.util.ArrayList;
import java.util.List;

public class MainFakultetLmao {
    public static void main(String[] args){
        List<Fakultet> listaOdFakulteti = new ArrayList<>();
        listaOdFakulteti.add(new Fakultet("FIKT", 2,500));
        listaOdFakulteti.add(new Fakultet("FINKI", 4,3000));
        listaOdFakulteti.add(new Fakultet("FEIT", 2,100));
        listaOdFakulteti.add(new Fakultet("PMF", 10,300));
        listaOdFakulteti.add(new Fakultet("IDK", 3,1000));

        //Ne sum siguren dali vaka se misleshe lol

        for(Fakultet fakultet : listaOdFakulteti){
            System.out.println(fakultet.toString());
        }

    }
}
