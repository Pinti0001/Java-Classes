public class Methods {
    public static void intro(){
        
        System.out.println("my name is java");
    }

    public static void hello(){
        System.out.println("i am ggo");
    }

    public static String str(){
        
        return "gd rue75 d5 ";
    }


    public static int no(int a){
        return a;
    }

    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        intro();
        String sr = str();
        System.out.println(sr);

        int sum = add(add(2,3), add(5,4));
        System.out.println(sum);
    }
}
