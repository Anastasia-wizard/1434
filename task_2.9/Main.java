/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

// я понимаю, что сделала не верно, но не могу понять, где ошибка!
public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        int arr[] = {1,2,5,90,2,40,3,8};
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==5) flag = true;
        }
        if (flag) System.out.println("да");
        else System.out.println("нет"); ;

    }
}
