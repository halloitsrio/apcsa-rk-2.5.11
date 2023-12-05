import java.util.Random;

class Player {

    //variables
    private String name;
    private int points;

    //constructor
    public Player(String n) {
        name = n;
        points = 0;
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

    public int getPoints() {
        return points;
    }

    public void addPoint() {
        points++;
        System.out.println(this.getName() + " has " + points + " points.");
    }
}