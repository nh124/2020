import java.util.Scanner;
import java.util.Random;

public class duck_duck_go {
    String playerIt;
    String [] playerList;
    int round; 

    public String [] players(int numbOfPlayers){
        playerList = new String[numbOfPlayers];
        Scanner player = new Scanner(System.in);
        // System.out.print("How many player are playing: ");
        // int numbOfPlayers = player.nextInt();
        for(int i = 0; i < numbOfPlayers; i++){
            System.out.println("Please input the name of player number " + i + ":");
            String name = player.nextLine();
            name = playerList[i];
        }
        return playerList;
    }
    
    public String PlayerIt(){
        int itRandom =  new Random().nextInt(playerList.length);
        playerIt = playerList[itRandom];
        return playerIt;
    }

    public void gameTime(int numbOfPlayers){
        String [] momCondition = new String[1];
        momCondition[0] = "keep playing";
        momCondition[1] = "Dinner Time";
        String [] childrenCondition = new String[1];
        childrenCondition[0] = "enternained";
        childrenCondition[1] = "board";

        int RandomMomCondition = new Random().nextInt(momCondition.length);
        int RandomChildCondition = new Random().nextInt(childrenCondition.length);

        String momConditionConfirmed = momCondition[RandomMomCondition];
        String childrenConditionConfirmed = childrenCondition[RandomChildCondition];


    do{
        round = 1;
        System.out.println("Round" + round);
        System.out.println("Of the player" + playerList + "\n" + playerIt + "was randomly chosen as it." );
        String[] chase = new String[1];
        chase[0] = playerIt;
        Random rand = new Random();
        int duck_duck_go = rand.nextInt(0-numbOfPlayers);
        int itIndex = 0;
        for(int i = 0; i < playerList.length; i++){
            if(playerList[i] == playerIt) {
                i = itIndex;
            }
        }
        for(int i = 0; i < playerList.length-1; i++){
            playerList[i] = playerList[i + itIndex];
        }
        for(int i = 0; i < playerList.length-1; i++){
            String newPlayerIt = playerList[duck_duck_go];
            chase[1] = newPlayerIt;
            int newPlayerItIndex = new Random().nextInt(chase.length);
            chase[newPlayerItIndex] = playerIt;
        }
        System.out.println("Mom Condition" + momConditionConfirmed);
        System.out.println("Children condition" + childrenConditionConfirmed);
    round++;
    }while(momConditionConfirmed != "Dinner Time" || childrenConditionConfirmed != "board");
}

}
