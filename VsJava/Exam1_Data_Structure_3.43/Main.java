import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("hello");
        duck_duck_go ddg = new duck_duck_go();
        Scanner console = new Scanner(System.in);
        int numberOfPlayer = console.nextInt();
        
        System.out.println(ddg.player(numberOfPlayer));
        System.out.println(ddg.playerIt);
        ddg.gameTime();
    }
}
