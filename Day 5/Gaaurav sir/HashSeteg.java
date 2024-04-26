import java.util.HashSet;

public class HashSeteg {
    public static void main(String[] args) {
        HashSet <String> set = new HashSet<>();
        set.add("pintu");
        set.add("Chintu");
        System.out.println(set);
        set.add("pintu");
        set.add("pintu");
        set.add("pintu");
        set.add("pintu");
        System.out.println(set);
        System.out.println(set.size());
        ////// remove
        set.remove("pintu");
        System.out.println(set);

        set.add("Kittu");
        set.add("Pintu");
        System.out.println(set);

        System.out.println(set.contains("pintu"));
        System.out.println(set.contains("Pintu"));

        
    }
}
