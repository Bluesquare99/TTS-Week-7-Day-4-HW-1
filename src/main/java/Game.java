public class Game {

    // Declare three instance variables
    private String name;
    private String type;
    private int numPlayers;

    public Game() {}

    public Game(String nameOfGame, String typeOfGame) {
        name = nameOfGame;
        type = typeOfGame;
    }

    public Game(String nameOfGame, String typeOfGame, int numOfPlayers) {
        name = nameOfGame;
        type = typeOfGame;
        numPlayers = numOfPlayers;
    }

    // Get methods for all three variables
    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public int getNumPlayers(){
        return numPlayers;
    }

    // Set methods for all three variables

    public void setName(String newName) {
        name = newName;
    }

    public void setType(String newType) {
        type = newType;
    }

    public void setNumPlayers(int newNumPlayers) {
        numPlayers = newNumPlayers;
    }

    // A boolean function that determines whether a game is good for groups
    public boolean isGoodForGroups(){
        if (numPlayers > 2) {
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        String presence = name.toLowerCase();
        String intransigence = type.toLowerCase();
        return "This game is called " + presence + ". It is a "
                + intransigence + " game and can accommodate " +
                numPlayers + " players.";
    }




}
