public class Reverse {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        
        str.append("HEllo");
        if (str.length()>0){
            System.out.println(str.reverse());
        }
        else{
            System.out.println("Invalid string ");
        }
        // try {
        //     str.append("hello  Pintu");
        //     if(str.length()==0){
        //         throw new Exception("invalid String");
        //     }
        //     System.out.println(str.reverse());

        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
    }
}




























