package UnitTwo.StringMethods;

public class Piglatin {
    public static void main(String[] args) {
        String word = "Hello";
        String piglatin = word.substring(1) + word.charAt(0) + "ay";
        System.out.println(piglatin);
    }
}
