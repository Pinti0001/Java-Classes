import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no.: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second no.: ");
        int num2 = sc.nextInt();


        int hcf =0;
        for(int i = 1; i <= Math.min(num1,num2); i++){
        if(num1%i==0 && num2%i==0 ){
            hcf = i;
        }
    }
    System.out.println("hcf is "+ num1 + " and " +num2 +" is: "+ hcf);
    sc.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    
    }
}
