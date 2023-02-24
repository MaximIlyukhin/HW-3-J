import java.util.ArrayList;
import java.util.Collections;

// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметичское этого списка.

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = AddRandomInt.addRandomInt(10,10);
        System.out.println(listInt);
        System.out.printf("min = %d, max = %d, average = %.1f",
                Collections.min(listInt), Collections.max(listInt), avgInt(listInt));
    }

    private static float avgInt(ArrayList<Integer> listInt) {
        float sum = 0;
        for (int i = 0; i < listInt.size(); i++) {
            sum += listInt.get(i);
        }
        return Float.valueOf(sum / listInt.size());
    }
}
