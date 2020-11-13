//Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.

public class Main {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 4, 23, 341,77783};
        int sum = 0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            while (sum >= 10)
            {
                count++;
                break;
            }

        }
        System.out.println(count);


    }
}
