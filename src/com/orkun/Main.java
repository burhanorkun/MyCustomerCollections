package com.orkun;

import com.orkun.collections.MyHashMap;

public class Main {

    public static void main(String[] args) {

        MyHashMap<String, String> map = new MyHashMap<>();
        map.put("1", "bir");
        map.put("2", "iki");
        System.out.println("Size: " + map.size());
        String bir = map.get("1");
        String iki = map.get("2");
        System.out.println(bir + " " + iki);
        System.out.println("Contains Key 1: " + map.containsKey("1"));
        System.out.println("Contains Key 2: " + map.containsKey("2"));
        System.out.println("Contains Key 3: " + map.containsKey("3"));
        map.put("3", "Dummy");
        System.out.println("Contains Key 3: " + map.containsKey("3"));
        System.out.println("Size: " + map.size());
        map.remove("3");
        System.out.println("Contains Key 3: " + map.containsKey("3"));
        System.out.println("Size: " + map.size());
        MyHashMap<String, String> map2 = new MyHashMap<>();
        map2.put("1", "bir");
        map2.put("2", "iki");
        map2.put("3", "uc");
        map2.put("4", "dort");
        map2.put("5", "bes");
        map2.put("6", "alti");
        map2.put("7", "yedi");
        map2.put("8", "sekiz");
        map2.put("9", "dokuz");
        map2.put("10", "on");
        map2.put("11", "oonbir");
        map2.put("12", "oniki");
        map2.put("13", "onuc");
        map2.put("14", "ondort");
        map2.put("15", "onbest");
        map2.put("16", "onalti");
        System.out.println("map2 size: " + map2.size());
        System.out.println("Get Key 1: " + map2.get("1"));
        System.out.println("Get Key 11: " + map2.get("11"));
        System.out.println("Get Key 6: " + map2.get("6"));
        System.out.println("Get Key 16: " + map2.get("16"));
        map2.removeAll();
        System.out.println("map2 size: " + map2.size());
    }
}
