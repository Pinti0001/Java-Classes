public class Qstn2 {
    static int findmax(int[] arr){
        int max = arr[0];
        for (int i : arr) {
            if (max<=i) {
                max = i;
            }
        }
        return max; 
    }
    public static void main(String[] args) {
        int numbers [] = {3,1,7,4,2};
        int max = findmax(numbers);
        System.out.println("max ele: "+ max);
        
    }
}
