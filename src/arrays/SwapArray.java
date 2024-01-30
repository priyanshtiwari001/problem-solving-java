package arrays;

public class SwapArray {

    public static void Swap1(int one,int two){
        // this fun will not work why??
        // coz one and two variable are local to swap function tht means one and two are only accessable
        // inside the swap function not in global.
        // Also it is not changing the value in heap
        int temp=one;
        one=two;
       two=temp;

    }
    public  static  void Swap2(int[] arr,int i, int j){
        // as we passed a reference of arr here so we are accessing the address of the array that present in the heap
        // so here swap is happening

        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    public  static  void Swap3(int[] one, int[] two){
        System.out.println(one + " ," + two);
        int[] temp= one;
        one=two;
        two=temp;
        System.out.println(one + " ," + two);
    }


    public static void main(String[] args) {
                int[] arr = new int[6];

        // assign the value
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;


        int i=0,j=2;

        // not working
        System.out.printf("%d , %d\n",arr[i],arr[j]);
        Swap1(arr[i],arr[j]);
        System.out.printf("%d , %d\n",arr[i],arr[j]);

        //swap 2
        System.out.printf("%d , %d\n",arr[i],arr[j]);
        //Swap2(arr,i,j);
        System.out.printf("%d , %d\n",arr[i],arr[j]);

        //swap 3
        int[] other = {100,200,300};
        System.out.printf("%d , %d\n",arr[0],other[0]);
        Swap3(arr,other);
        System.out.printf("%d , %d\n",arr[0],other[0]);
    }

}
