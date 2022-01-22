import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class game{
    ArrayList<String> names = new ArrayList<>();
    public ArrayList<String> RandomChoose(int numberOfPlayers){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name of each player");
        for(int i = 0; i < numberOfPlayers; i++){
            System.out.print("Nmae of player number" + i);
            String name = scan.nextLine();
            names.add(name);
        }
        return names;
    }
}