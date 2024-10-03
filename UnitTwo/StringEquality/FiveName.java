import java.util.Scanner;

public class FiveName {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        String previous = "", current, acc;
        int counter = 5;
        Scanner input = new Scanner(System.in);

        while (counter > 0) {
            System.out.print("Please enter name number " + counter + ": ");
            current = input.nextLine();

            if (!current.equals(previous)) {
                previous = current;
                counter--;
            } else {
                System.out.println("This name is the same as the previous one. Please enter a different name.");
            }

            acc = previous;

            System.out.print(counter);

        }

        while (counter < 5) {
        }
    }
}
