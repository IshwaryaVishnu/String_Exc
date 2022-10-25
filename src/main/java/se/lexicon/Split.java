package se.lexicon;
public class Split {
        public static void main(String[] args) {
            String originalString = "Carl, Susie, Fredrick, Bob, Erik";
            String[] arraySplit = originalString.split(", ");
            for (String array : arraySplit)
                System.out.println(array);
        }
}


