class Tracker {

    //vars
    private int boardPieces;

    //caonstructors
    public Tracker() {
        boardPieces = 20;
    }

    //methods

    public static void removePieces(int n) {
        if (checkPieces(n)) {
            boardPieces -= n;
        } else {
            System.out.println("Invalid input. Please try again: ")
            //scanner class
        }
        
    }

    public int checkBoard() {
        return boardPieces;
    }

    public static boolean checkPieces(int num) {
        int total = boardPieces;
        int half_total = total/2;

        if (num <= half_total) {
            return true;
        } else {
            return false;
        }
    }

}