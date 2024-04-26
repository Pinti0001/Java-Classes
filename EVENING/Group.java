import java.util.Scanner;

public class Group {
    
    public static boolean prime(int n){
        // boolean p = true;
        for(int i = 2; i<n; i++){
            if(n%i==0) {
                return false;
            }
        }
         return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yr no.: ");
        int num = sc.nextInt();

        
        // if(num<0) System.out.println("neg");
        // else if(num>0) System.out.println("pos");
        // else System.out.println("Zero");
        // sc.close();

    //     System.out.println("entr yr 2nd no.: ");
    //     int num2 = sc.nextInt();
    //    if(num<num2) System.out.println(num2);
    //     else System.out.println(num);


        
    //     int f = 1;
    // while (num>1) {
    //     f = f*num;
    //     num--;
    // }
    // System.out.println(f);
        // prime(num);
        for(int i = 2; i<=num; i++){
            if(prime(i)) System.out.println(i);
        }

    
    }
    
}