package me.snajdovski.vezbi6.primer5;

import java.util.ArrayList;
import java.util.List;

public class MainStudentClass {

    public static void main(String[] args){

        List<Student> studenti = new ArrayList<>();



        Student s1 = new Student("Trajko","Trajkovski",1);
        studenti.add(s1);
        studenti.add(new Student("Petko","Petkovski",2));
        for(int i =0; i < studenti.size(); i++){
            System.out.println(studenti.get(i));
        }
    }

}
