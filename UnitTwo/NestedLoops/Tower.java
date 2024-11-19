package UnitTwo.NestedLoops;

public class Tower {
    public static void main(String[] args) {
        
        for (int row = 1; row <= 15; row++) {
            for (int star = 1; star<=row; star++) {
                for (int space = 1; space<=15-row; space++) {
                    System.out.print("\t\t\t");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}