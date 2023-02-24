import java.util.ArrayList;

// Реализовать алгоритм сортировки слиянием.

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = AddRandomInt.addRandomInt(10, 10);
        System.out.println(listInt);
        mergeSort(listInt);
        System.out.println(listInt);
    }

    private static void mergeSort(ArrayList<Integer> listInt) {
        if (listInt.size() == 1)
            return;
        ArrayList<Integer> left = new ArrayList<>();
        for (int i = 0; i < listInt.size() / 2; i++) {
            left.add(listInt.get(i));
        }
        ArrayList<Integer> right = new ArrayList<>();
        for (int j = listInt.size() / 2; j < listInt.size(); j++) {
            right.add(listInt.get(j));
        }
        mergeSort(left);
        mergeSort(right);
        merge(listInt, left, right);
    }

    private static void merge(ArrayList<Integer> listInt,
            ArrayList<Integer> left, ArrayList<Integer> right) {
        int i = 0, j = 0;
        listInt.clear();
        while (i < left.size() || j < right.size()) {
            if (left.get(i) < right.get(j)) {
                listInt.add(left.get(i));
                i++;
            } else {
                listInt.add(right.get(j));
                j++;
            }
        }
        if (i < left.size()) {
            for (int index = i; index < left.size(); index++) {
                listInt.add(left.get(index));
            }
        } else {
            for (int index = j; index < right.size(); index++) {
                listInt.add(right.get(index));
            }
        }
    }
}