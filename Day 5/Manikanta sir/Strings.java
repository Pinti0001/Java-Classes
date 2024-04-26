import java.lang.StringBuffer;
import java.lang.StringBuilder;

public class Strings {
    public static void main(String[] args) {
        // String x = "function";
        // x = x.concat("Up");
        // System.out.println(x);

        // StringBuffer sb = new StringBuffer();
        // sb.append("hello");
        // sb.append(" world");
        // String msg = sb.toString();
        // System.out.println(msg);
        // System.out.println(sb);


        ///// string builder
        StringBuilder str = new StringBuilder();
        str.append("hello");
        str.append(" Pintu");
        System.out.println(str);
        System.out.println(str.toString());

        StringBuilder str1 = new StringBuilder("sfdgsetd hg");
        System.out.println(str1);
        System.out.println(str1.capacity());

        StringBuilder str2 = new StringBuilder(1234);
        System.out.println(str2);
        System.out.println(str2.capacity());

        StringBuilder str3 = new StringBuilder(str.toString());
        System.out.println(str3);
    }
}
