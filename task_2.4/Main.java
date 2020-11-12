/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/



import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        int percent = scan.nextInt();
        System.out.println(money * (1 + 0.01 * percent) * 5);
        //напишите тут ваш код

    }
}
