public class Conditional {

    public static void main(String[] args) {
        // if(6<2){
        //     System.out.println("I am working");
        // }
        // else {
        //     System.out.println("i am not working");
        // }


        //  int marks = 89;
        //  if(marks>90){
        //     System.out.println("A");
        //  }
        //  else if(marks>80){
        //     System.out.println("B");
        //  }
        //  else if(marks>70){
        //     System.out.println("C");
        //  }
        //  else if(marks >60){
        //     System.out.println("D");
        //  }
        //  else System.out.println("F");


        /// job process  -  screening round  -  coding test  -  
        // boolean scround = true;
        // boolean ctest  =  true ;

        // if(scround){
        //     if(ctest){
        //         System.out.println("Congress");
        //     }
        //     else  System.out.println("Sry, yr ctest was not passed");
        // }
        // else System.out.println("President meeting for  u to throw gold medal on your face");




        //// switch case 
        int day  =0;
        switch (day) {
            case 0: System.out.println("Sunday");
                break;
            case 1 : System.out.println("mon");
            break;
            case 2 : System.out.println("tue");
            break;
            case 3 : System.out.println("Wed");
            break;
            case  4 : System.out.println("Thu");
            break ;
            case 5 : System.out.println("Fri");
            break;
            case 6 : System.out.println("Sat");
            break;
            default: System.out.println("Invalid input");
                break;
        }
    }
}