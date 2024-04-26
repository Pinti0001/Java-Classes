import java.util.Scanner;

public class Pelendrim {

    
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = number.nextInt();
        int orignalnumber = x;
        int reverse = 0;
        
        while (x>0) {
            int digit = x%10;
            reverse = reverse*10+digit;
            x = x/10; //  x/=10
        }
        if(orignalnumber==reverse){
            System.out.println("Pelindrome number");
        }
        else System.out.println("Not a pelindrome number");
        number.close();
       
    }
}
