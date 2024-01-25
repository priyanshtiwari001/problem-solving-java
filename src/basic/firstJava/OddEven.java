package basic.firstJava;

import java.util.Scanner;


public class OddEven {

    public static void fun(int no1){
         if(no1%2==0){
             System.out.println("No is even");
         }else{
             System.out.println("No is odd");
         }
    }

    public  static void fun1(int no2){

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();

        fun(no1);
    }
}
