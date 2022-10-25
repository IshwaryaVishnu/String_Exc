package se.lexicon;

public class Lower_Uppercase {
    public static void main(String[] args)
    {
        String originalString = "CAPS EQUALS SCREAMING";
        System.out.println("Lower Case:" + (originalString.toLowerCase()));//Convert to LowerCase
        System.out.println("Upper Case:" + (originalString.toUpperCase())); //Convert to UpperCase
    }
}
