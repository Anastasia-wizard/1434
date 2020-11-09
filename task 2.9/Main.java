/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

// я понимаю, что сделала не верно, но не могу понять, где ошибка!
public class Main {
    public static void main(String[] args) {
        int array[] = {2, 7, 8, 3, 1, 12, 5, 0};
        int a = 5;
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            while (a == array[i] ) {
                System.out.println("да");
                break;
            }


            if (a != array[i] )
            {
                System.out.println("нет");
               

            }



            }


        }
        //напишите тут ваш код

    }
