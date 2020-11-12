/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 34, 2, 2, 17};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[j + 1]) {
                    System.out.println("yes");
                }

            }

        }
    }
}
