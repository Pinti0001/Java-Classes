public class Day2 {
    public static double[] calculateSumAndAverage(int[] arr){
        double sum = 0;
        for (int e : arr) {
            sum+=e;
        }
        double avg =  sum/arr.length ; 
        double[] ar = {sum, avg};
        return ar;
    }
    public static void main(String[] args) {
        int[] number = {1,2};
        double[] result = calculateSumAndAverage(number);
        System.out.println("Sum: "+ result[0]);
        System.out.println("Average: "+ result[1]);
    }
}
