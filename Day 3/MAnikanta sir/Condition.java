import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>21){
            System.out.println("Adult");
        }
        else if (age>16&&age<21){
            System.out.println("Teen");
        }
        else System.out.println("not adult ");
        sc.close();
    }
}
