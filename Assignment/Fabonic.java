

public class Fabonic {
    public static int[] getfeb(int n){
        int[] arrfib = new int[n];
        if(n>2){
            arrfib[0] = 0;
            arrfib[1] = 1;
            for(int i=2;i<arrfib.length;i++){
                arrfib[i] = arrfib[i-1] + arrfib[i-2];
                
            }
            return arrfib;
        }
        else if(n==2) {
            arrfib[0] = 0;
            arrfib[1] = 1;
            return arrfib;
        }
        else{
            return arrfib;
        }

    }
    public static void main(String[] args) {
        int n = 7;
        int[] fibonicsequence  = getfeb(n);
        for (int i : fibonicsequence) {
            System.out.print(i+ " ");
        }
        

    }
}
