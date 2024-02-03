package challenges.fundamentals;

import java.util.Scanner;

/*
:Pattern
x x x x x x x x x x x
  x x x x x x x x x
    x x x x x x x
      x x x x x
        x x x
          x
        x x x
      x x x x x
    x x x x x x x
  x x x x x x x x x
x x x x x x x x x x x

:number

5
5 4 3 2 1 0 1 2 3 4 5
  4 3 2 1 0 1 2 3 4
    3 2 1 0 1 2 3
      2 1 0 1 2
        1 0 1
          0
        1 0 1
      2 1 0 1 2
    3 2 1 0 1 2 3
  4 3 2 1 0 1 2 3 4
5 4 3 2 1 0 1 2 3 4 5

 */

public class Pattern_HourGlass {

    static  void printPattern(int n){
        int nr = 2*n+1;
        int nst =nr;
        int nsp =0;
        int row=1;

        while(row<=nr){
            int val=nst/2;
            //work done of space
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("  ");
            }
            // work done for star
            for(int cst=1;cst<=nst/2+1;cst++){
                System.out.print(val + " ");
                val--;
            }

            //work done for star-2
            val+=2;
            for(int cst=1;cst<=nst/2;cst++){
                System.out.print(val + " ");
                val++;
            }

            //work done of space-2
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("  ");
            }

            if(row<=nr/2){
                nst-=2;
                nsp++;
            }else{
                nst+=2;
                nsp--;
            }

            System.out.println();

            row++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
}
