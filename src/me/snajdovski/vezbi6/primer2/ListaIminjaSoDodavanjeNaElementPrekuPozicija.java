package me.snajdovski.vezbi6.primer2;

import java.util.ArrayList;
import java.util.List;

public class ListaIminjaSoDodavanjeNaElementPrekuPozicija {
    public static void main(String[] args){
        List<String> lista = new ArrayList<>();
        lista.add("Stefan");
        lista.add("Maja");
        lista.add("Stefanija");

        System.out.println("Elementite na listata se: " + lista);

        lista.add(3, "Petko");
        System.out.println("Vtoriot Element na listata e " + lista.get(2));
    System.out.println("Iteracija na site elementi od listata:");
    for(String s: lista){
        System.out.println(s);
    }


    }
}
