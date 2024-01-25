package basic.firstJava;

import java.util.Scanner;

public class Fibonicci {
// This code snippet takes an input from the user and prints a series of Fibonacci numbers up to the given input number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
          int n1=0;
          int n2=1;

          for(int i=0;i<num+1;i++)
          {
              System.out.println(n1);
              int ans =n1+n2;
              n1=n2;
              n2=ans;

          }





    }
}
