import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your text: ");
        StringBuilder text = new StringBuilder();
        text.append(sc.nextLine());
        // String text = sc.nextLine();
        while (true) {
            System.out.println("1. word count");
            System.out.println("2. Charcter count ");
            System.out.println("3. Reverse text");
            System.out.println("4. remove dupicates");
            System.out.println("5. exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    String [] textarr = text.toString().split(" ");
                    int count = 0;
                    for (String e : textarr) {
                        count++;
                    }
                    System.out.println("Word count: "+ count);
                    break;
                case 2: String [] chararr = text.toString().split("");
                    int ct = 0 ; 
                    for (String c : chararr) {
                        ct++;
                    }
                    System.out.println("Charcter count: "+ ct);
                    break;
                case 3: 
                    System.out.println("Reverse text: "+ text.reverse());
                    break;
                case 4: 
                    HashSet res = new HashSet<>(Arrays.asList(text));
                    System.out.println("W/O duplicate"+ res.toString());
                    break;
                case 5: System.exit(0);
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
