package com.rxjava.Algorithm.Encoder;

/**
 * Created by haroon.shah on 2018/08/11.
 */
public class Encoder {

    Language language;

    private String text;
    private String encodedText = "";
    final Character CHAR_SEPERATOR = '˚';

    public Encoder(){
        language = new Language();
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEncodedText() {
        return encodedText;
    }

    public void setEncodedText(String encodedText) {
        this.encodedText = encodedText;
    }


    public String startEncoding(){

        //- Split the text into array
        text = text.toLowerCase();
        char[] splitText = text.toCharArray();

        for(int i=0; i<splitText.length; i++){

            if(splitText[i] == ' '){
                encodedText += "©";
                continue;
            }


            if(     splitText[i] == 'a' ||
                    splitText[i] == 'i' ||
                    splitText[i] == 'u' ||
                    splitText[i] == 'e' ||
                    splitText[i] == 'o')
            {
                encodedText += language.getVowelChar(splitText[i]) + CHAR_SEPERATOR;
            }else {
                encodedText += language.getConsonantChar(splitText[i]) + CHAR_SEPERATOR;
            }
        }

        return encodedText;
    }

}
