package basic.pattern.starPatterns;

import java.util.Scanner;
/*

 x           x
    x     x
       x
    x     x
 x           x

 */
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            //System.out.print(i);
            int start = 1;
            int end = n;
            for(int row=1;row<=n;row++) {
               // System.out.printf("row %s",row);
                if (i == start || i == end) {
                    System.out.print("x ");
                } else {
                    System.out.print("  ");
                }
                if(row<3){
                    start++;
                    end--;
                }else{
                    start--;
                    end++;
                }

            }
           System.out.println();


        }




    }
}
