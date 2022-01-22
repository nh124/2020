import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

// Write a program to find the targeted sum from an array for 2 arrays
public class test {
    static ArrayList<Integer> list;
    public static void main(String[] args)
    {
        System.out.println(list());
    }
    public static ArrayList<Integer> list()
    {
        Random rand = new Random();
        for(int i =0; i <= 10000; i++)
        {
            list.add(rand.nextInt() - 1);
        }
        return list;
    }
}
