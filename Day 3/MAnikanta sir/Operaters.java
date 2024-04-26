import java.util.Scanner;

public class Operaters {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // for(int i =1;i<=n;i++){
        //     if(i%3==0&&i%5==0) System.out.println("FizzBuzz");
        // else if (i%3==0) System.out.println("Fizz");
        // else if(i%5==0) System.out.println("Buzz");
        // else System.out.println(i);
        // }



        String nm1 = "function";
        String nm2 = "Function";
        System.out.println(nm1 == nm2);
        System.out.println(nm1.equals( nm2));

        String x1 = "10";
        int x2 = 10;

        // System.out.println(x1 == x2);
        System.out.println(x1.equals(x2));

        String a = new String("fang");
        String b = new String("fang");
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
