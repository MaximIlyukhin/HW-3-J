import java.util.ArrayList;

// Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
// Разность:
// A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
// B - A = все числа из второй коллекции, которые не содержатся в первой
// Симметрическая разность: A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой

public class Task4 {
    public static void main(String[] args) {
        int numberInt = 5; // количество элементов в массиве
        ArrayList<Integer> listInt1 = AddRandomInt.addRandomInt(numberInt, 10),
                listInt2 = AddRandomInt.addRandomInt(numberInt, 10),
                listInt3 = new ArrayList<>(), listInt4 = new ArrayList<>(),
                listInt5 = new ArrayList<>(), listInt6 = new ArrayList<>();

        listInt5 = uniqueValues(listInt1, listInt2, listInt3); // A - B
        System.out.println();

        listInt6 = uniqueValues(listInt2, listInt1, listInt4); // B - A
        System.out.println();

        listInt5.addAll(listInt6);      // A ^ B
        System.out.println(listInt5);
    }

    private static ArrayList<Integer> uniqueValues(ArrayList<Integer> firstList,
            ArrayList<Integer> secondList, ArrayList<Integer> thirdList) {
        System.out.println(firstList);
        System.out.println("minus");
        System.out.println(secondList);
        for (int i = 0; i < firstList.size(); i++) {
            int counter = 0;
            for (int j = 0; j < secondList.size(); j++) {
                if (firstList.get(i) != secondList.get(j)) {
                    counter++;
                    continue;
                }
            }
            if (counter == 5) {
                thirdList.add(firstList.get(i));
            }
        }
        System.out.println("equal");
        System.out.println(thirdList);
        return thirdList;
    }
}
