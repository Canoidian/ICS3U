package UnitTwo.StringMethods;

public class ICS3UCool {
    public static void main(String[] args) {
        String name1 = "ics3uc";
        String description = "      is so cool      ";
        String punctuation = "!?,.";
        String phrase = "";
        int location = 0;

        phrase = name1.toUpperCase();

        description = description.trim();

        description = description.replaceAll("cool", "COOL");

        phrase = phrase + " " + description;

        location = punctuation.indexOf("!");

        phrase = phrase + punctuation.substring(location, location+1);


        System.out.print(name1.toUpperCase() + " " + description.trim().replaceAll("cool", "COOL" + punctuation.substring(location, location+1)));
    }
}
