import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //test 1
        System.out.println("Task 1 (n=4): " + sumOfSquares(4));

        //test 2
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Task 2 (n=3): " + sumOfArray(array, 3));

        //test 3
        System.out.println("Task 3 (b=4, n=3): " + sumOfPowers(4, 3));

        //test 4
        System.out.println("Task 4: Enter N and then N numbers:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            reverseSequence(n, sc);
        }
    }


    public static int sumOfSquares(int n) {
        if (n <= 1) return 1;
        return (n * n) + sumOfSquares(n - 1);
    }


    public static int sumOfArray(int[] arr, int n) {
        if (n <= 0) return 0;
        return arr[n - 1] + sumOfArray(arr, n - 1);
    }


    public static double sumOfPowers(double b, int n) {
        if (n == 0) return 1;
        return Math.pow(b, n) + sumOfPowers(b, n - 1);
    }


    public static void reverseSequence(int n, Scanner sc) {
        if (n <= 0) return;
        int current = sc.nextInt();
        reverseSequence(n - 1, sc);
        System.out.print(current + " ");
    }
}