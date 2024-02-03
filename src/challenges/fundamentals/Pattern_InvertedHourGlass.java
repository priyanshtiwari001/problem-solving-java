package challenges.fundamentals;

import java.util.Scanner;

/*

5                   5
5 4               4 5
5 4 3           3 4 5
5 4 3 2       2 3 4 5
5 4 3 2 1   1 2 3 4 5
5 4 3 2 1 0 1 2 3 4 5
5 4 3 2 1   1 2 3 4 5
5 4 3 2       2 3 4 5
5 4 3           3 4 5
5 4               4 5
5                   5


 */

public class Pattern_InvertedHourGlass {

    static void printPattern(int n ){
        int nr = 2*n+1;
        int nst = 1;
        int nsp = nr-2;
        int row=1;
        while(row<=nr){
            int val=n;

            //work done star
            for(int cst=1;cst<=nst;cst++){
                System.out.print(val + " ");
                val--;

            }
            // work doone for space

            for(int csp =1;csp<=nsp;csp++){
                System.out.print("  ");
            }

            //work done star-2
            int cst=1;
            if(row==n+1){
                cst=2;
                val+=2;
            }else{
              cst=1;
                val++;
            }
            for(;cst<=nst;cst++){
                System.out.print(val +" ");
                val++;
            }

            if(row<=nr/2)
            {
                nst++;
                nsp-=2;
            }else{
                nst--;
                nsp+=2;
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
