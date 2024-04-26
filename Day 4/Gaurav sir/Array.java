// import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        // int [] arr = {1,2,3,4,45};
        // System.out.println(Arrays.toString(arr));
        // arr[3] = 9;
        // System.out.println(Arrays.toString(arr));

        // String [] str = {"pintu", "chintu", "pinku"};
        // System.out.println(Arrays.toString(str));
        //         System.out.println(str[0]);



        ///// 2D array

        int[][] x = {
            {1,2,34},
            {23,43,12},
            {98,89,30}
        };
        for(int i = 0 ; i<x.length;i++){

            // System.out.println(Arrays.toString(x[i]));
            for(int j =0;j<x[i].length; j++){
                // System.out.print(x[i][j]);
                System.out.print(x[i][j]+ " " );
            }
            System.out.println();
        }
    }
}