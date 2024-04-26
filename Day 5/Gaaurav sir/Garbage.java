import java.util.ArrayList;

public class Garbage {
    public static void main(String[] args) {
    ArrayList <String> arrl = new ArrayList<>();

    while (true) {
        String obj = new String("hello");

        arrl.add(obj);  ////  yha tak arrl ka kuch bhi  use nhi he if we dont use sout then outofmemory full error heap space aa jata he 
        System.out.println(arrl);
    }

    }
}
