import java.util.Random;

class Tracker {

    //vars
    private int boardPieces;

    //caonstructors
    public Tracker() {
        boardPieces = 20; // sets board to temp number
    }

    //methods

    //determines and sets initial number of pieces
    public void setBoard() {
        Random rand = new Random();
        boardPieces = rand.nextInt(20) + 20; // random number of pieces from 20 - 40
    }

    // removes pieces from board if they pass the requirements
    public void removePieces(int n) {
        if (checkPieces(n)) { //checks if pieces are less than half
            boardPieces -= n;
        } else {
            System.out.println("Invalid input. You lose your turn.");
        }
    }

    //returns how many pieces are currently on the board
    public int checkBoard() {
        return boardPieces;
    }

    //checks if the input num of pieces is within the requirements (less than half)
    public boolean checkPieces(int num) {
        int total = boardPieces;
        int half_total = total/2;

        if (total == 1 && num == 1) {//if last number, remove 1
            return true;
        }
        if (num <= half_total) {//checks if less than half
            return true;
        } else {
            return false;
        }
    }

}