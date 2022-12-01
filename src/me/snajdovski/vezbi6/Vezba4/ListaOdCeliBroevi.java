package me.snajdovski.vezbi6.Vezba4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOdCeliBroevi {

    public static void main(String[] args) {

        List<Integer> listaOdCeliBroevi = new ArrayList<>();
        listaOdCeliBroevi.add(2);
        listaOdCeliBroevi.add(123);
        listaOdCeliBroevi.add(5);
        listaOdCeliBroevi.add(1);
        listaOdCeliBroevi.add(3);

        Collections.sort(listaOdCeliBroevi);
        System.out.println("Sortirana lista od celobroevi: " + listaOdCeliBroevi);


    }
}
