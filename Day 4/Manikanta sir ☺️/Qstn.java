public class Qstn {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0) {
                sum+=arr[i];
            }
        }
        System.out.println(sum);


        for(int x : arr){
            if(x%3==0) {
                sum+=x;
            }
        }
        System.out.println(sum);
    }
}
