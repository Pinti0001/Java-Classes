import java.util.ArrayList;

public class Interest {
    static void getIntrest(int p,int r,int t){
        int si = (p*r*t)/100 ;
        System.out.println(si);
    }
    public static void main(String[] args) {
        getIntrest(1000, 5, 2);
        
    }
}
