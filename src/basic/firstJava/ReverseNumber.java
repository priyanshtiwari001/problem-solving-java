package basic.firstJava;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//2537
         //  int num=2537;

           int ans=0;
           while(num!=0)
           {
                int rem = num%10;
               ans=ans*10 +rem; // to mutiple the num+rem = to get the output in resverse order
               num = num/10;
           }
        System.out.println(ans);


    }
}
