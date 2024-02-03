package challenges.fundamentals;
import java.util.*;

/*

                        1
                    2 1   1 2
                3 2 1       1 2 3
            4 3 2 1           1 2 3 4
                3 2 1       1 2 3
                    2 1   1 2
                        1

 */
public class Pattern_DoubleSidedArrow {

    static void printPattern(int n){
        int nst =1;
        int nsp1=n-1;
        int nsp=-1;
        int row=1;
        //row
        while(row<=n){
        int val;
        if(row<=n/2+1){
            val=row;
        }else{
            val=n-row+1;
        }
            //work done for spaces
            int csp1=1;
            while(csp1<=nsp1){
                System.out.print("  ");
                csp1++;
            }

            //work done for stars
            int cst=1;
            while(cst<=nst)
            {
                System.out.print(val + " ");
                cst++;
                val--;
            }
            //work done of spaces
            int csp=1;
           while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }

           // work done for stars

                int cst1 = 1;
              val++; // yaha pr ye ++ isliye kra taki  jo next no ho vo zero sa print no ho kar 1 sa print ho
            if(row==1 || row==n){
               cst1=2;
          }
                while(cst1<=nst){
                    System.out.print( val +" ");
                    cst1++;
                    val++;
                }

            if(row<=n/2){
                nst++;
                nsp1-=2;
                nsp=nsp+2;

            }else{
                nst--;
                nsp1+=2;
                nsp-=2;
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
