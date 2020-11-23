/*
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите путь к файлу");

            String address = sc.nextLine();
            FileReader reader = new FileReader(address);
            Scanner scan = new Scanner(reader);
            String c = "";
            int a;

            while (scan.hasNextLine()){

                c = scan.nextLine();
                a = Integer.parseInt(c);
                if (a%2 == 0)  num.add(a);

            }

            Collections.sort(num);
            System.out.print(num);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}




