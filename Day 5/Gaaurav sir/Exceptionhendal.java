public class Exceptionhendal {
    public static void main(String[] args) {
        // int [] arr = {1,2,3,5};
        // System.out.println(arr[5]);


        try{
            

            int []  arr1 = {1,2,3,4};
            System.out.println(arr1[1]);
            System.out.println(arr1[5]);
        }
        catch(Exception e){   ////  Exceptin is a class of java and e is our object name 
            // System.out.println("Element not found");
            System.out.println(e.getMessage()); ///// if you want to gve your oen msg than write and if autometic msg than use objname.getMessage()
        }
        finally{
            System.out.println("Try cath has been executed");   /////  if finnely nhi chlega to pta chal jayega ki try catch chla ya nhi chla
        }



        try{
            int a = 9;
            int num = 5;
            if(a==9){
                throw new Exception("the value is 4");
                // System.out.println("i am error");  ///// if we use throw then iske bad koi value exicute nhi hogi
            }
            System.out.println(num/a);
            System.out.println("hello im checking");
        }
        catch(Exception err){
            System.out.println(err.getMessage());
        }


    }
}
