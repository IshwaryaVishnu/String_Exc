package se.lexicon;

import java.util.Arrays;

public class Split_String {
    public static void main(String[] args) {
        String originalString = "Oil and water" ;
        System.out.println("Split:" + (Arrays.toString(originalString.split("and"))));
    }
}
