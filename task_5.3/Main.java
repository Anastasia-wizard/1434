/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>num = new ArrayList<>();
        num.add(1);
        num.add(-1);
        num.add(2);
        num.add(12);
        num.add(18);
        num.add(4);
        num.add(-8);
        ArrayList<Integer>num2 = new ArrayList<>();
        for (int i = 0; i < num.size(); i++) {
        if (num.get(i)>0 && num.get(i)<10) num2.add(num.get(i));
        }
        System.out.println(num2);

    }
}
