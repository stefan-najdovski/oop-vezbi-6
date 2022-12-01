package me.snajdovski.vezbi6.Vezba6;

import java.util.ArrayList;
import java.util.List;

public class ListaOdMailovi {
    public static void main(String[] args) {

        List<String> listaOdMailovi = new ArrayList<>();


        for(int i = 1; i <= 20 ; i++){
            listaOdMailovi.add("mail" + i + "@yahoo.com");
        }
        System.out.println(listaOdMailovi);



    }
}
