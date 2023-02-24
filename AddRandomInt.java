import java.util.ArrayList;
import java.util.Random;

public class AddRandomInt { 
    public static ArrayList<Integer> addRandomInt(Integer numberInt, Integer nMax ) {
        ArrayList<Integer> listInt = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < numberInt; i++) {
            listInt.add(rnd.nextInt(nMax));
        }
        return (listInt);
    }
}
