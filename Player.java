import java.util.Random;

class Player {

    //variables
    private String name;

    //constructor
    public Player(String n) {
        name = n;
    }

    //methods
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public static int choosePlayer() {
        Random rand = new Random();
        return rand.nextInt(2);
    }
}