/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/
public class Main {
    public static void main(String[] args) {
        int [] array = {1, 2, 4, 5, 7, 1, 2};
        boolean flag = false;
        //напишите тут ваш код
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i + 1]) flag = true;
        }
        if (flag)  System.out.println("да");

            else System.out.println("нет");
            }

        }
