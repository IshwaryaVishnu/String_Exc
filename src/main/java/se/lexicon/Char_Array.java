package se.lexicon;

public class Char_Array {
    public static void main(String[] args) {
        String originalString = "ThisShouldBeConverted";
        char[] charArray = new char[originalString.length()];
        for (int i = 0; i < originalString.length(); i++) {
            charArray[i] = originalString.charAt(i);
        }
        for (char array : charArray)System.out.println(array);
            }
}

