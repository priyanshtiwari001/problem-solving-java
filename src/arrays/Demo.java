package arrays;

public class Demo {
    public static void main(String[] args) {

        //declaration
        int[] arr = null;

        //initinalization
        arr = new int[6];

        // initial default value of array is zero
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);

        // assign the value
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;


        // enchancement loop - it read only and it only goes forward
        for(int vall:arr) {

            System.out.println(vall);
        }

        // reverse the array

        for(int i=arr.length-1;i>=0;i--){

            System.out.printf("%d %d\n ",i,arr[i]);
        }





    }
}
