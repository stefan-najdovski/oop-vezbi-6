package me.snajdovski.vezbi6.Vezba5;

import java.util.ArrayList;
import java.util.List;

public class ListaOdCeliBroevi2 {

    public static void main(String[] args) {

        List<Integer> listaOdCeliBroevi = new ArrayList<>();
        listaOdCeliBroevi.add(2);
        listaOdCeliBroevi.add(123);
        listaOdCeliBroevi.add(5);
        listaOdCeliBroevi.add(420);
        listaOdCeliBroevi.add(3);

        System.out.println("Vtoriot element na listata e: " + listaOdCeliBroevi.get(2));
    }

}
