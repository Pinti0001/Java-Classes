

public class Prime {
    public static boolean check(int n){
        boolean p =true;
        for(int i=2; i<n; i++){
            if(n%i==0) p=false;
        }
        return p;
    }
    public static void main(String[] args) {
        int n=10;
        int cnt = 0;
        for(int i=2; i<=n; i++){
            if(check(i)) {
                cnt++;
                System.out.println(i);
            }
        }
        System.out.println(cnt);
    }
}
