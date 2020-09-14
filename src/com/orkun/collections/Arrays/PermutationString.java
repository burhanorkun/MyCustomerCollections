package com.orkun.collections.Arrays;

import java.util.Arrays;

public class PermutationString {

    public static void main(String[] args) {
        boolean permutation = permutation("Dog", "God");
        System.out.println("Permutation: " + permutation);
    }

    private static boolean permutation(String s, String t) {
        if(s.length() != t.length())
            return false;
        return sort(s).equals(sort(t));
    }

    public static String sort(String s){
        String s1 = s.toLowerCase();
        char[] chars = s1.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }
}
