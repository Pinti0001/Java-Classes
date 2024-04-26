public class Garbage {
    public static void foo(){
       String x = new String("sdhf");
       System.out.println(x);
         ////    ek bar  calling ke bad garbege collect kr lega  bcoz ek bar print hone k bad x use hi nhi ho rha he
    }
    public static void main(Strings[] args) {
         String x = new String("test");  ///  heap me test bnkr x se point kr rha he
        x = null;    // ab x koi value point nhi kr rha he    to test garbage collecy ho gya
        x = "hfghhi" ;   ///  2nd way of garbage collect  isme ab string change kr diya to test  garbge collect ho jayega 
        foo();
    }
}

