
import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        // create object of scanner class to use it 
        Scanner sc = new Scanner(System.in); // here sc is object name

        System.out.println("plz entr yr slry: ");

        int slry = sc.nextInt();  ////  nextInt() is use for taking integer as input ,  nextFloat() is used for taking Floating  value 
        // and  nextLine() is used for taking string as input      
        String mn = sc.next();
        System.out.println( mn);
    }
}
