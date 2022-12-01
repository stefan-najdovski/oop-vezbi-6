package me.snajdovski.vezbi6.Vezba11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Presek {
    public static void main(String[] args) {
      List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        l1.add("a");
        l1.add("b");
        l1.add("c");
        l1.add("d");
        l1.add("e");
        l2.add("a");
        l2.add("ba");
        l2.add("cd");
        l2.add("d");
        l2.add("e");
        Set<String> s1 = new HashSet<>(l1);
        Set<String> s2 = new HashSet<>(l2);
        s1.retainAll(s2);
        System.out.println(s1);
    }
}