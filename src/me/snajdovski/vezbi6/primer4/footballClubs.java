package me.snajdovski.vezbi6.primer4;

import java.util.ArrayList;
import java.util.List;

public class footballClubs {
    public static void main(String[] args) {
        List<String> footballClubs = new ArrayList<>();
        footballClubs.add("Manchester United");
        footballClubs.add("Liverpool");
        footballClubs.add("Chelsea");
        footballClubs.add("Arsenal");
        footballClubs.add("Tottenham");
        footballClubs.add("Manchester City");
        footballClubs.add("Everton");
        footballClubs.add("Leicester");

        System.out.println("Goleminata na listata e: " + footballClubs.size());
       for(String i: footballClubs){
           System.out.println(i);
       }

       footballClubs.remove("Manchester United");
       System.out.println("Manchester United bese izbrisan od listata");
       System.out.println("Goleminata na listata sega e: " + footballClubs.size());
        for(String i: footballClubs){
            System.out.println(i);
        }
    }
}
