import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {
        HashMap <String , Integer> map = new HashMap<String , Integer>();
        map.put("Age" , 19);
        System.out.println(map);
        map.put("name", 5242);
        map.put("Math", 19);
        map.put("Math", 199); ////  update 
        map.put("marks", 500);
        map.put("english", 70);
        System.out.println(map);
        /// remove(key)
        map.remove("name");
        System.out.println(map);
        /// get
        System.out.println(map.get("math"));
        System.out.println(map.get("Math"));
        // //// clear
        // map.clear();
        // System.out.println(map);


        /// / itreating the hash map for key
        for (String e : map.keySet()) {
            System.out.println(e+" : "+ map.get(e));
        }
        ////  iterate the hash map for value
        for (Integer v : map.values()) {
            System.out.println(v +" : ");
        }

    }
}