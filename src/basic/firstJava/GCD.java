package basic.firstJava;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        // using long division method
        Scanner sc = new Scanner(System.in);
        int divend = sc.nextInt();
        int divisor = sc.nextInt();

        while(divend%divisor!=0)
        {
            int remainder = divend%divisor;
            divend=divisor;
          divisor=remainder;

        }
        System.out.println(divisor);

    }
}
