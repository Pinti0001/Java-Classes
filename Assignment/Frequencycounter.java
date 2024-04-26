import java.util.HashMap;
import java.util.Scanner;

public class Frequencycounter {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter yr String : ");
        String text = str.nextLine();

        HashMap<String, Integer> wordfrequencies = new HashMap<>();
        String[] words = text.split(" ");
        
        try {
            if (text.length()==0) {
                throw new Exception("Invalid String ");
            }
            for (String word : words) {
                word = word.toLowerCase();
                if (word.length() > 0) {
                    if (wordfrequencies.containsKey(word)) {
                        int frequency = wordfrequencies.get(word);
                        wordfrequencies.put(word, frequency + 1);
                    } else {
                            wordfrequencies.put(word, 1);
                    }
                }
            }
            for (String word : wordfrequencies.keySet()) {
                int frequency = wordfrequencies.get(word);
                System.out.println(word + ": " + frequency);
            } 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}

