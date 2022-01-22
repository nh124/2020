import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Tik_Tak_Toe {
    public static int position1;
    public static int position2;
    public static int position3;
    public static int position4;
    public static int position5;
    public static int position6;
    public static int position7;
    public static int position8;
    public static int position9;
    public static void main(String[] args){
        GameBoard();
    }
    public static void GameBoard(){
        for(int i = 1; i <= 2; i++){
            System.out.println("___|___|___");

        }
        System.out.println("   |   |   ");
    }
    public static void GameBoardFunction(){
       Scanner input = new Scanner(System.in);
       System.out.println("What market would you like to choose?(X , O)");
       String marker = input.nextLine();
    }
    public static void Position(){
        String[] [] arr = new String [] [] {{"1",2,3,"},
                                      {"4,5,6"},
                                      {"7,8,9"}};

       // ArrayList <String> list = new Arrays.asList(arr);


        Scanner input = new Scanner(System.in);
        System.out.println("Where would to like to place you first marker?");
        String position = input.nextLine();


        }
        public int PositionDet(){
            if(arr [0] [0] ){

            }else it(){

            }
        }
}
        






