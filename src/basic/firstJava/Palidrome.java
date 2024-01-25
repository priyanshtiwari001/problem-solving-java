package basic.firstJava;

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//4444
          int num=n;

        int ans = 0;
        while (num != 0) {
            int rem = num % 10;
            ans = ans * 10 + rem; // to mutiple the num+rem = to get the output in resverse order
            num = num / 10;
        }
       if(n==ans)
       {
           System.out.println("Number is Palidrome");
       }else{
           System.out.println("Number is not Palidrome");
       }

    }

}
