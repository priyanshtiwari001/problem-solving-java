package basic.firstJava;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

// This code snippet takes an input number from the user and checks whether it is a prime number or not.
// It iterates through all numbers from 2 to num-1 and checks if num is divisible by any of them.
// If it is divisible,
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();// 10
        int div = 2;
        boolean flag = true;
        for( ;div<num-1;div++)
        {
            if(num%div==0){ // checking whether no is divisible or not
                flag= false;
                break;
            }
        }

        if(flag==true)// using indictor to find our the prime or not
        {
            System.out.printf("%d is a Prime number",num);
        }else{
            System.out.printf("%d is a not Prime number",num);
        }
    }
}
