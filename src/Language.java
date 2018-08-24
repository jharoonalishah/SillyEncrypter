package com.rxjava.Algorithm.Encoder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by haroon.shah on 2018/08/11.
 */
public class Language {

    private Map<Character,String> vowels = new HashMap<Character,String>();
    private Map<Character, String> consonants = new HashMap<Character, String>();

    public Language(){
        setUpVowels();
        setUpConsonants();
    }

    public void setUpConsonants() {

        consonants.put('b', ":");
        consonants.put('c', ":.");
        consonants.put('d', ":..");
        consonants.put('f', ".:.");
        consonants.put('g', "..:");
        consonants.put('h', "::.");
        consonants.put('j', ":.:");
        consonants.put('k', ".::");
        consonants.put('l', ":::");
        consonants.put('m', "|.");
        consonants.put('n', ".|");
        consonants.put('p', "||.");
        consonants.put('q', "|.|");
        consonants.put('r', "|||");
        consonants.put('s', "|:");
        consonants.put('t', ":|");
        consonants.put('v', "|:.");
        consonants.put('w', ":|.");
        consonants.put('x', ".:|");
        consonants.put('y', "|:|");

    }

    public void setUpVowels() {
        vowels.put('a', "`");
        vowels.put('i', "_");
        vowels.put('u', "∆");
        vowels.put('e', "∫");
        vowels.put('o', "0");
    }

    public String getVowelChar(char c){
        return vowels.get(c);
    }

    public String getConsonantChar(char c){
        return consonants.get(c);
    }

    public char getVowelCharKey(String s){
        Character key = null;
        for (Map.Entry<Character, String> entry : vowels.entrySet()) {
            if (entry.getValue().equals(s)) {

                // System.out.println("Vowel -> " + entry.getKey());
                key = entry.getKey();
            }
        }
       return key;
    }

    public char getConsonantCharKey(String s){

        Character key = null;
        for (Map.Entry<Character, String> entry : consonants.entrySet()) {
            if (entry.getValue().equals(s)) {

                // System.out.println("Consonant -> " + entry.getKey());
                return entry.getKey();
            }
        }
        return key;
    }
}
