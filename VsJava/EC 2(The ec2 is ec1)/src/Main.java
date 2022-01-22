import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    // Use stream and map()
    public static void printListToSquareRootsSorted(List<Double> inList)
    {
        inList.stream()
                .map(n -> Math.sqrt(n))
                .filter(n -> Math.sqrt(n) >= 5)
                .sorted()
                .forEach(System.out:: println);
    }
    public static void main(String[] args)
    {
        List<Double> list = new ArrayList<Double>();
        list.add(16.0);
        list.add(1024.0);
        list.add(32.0);
        list.add(64.0);
        list.add(4.0);
        list.add(512.0);
        list.add(8.0);
        list.add(2.0);
        list.add(128.0);
        list.add(256.0);
        printListToSquareRootsSorted(list);
    }
}