package me.snajdovski.vezbi6.Vezba9;

/**
 * Да се креира класа Fakultet со приватни атрибути
 * за име на факултет, број на смерови и вкушно студенти.
 * Да се креира и динамичен конструктор за класата.
 * Воглавната класа да се креира листа од објекти
 * од класата Fakultet, да се додадат пет
 * објекти и истите да се испечатат.
 */



public class Fakultet {
    private String imeNaFakultet;
    private int brojNaSmerovi;
    private int vkupnoStudenti;

    public Fakultet(String imeNaFakultet, int brojNaSmerovi, int vkupnoStudenti) {
        this.imeNaFakultet = imeNaFakultet;
        this.brojNaSmerovi = brojNaSmerovi;
        this.vkupnoStudenti = vkupnoStudenti;
    }

    public String toString(){
        return "Ime na fakultet: " + imeNaFakultet + " Broj na smerovi: " + brojNaSmerovi + " Vkupno studenti: " + vkupnoStudenti;
    }
}
