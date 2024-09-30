package UnitOne.D_IStatements;

public class NIM {
    public static void main(String[] args) {
        int pile = 20, remove = 0, player = 2, again = 1; // 1 means yes 2 mean no


        // Game explanation
        System.out.println("\n\nIn this game you and a partner will start with a pile of 20 stones.");
        System.out.println("You and your partner will take turns removing 1, 2, or 3 stones.");
        System.out.println("Whoever removes the last stone loses.");


        while (again == 1) {
            while (pile < 1) {
                //This will change from player 1 to 2 or 2 to 1
                player = player % 2 + 1;

                
            }
        }
    }
}
