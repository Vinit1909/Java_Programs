package com.penaltyshootout.assignment;

import java.util.HashMap;
import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        isomorphic("egg", "add");
    }

    public static boolean isomorphic(String s, String t) {
        s = "egg";
        t = "add";
        HashMap<Character, Character> newHash1 = new HashMap<>();
        HashMap<Character, Character> newHash2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sourceChar = s.charAt(i);
            char destChar = s.charAt(i);
            char sourceReturn = newHash1.getOrDefault(sourceChar, destChar);
            System.out.println("\n"+newHash1);
            System.out.println(newHash2);
            System.out.println(sourceReturn);

            if (sourceReturn != destChar) {
                return false;
            }
            newHash1.put(sourceChar, destChar);
//            System.out.println("\n"+newHash1);
//            System.out.println(newHash2);
            char destReturn = newHash2.getOrDefault(destChar, sourceChar);
            if(destReturn != sourceChar){
                return false;
            }
            newHash2.put(destChar, sourceChar);
            System.out.println("\n"+newHash1);
            System.out.println(newHash2);
        }
        return true;
    }
}


//        Practice p = new Practice();
//        System.out.println(p.Fact(5));
//
//    }
//
//    public int Fact(int n){
//        if (n == 0){
//            return 1;
//        }
//        else if(n == 1) {
//            return 1;
//        }
//        else{
//            return n*Fact(n-1);
//        }
//    }
