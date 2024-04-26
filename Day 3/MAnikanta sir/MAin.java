import java.util.Scanner;

import Adddition.Test;
public class MAin {
    public static void main(String[] args) {
        Test.add(1,3);

        Scanner sc = new Scanner(System.in);

        System.out.println("input no : ");
        int x = sc.nextInt();
        System.out.println("no is : " + x);

        System.out.println("input name : ");
        String nm = sc.nextLine();
        System.out.println("entr name : "+ nm );
    }
    
}