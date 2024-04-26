import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap <String , Integer> map = new HashMap<String, Integer>();  ///  <key datatype ,  value dtatype>

        map.put("Chhuchunder", 20);
        map.put("Pintu ", 10);
        map.put("Rahat" , 30);
        System.out.println("Size of map: " + map.size());
        System.out.println(map);
    }
}
