public class Main {
    public static void main(String[] args) {
       int arr[] = {2, 3, 1, 4, 23, 341,77783};
       int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            while (sum > 10);

            System.out.println(arr[i]);
            
        }




    }
}
