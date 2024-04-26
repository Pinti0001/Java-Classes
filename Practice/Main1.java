// import java.util.Arrays;

// public class Main {
//     // static void 

//     public static void main(String[] args) {
//         // String x = "110";
//         // String y = "011";
//         // String ad = x+y;
        
//         // System.out.println(ad.substring(1, ad.length()-1));

//         // int v = 5;
//         // for(int i = 1;i<=v;i++){
//         //     System.out.println();
//         //     for(int j=1;j<=i;j++){
//         //         System.out.print("*"+" ");
//         //     }
//         //     System.out.println();
//         // }


//         // int r = 5;
//         // for(int i = 1;i<=r;i++){
            
//         //     for(int j =0;j<r-i;j++){
//         //         System.out.print("\t");
//         //     }
//         //     for(int j =i;j<2*i-1;j++){
//         //         System.out.print(j+"\t");
                
//         //     }
//         //     for(int j =2*i-1;j>i-1;j--){
//         //         System.out.print(j+"\t");
//         //     }
            
//         //     System.out.println();
//         // }



//         // int[] arr = {1,2,3,4,5};
//         //     System.out.println(Arrays.toString(arr));
//         // for(int i =arr.length-1;i>=0;i--){
//         //     System.out.print(arr[i]+" ");
//         // }
//     }
// }



// import java.util.Scanner;
// import java.util.HashMap;
// class Student{
//     public String name;
//     public int rollNo;
//     public int age;
//     public int marks;
//     // contructors are the methods those have same name as class and they do not have return type
//     public Student(String name, int rollNo, int age, int marks){
//         this.name=name;
//         this.rollNo=rollNo;
//         this.age=age;
//         this.marks=marks;
//     }
//     public int display(){
//         return rollNo;
//     }
//     public void viewStudent(){
//         System.out.println("Name: "+name);
//         System.out.println("Roll Number: "+rollNo);
//         System.out.println("Age: "+age);
//         System.out.println("Marks: "+marks);
//     }
// }
// public class Main {
//    public static void main(String [] args){
//     Scanner sc= new Scanner(System.in);
//     HashMap<Integer,Student> database= new HashMap<Integer,Student>();

//     while(true){
//         System.out.println("1. Add student");
//         System.out.println("2. view student");
//         System.out.println("3. search student");
//         System.out.println("4.  Calculate average marks ");
//         System.out.println("5. exit");
//         System.out.print("Enter your choice: ");
//         int choice= sc.nextInt();
//         sc.nextLine();
//         switch(choice){
//             case 1: System.out.print("Enter your name: ");
//                     String name= sc.nextLine();
//                     System.out.print("Enter your roll number: ");
//                     int rollNo= sc.nextInt();
//                     System.out.print("Enter your age : ");
//                     int age= sc.nextInt();
//                     System.out.print("Enter your marks: ");
//                     int marks= sc.nextInt();
//                     Student std= new Student(name,rollNo,age,marks);
//                     database.put(rollNo,std);
//                     System.out.println("Student added successfuly");
//                     break;
//             case 2: System.out.println("List of students: ");
//                     for(Student i:database.values()){
//                        i.viewStudent();
//                     }
//                     break;
//             case 3: System.out.print("Enter your roll number: ");
//                     int roll= sc.nextInt();
//                     database.get(roll).viewStudent();
//                     System.out.println("******");
//                     break;
//             case 4: 
//                   int totalStudent= database.size();
//                   int totalMarks=0;
//                   for(Student j:database.values()){
//                     totalMarks=totalMarks+j.marks;
//                   }
//                   double average= (double)totalMarks/totalStudent;
//                   System.out.println("Average Marks: "+average);
//                   break;
//             case 5: System.exit(0);
//                    break;
//             default: System.out.println("Invailid choice");
//         }

//     }
//    }

//     public class SmallestMissingInteger {

//     public static int smallestMissingInteger(int[] nums) {
//         Arrays.sort(nums);

//         int sum = 0;
//         int longestSequentialPrefix = 0;

//         for (int i = 0; i < nums.length; i++) {
//             if (i == 0 || nums[i] == nums[i - 1] + 1) {
//                 longestSequentialPrefix += nums[i];
//             } else {
//                 break;
//             }
//         }

//         for (int num : nums) {
//             if (num > longestSequentialPrefix) {
//                 return longestSequentialPrefix + 1;
//             }
//             sum += num;
//         }

//         return sum + 1;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 2, 5};
//         int result = smallestMissingInteger(nums);
//         System.out.println("Output: " + result);
//     }
// }


