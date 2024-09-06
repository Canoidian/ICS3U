

import java.util.Scanner;

public class SuperTicTacToe {
    public static String[][][][] board = new String[3][3][3][3];
    public static int[] wins = new int[9];
    
    //!---------------------------------------------------------------------------------------------------------------------------------
    //~ Initialize the board with "~"
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        board[i][j][k][l] = "~";
                    }
                }
            }
        }
    }
    
    //!---------------------------------------------------------------------------------------------------------------------------------
    //~ Prints the board
    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int d = 0; d < 3; d++) {
                for (int e = 0; e < 3; e++) {
                    for (int c = 0; c < 3; c++) {
                        System.out.print(board[i][e][d][c]);
                    }
                    if (e != 2) {
                        System.out.print("|");
                    }
                }
                System.out.println();
            }
            if (i != 2) {
                System.out.println("-----------");
            }
        }
    }
    
    //!---------------------------------------------------------------------------------------------------------------------------------
    //~ Prints rules
    public static void printRules() {
        System.out.println("Welcome to SUPER Tic Tac Toe! Super tic tac toe is like regular tic tac toe, except that in the place of each location where you would usually place an object in regular tic tac toe, there is another tic tac toe board. To start, you begin in the middle of the board at in the center board where depending on where you place in that board, is where the next player places their symbol in. Ex: P1 places in middle upper right, P2 has to play anywhere in the upper right board. Upon winning a board, that board is entirely yours. When you are forced to play in a board that's already been captured, you are then able to place in any board of your choosing. First to win 3 boards in a row wins. The boards are ordered with it starting on board 1 in the top left going left to right, top to bottom in increasing board number");
    }
    
    //!---------------------------------------------------------------------------------------------------------------------------------
    //~ Takes in the users row and column as well as board
    //~ Returns true if users move does not have a X or O in its position
    public static boolean validMove(int row, int column, int miniB) {
        miniB -= 1;
        int boardRow = miniB / 3, boardColumn = miniB % 3;
        
        if (board[boardRow][boardColumn][row][column].equalsIgnoreCase("X") || board[boardRow][boardColumn][row][column].equalsIgnoreCase("O")) {
            System.out.println("Invalid Move\n");
            return false;
        }
        
        return true;
    }
    
    //!---------------------------------------------------------------------------------------------------------------------------------
    //~ Takes in the board being played in
    //~ Returns true if the player has won in that board
    public static boolean checkIfWinSpace(int miniBoard) {
        boolean win = false;
        int boardRow = (miniBoard - 1) / 3;
        int boardColumn = (miniBoard - 1) % 3;

        for (int i = 0; i < 3; i++) { // checks horizontal and vertical wins
            if ((board[boardRow][boardColumn][i][0].equalsIgnoreCase("X") && board[boardRow][boardColumn][i][1].equalsIgnoreCase("X") && board[boardRow][boardColumn][i][2].equalsIgnoreCase("X")) ||
                (board[boardRow][boardColumn][i][0].equalsIgnoreCase("O") && board[boardRow][boardColumn][i][1].equalsIgnoreCase("O") && board[boardRow][boardColumn][i][2].equalsIgnoreCase("O"))) {
                win = true;
            }
            if ((board[boardRow][boardColumn][0][i].equalsIgnoreCase("X") && board[boardRow][boardColumn][1][i].equalsIgnoreCase("X") && board[boardRow][boardColumn][2][i].equalsIgnoreCase("X")) ||
                (board[boardRow][boardColumn][0][i].equalsIgnoreCase("O") && board[boardRow][boardColumn][1][i].equalsIgnoreCase("O") && board[boardRow][boardColumn][2][i].equalsIgnoreCase("O"))) {
                win = true;
            }
        }
        
        if ((board[boardRow][boardColumn][0][0].equalsIgnoreCase("X") && board[boardRow][boardColumn][1][1].equalsIgnoreCase("X") && board[boardRow][boardColumn][2][2].equalsIgnoreCase("X")) ||
            (board[boardRow][boardColumn][0][0].equalsIgnoreCase("O") && board[boardRow][boardColumn][1][1].equalsIgnoreCase("O") && board[boardRow][boardColumn][2][2].equalsIgnoreCase("O"))) {
            win = true;
        }
        
        if ((board[boardRow][boardColumn][0][2].equalsIgnoreCase("X") && board[boardRow][boardColumn][1][1].equalsIgnoreCase("X") && board[boardRow][boardColumn][2][0].equalsIgnoreCase("X")) ||
            (board[boardRow][boardColumn][0][2].equalsIgnoreCase("O") && board[boardRow][boardColumn][1][1].equalsIgnoreCase("O") && board[boardRow][boardColumn][2][0].equalsIgnoreCase("O"))) {
            win = true;
        }

        return win;
    }
    //!---------------------------------------------------------------------------------------------------------------------------------
    public static int checkFinalWin(){
        for (int i = 0; i <9; i += 3){
            if (wins[i] == 1 && wins[i+1] == 1 && wins[i+2] == 1){
                return 1;
            }
            else if (wins[i] == 2 && wins[i+1] == 2 && wins[i+2] == 2){
                return 2;
            }
        }
        for (int i = 0; i < 3; i++){
            if (wins[i] == 1 && wins[i+3] == 1 && wins[i+6] == 1){
                return 1;
            }
            else if (wins[i] == 2 && wins[i+3] == 2 && wins[i+6] == 2){
                return 2;
            }
        }
        if ((wins[0] == 1 && wins[4] == 1 && wins[8] == 1) || (wins[2] == 1 && wins[4] == 1 && wins[6] == 1)){
            return 1;
        }
        else if ((wins[0] == 2 && wins[4] == 2 && wins[8] == 2) || (wins[2] == 2 && wins[4] == 2 && wins[6] == 2)){
            return 2;
        }

        return 0;
    }
    //!---------------------------------------------------------------------------------------------------------------------------------
    public static boolean checkIfBoardWork(int board, int[] winsArray) {
        boolean valid = true;
        if (winsArray[board - 1] == 1 || winsArray[board - 1] == 2) {
            valid = false;
            System.out.println("Board already claimed");
        }
        return valid;
    }
    
    //!---------------------------------------------------------------------------------------------------------------------------------
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    //!---------------------------------------------------------------------------------------------------------------------------------
    //~ Main program
    public static void main(String[] args) {
        initializeBoard();
        //fills wins with 0's representing not yet won games
        for (int i = 0; i < 3; i++){
            wins[i] = 0;
        }
        Scanner input = new Scanner(System.in);
        
        // Variables
        boolean p1win = false, p2win = false;
        int boardMini = 5, row, column, boardRow, boardColumn;
    
        // Prints rules and takes an input at the START to begin the game
        printRules();
        System.out.print("Press Enter to Start");
        input.nextLine();
        System.out.println("\n");
        
        while (!p1win && !p2win) {
            // Player 1 move
            System.out.println("Current Board: " + boardMini);
            printBoard();
            System.out.print("P1 Enter row (1, 2, 3): ");
            row = input.nextInt() - 1;
            System.out.print("P1 Enter column (1, 2, 3): ");
            column = input.nextInt() - 1;

            while (!validMove(row, column, boardMini)) {
                System.out.print("P1 Enter row (1, 2, 3): ");
                row = input.nextInt() - 1;
                System.out.print("P1 Enter column (1, 2, 3): ");
                column = input.nextInt() - 1;
            }
            clear();

            boardRow = (boardMini - 1) / 3;
            boardColumn = (boardMini - 1) % 3;
            board[boardRow][boardColumn][row][column] = "X";

            if (checkIfWinSpace(boardMini)) { //^ p1 board win
                System.out.println("Board Won\n");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        board[boardRow][boardColumn][i][j] = "X";
                    }
                }
                wins[boardMini - 1] = 1;
            } 
            boardMini = row * 3 + column + 1;
            
            //^ Check overall win condition for Player 1
            if (checkFinalWin() == 0){
                if (!checkIfBoardWork(boardMini, wins)) {
                    printBoard();
                    System.out.print("P2, which board would you like to play in?: ");
                    boardMini = input.nextInt();
                    while (!checkIfBoardWork(boardMini, wins)) {
                        System.out.print("P2, which board would you like to play in?: ");
                        boardMini = input.nextInt();
                    }
                }
    
                //^ Player 2 move
                System.out.println("Current Board: " + boardMini);
                printBoard();
                System.out.print("P2 Enter row (1, 2, 3): ");
                row = input.nextInt() - 1;
                System.out.print("P2 Enter column (1, 2, 3): ");
                column = input.nextInt() - 1;
    
                while (!validMove(row, column, boardMini)) {
                    System.out.print("P2 Enter row (1, 2, 3): ");
                    row = input.nextInt() - 1;
                    System.out.print("P2 Enter column (1, 2, 3): ");
                    column = input.nextInt() - 1;
                }
                clear();
    
                boardRow = (boardMini - 1) / 3;
                boardColumn = (boardMini - 1) % 3;
                board[boardRow][boardColumn][row][column] = "O";
    
                if (checkIfWinSpace(boardMini)) {
                    System.out.println("Board Won\n");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            board[boardRow][boardColumn][i][j] = "O";
                        }
                    }
                    wins[boardMini - 1] = 2;
                } 
                boardMini = row * 3 + column + 1;
                
    
                //^ Check overall win condition for Player 2
                if (checkFinalWin() == 2){
                    p2win = true;
                    printBoard();
                }
                else{
                    if (!checkIfBoardWork(boardMini, wins)) {
                        printBoard();
                        System.out.print("P1, which board would you like to play in?: ");
                        boardMini = input.nextInt();
                        while (!checkIfBoardWork(boardMini, wins)) {
                            System.out.print("P1, which board would you like to play in?: ");
                            boardMini = input.nextInt();
                        }
                    }
                }
            }
            else{
                p1win = true;
                printBoard();
            }
        }

        //^final win statement prints
        if (p1win){
            System.out.println("Player one wins!");
        }
        else{
            System.out.println("Player two wins");
        }
    }
}