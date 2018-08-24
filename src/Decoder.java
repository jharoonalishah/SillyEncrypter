package com.rxjava.Algorithm.Encoder;

/**
 * Created by haroon.shah on 2018/08/24.
 */
public class Decoder {

    Language language;

    public Decoder(){ language = new Language();}



    public String decode(String text){

        final String CHAR_SEPERATOR = "";

        String decodedText = "";
        String[] splitText = text.split("˚");


        for(int i=0; i<splitText.length; i++){

            if(splitText[i].charAt(0) == '©'){
                decodedText += " ";
                splitText[i] = splitText[i].replace("©", "");
            }

            if(     splitText[i].equals("`") ||
                    splitText[i].equals("_") ||
                    splitText[i].equals("∆") ||
                    splitText[i].equals("∫") ||
                    splitText[i].equals("0"))
            {
                decodedText += Character.toString(language.getVowelCharKey(splitText[i])) ;
            }else {
                decodedText += Character.toString(language.getConsonantCharKey(splitText[i]));
            }

        }
        return decodedText;

    }
}
