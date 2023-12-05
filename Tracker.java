import java.util.Random;

class Tracker {

    //vars
    private int boardPieces;

    //caonstructors
    public Tracker() {
        boardPieces = 20;
    }

    //methods
    public void setBoard() {
        Random rand = new Random();
        boardPieces = rand.nextInt(40);
        if (boardPieces < 20) {
            this.setBoard();
        }
    }

    public void removePieces(int n) {
        if (checkPieces(n)) {
            boardPieces -= n;
        } else {
            System.out.println("Invalid input.");
            //scanner class
        }
        
    }

    public int checkBoard() {
        return boardPieces;
    }

    public boolean checkPieces(int num) {
        int total = boardPieces;
        int half_total = total/2;

        if (total == 1 && num == 1) {
            return true;
        }
        if (num <= half_total) {
            return true;
        } else {
            return false;
        }
    }

}