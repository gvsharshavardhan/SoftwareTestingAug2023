package Strings;

public class StringReversal {
    public String reverseAString(String word) {
        //selenium -> muineles

        char[] letters = word.toCharArray();
        //s e l e n i u m
        int len = letters.length;
        char temp;

        for (int i = 0; i < len / 2; i++) {
            temp = letters[i];
            letters[i] = letters[len - 1 - i];
            letters[len - 1 - i] = temp;
        }

        return new String(letters);
    }


    public String reverseTheOrderOfTheWordsInASentence(String sentence){
        //let's start learning java programming

        //programming java learning start let's

        String[] words = sentence.split(" ");
        int len = words.length;
        String temp;

        for(int i=0;i<len/2;i++){
            temp = words[i];
            words[i] = words[len-i-1];
            words[len-i-1] = temp;
        }

        return String.join(" ",words);
    }



}
