//#import Scanner as sc

class Game {

    //vars

    //constructor
    public Game() {}

    //methods
    public void play() {
        //set up scanner

        //get player names and set up
        String player1name = "";
        Player player1 = new Player(player1name);
        String player2name = "";
        Player player2 = new Player(player2name);

        //set up board
        Tracker tracker = new Tracker();

        int turn = 1;
        boolean run = true;
        Player curr_Player;
        int num_pieces;

        while (run) {
            //set player turn
            if (turn == 1) {
                curr_Player = player1;
                turn += 1;
            } else {
                curr_Player = player2;
                turn -= 1;
            }

            //get pieces
            System.out.println("There are " + tracker.checkBoard() + " pieces on the board right now.");
            System.out.println("How many pieces would you like to take: ");
            //scanner input / input validation
            num_pieces = 1;
            Tracker.removePieces(num_pieces);

            if (Tracker.checkBoard() == 0) {
                System.out.println("Uh oh, " + curr_Player.getName() + " lost!");
                System.out.println("The winner is the other player!");
                run = false;
            }

        }

    }
}