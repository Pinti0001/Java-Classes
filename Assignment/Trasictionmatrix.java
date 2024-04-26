// import java.util.Arrays;

public class Trasictionmatrix {

    public static void main(String[] args) {
        int[][] x = {
            {1,2,3},
            {23,43,12},
            {98,89,30}
        };
        System.out.println("Orignal matrix: ");
        for(int i = 0 ; i<x.length;i++){
            // System.out.println(Arrays.toString(x[i]));
            for(int j =0;j<x[i].length; j++){
                // System.out.print(x[i][j]);
                System.out.print(x[i][j]+ " " );
            }
            System.out.println();
        }


        System.out.println("Transposition matrix: ");
        for(int i = 0 ; i<x.length;i++){
            // System.out.println(Arrays.toString(x[i]));
            for(int j =0;j<x[i].length; j++){
                // System.out.print(x[i][j]);
                System.out.print(x[j][i]+ " " );
            }
            System.out.println();
        }
    }
}