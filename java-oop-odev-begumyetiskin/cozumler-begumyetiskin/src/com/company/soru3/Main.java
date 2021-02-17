package com.company.soru3;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>();
        Pair<String, Double> p2 = new Pair<>();
        p1.setFirst(1);
        p1.setSecond("Begüm");
        p2.setFirst("Yetişkin");
        p2.setSecond(2.2);
        System.out.println(p1.getFirst() + " " + p1.getSecond());
        System.out.println(p2.getFirst() + " " + p2.getSecond());
    }
}
