package challenges.fundamentals;

import java.util.Scanner;

public class Pythoagoras_triplet {
    static void evaluate(long n) {
        if (n == 1 || n == 2)
            System.out.println(-1);

        else if (n % 2 == 0) {

            // Calculating for even case
            System.out.println(((n * n) / 4) - 1 + " " + (((n * n) / 4) + 1));
        }

        else if (n % 2 != 0) {

            System.out.println((n * n - 1) / 2 + " " + (n * n + 1) / 2);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        evaluate(n);
    }
}
