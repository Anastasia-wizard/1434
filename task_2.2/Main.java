public class Main {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};



        for (int j = 0; j < numbers.length; j++) {
            int next = 0;
            int b = 0;
            b = b + j;


            for (int i = 0; i < numbers.length; i++) {

                next = next + b;
                System.out.print(next);
                System.out.print(" ");
                
            }
            System.out.println();
        }
    }
}//я вообще не поняла как это сделала, но оно работает...
