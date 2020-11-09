public class Main {
    public static void main(String[] args) {
        int [] array = {1, 2, 4, 5, 7, 1, 2, 2};
        //напишите тут ваш код
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array [i+1])
            {
                System.out.println("да");
            }
            else
            {
                System.out.println("нет");
            }

        }
    }
}
