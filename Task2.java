import java.util.ArrayList;

// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = AddRandomInt.addRandomInt(10,10);
        System.out.println(listInt);
        removeEvenInt(listInt);
    }

    private static void removeEvenInt(ArrayList<Integer> listInt) {
        for (int i = 0; i < listInt.size(); i++) {
            if (listInt.get(i) % 2 == 0) {
                listInt.remove(i);
                i--;
            }
        }
        System.out.println(listInt);
    }
}
