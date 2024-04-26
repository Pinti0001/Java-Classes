import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrl = new ArrayList<Integer>(2);
        arrl.add(1);
        arrl.add(2);
        arrl.add(5);
        System.out.println(arrl);
        System.out.println(arrl.get(1));


        for (Integer e : arrl) {
            System.out.println(e);
        }
        
        }
}
