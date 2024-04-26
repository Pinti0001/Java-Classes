public class WaytoString {
    public static void main(String[] args) {
        /// way 1     isme ab change nhi oga kuch ha update ho jayega  but khud me change nhi hoga 
        // String nm1 = "Pintu";
        // String nm2 = " Kumar";
        // // String name = nm1+nm2;
        // String name = nm1.concat(nm2);  /// it is not mutable so nm1 not changed
        // System.out.println(nm1);
        // System.out.println(name);


        //// way 2 
////   builder and buffer dono me methods same hi use honge .  ///-------------------------------------============------  

        //     StringBuffer str = new StringBuffer("Pintu");
        //     System.out.println(str);
        // str.append(" Kumar"); // /  / isse value change ho gyi str ki
        // System.out.println(str);


        /// way 3
        StringBuilder str = new StringBuilder("pintu");
        System.out.println(str);
        System.out.println(str.reverse());
        /// reverse
        str.reverse();
        System.out.println(str);
        /// new string
        str.append(" kumar");
        System.out.println(str);
        /// delete char
        str.deleteCharAt(6);
        System.out.println(str);  
        str.delete(6,8);
        System.out.println(str);

        // / / replace
        str.append(" kittu");
        System.out.println(str);
        str.replace(11, 14, "ss you");
        System.out.println(str);

        //////// count word
        

    }
}
