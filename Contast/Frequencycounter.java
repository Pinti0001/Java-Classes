
import java.util.Scanner;

public class Frequencycounter {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        
        String text = str.nextLine();

        int [] freq = new int[26];
        for(char c:text.toCharArray()) freq[c-'a']++;
        int max = 0;
        for(int i=0; i<freq.length; i++){
            if(freq[max]<freq[i]) {
                max = i;
            }
        }
        System.out.println((char) (max+'a') );
        
    }
}

