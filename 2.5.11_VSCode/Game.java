import java.util.Scanner;

class Game {

    //vars

    //constructor
    public Game() {}

    //methods
    public void play() {
        //set up scanner
        Scanner sc = new Scanner(System.in);

        //get player names and set up
        System.out.println("Player 1, please enter your name: ");
        String player1name = sc.next();
        Player player1 = new Player(player1name);
        System.out.println("Player 2, please enter your name: ");
        String player2name = sc.next();
        Player player2 = new Player(player2name);

        //set up board
        Tracker tracker = new Tracker();
        tracker.setBoard();
        
        //explain rules
        System.out.println("---------------------------------------------------");
        System.out.println("How to Play :");
        System.out.println("The board has " + tracker.checkBoard() + " pieces.");
        System.out.println("Players will alternate turns, where they remove pieces from the board.");
        System.out.println("Each player may only take less than half of the pieces currently on the board.");
        System.out.println("The player to take the last piece will lose.");
        System.out.println("------------------------------------------");
        System.out.println("When inputting answers, only enter integers!!!!! or else you will automatically lose for cheating.");
        System.out.println("Good luck, may the best win.");
        System.out.println("------------------------------------");
        int turn = Player.choosePlayer();
        boolean run = true;
        Player curr_Player;
        int num_pieces;

        while (run) {
            //set player turn
            if (turn == 0) {
                curr_Player = player1;
                turn += 1;
            } else {
                curr_Player = player2;
                turn = 0;
            }
            System.out.println(curr_Player.getName() + "'s turn");

            //get/remove pieces
            System.out.println("There are " + tracker.checkBoard() + " pieces on the board right now.");
            System.out.println("How many pieces would you like to take: ");

            try {
                num_pieces = sc.nextInt();
                tracker.removePieces(num_pieces);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("You cheated. You lose your turn. TTTT");
            }

            //check for end game
            if (tracker.checkBoard() == 0) {
                System.out.println("Uh oh, " + curr_Player.getName() + " lost!");
                System.out.println("The winner is the other player!");
                run = false;
            }
        }
        /*
        //scores
        System.out.println("----------------------------------------------");
        System.out.println(curr_Player.getName() + " has " + curr_Player.getPoints() + " points.");
        //switch player
        System.out.println("");
        */
        
        sc.close();
    }
}