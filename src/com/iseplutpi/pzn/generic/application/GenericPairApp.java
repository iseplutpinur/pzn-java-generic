package com.iseplutpi.pzn.generic.application;

import com.iseplutpi.pzn.generic.Pair;

public class GenericPairApp {
    public static void main(String[] args) {
        Pair<String, Integer> stringIntegerPair = new Pair<String, Integer>("Umur", 22);
        Pair<String, String> stringStringPair = new Pair<String, String>("Nama", "Isep Lutpi Nur");

        String umur = stringIntegerPair.getFrist() + ": " + stringIntegerPair.getSecond();
        String nama = stringStringPair.getFrist() + ": " + stringStringPair.getSecond();
        System.out.println(umur);
        System.out.println(nama);
    }
}
