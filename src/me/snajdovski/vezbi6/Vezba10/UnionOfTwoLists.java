package me.snajdovski.vezbi6.Vezba10;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoLists {

public static void main(String[] args){

String[] firstList = {"abba", "babba", "car", "door", "endek", "ford", "grandpa", "help", "insecure", "justice","harambe"};
String[] secondList = {"ada", "bad", "cool", "door", "endek", "ford", "grandpa", "hell", "insecure", "justice","hopper"};
    HashSet<String> union = new HashSet<>();
    union.addAll(Arrays.asList(firstList));
    union.addAll(Arrays.asList(secondList));

    String[] unionArr = {};
    unionArr = union.toArray(unionArr);
    System.out.println(Arrays.toString(unionArr));

}

}
