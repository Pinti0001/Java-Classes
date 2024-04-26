// public class Main {
//     public void add(){
//         System.out.println(5+6);
//     }
//     static void printname(){
//         System.out.println("hiidi ");
//     }

//     public static void main(String[] args) {
//         System.out.println( "Hello Pintu u can start with us ");
//         System.out.print( 5+6);
//         System.out.println(" 5+6");
//         printname();
//         Main obj=new Main();
//         obj.add();
//     }
// }


import java.util.Scanner;

public class Main {
    public static boolean main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean res = false; 
          if(Character.isUpperCase(str.charAt(i))) res = true;
        for (int i = 1; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                res = false;
                break;
            }
        }

        if(res){
          System.out.println("Yes");
        }
        else System.out.println("No");
    }
}