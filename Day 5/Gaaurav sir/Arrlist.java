import java.util.ArrayList;

public class Arrlist {

    public static void main(String[] args) {
        ArrayList <String> arrl = new ArrayList<>();

        arrl.add("rahat");
        arrl.add("pintu");
        System.out.println(arrl);
        arrl.add("piki");
        System.out.println(arrl);
        System.out.println(arrl.get(1).length());

        arrl.remove(2);
        System.out.println(arrl);

        arrl.set(0,"Chinki");
        // arrl.set(2, "radha");  ////  this is not valid becoz index 2 not define
        System.out.println(arrl);
        System.out.println(arrl.get(0).charAt(0));
    }
}