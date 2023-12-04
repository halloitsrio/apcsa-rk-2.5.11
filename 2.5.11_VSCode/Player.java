class Player {

    //variables
    private String name;

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
}