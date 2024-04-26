import java.util.HashMap;
import java.util.Scanner;


/**
 * Student
 */ 
class Student {
    public String name;
    public int rollno;
    public int age;
    public int marks ;

    /////  construter are  the methods those have same name as class and they do not have type
    public Student (String name, int rollno, int age, int marks){
        this.name = name ;
        this.rollno= rollno;
        this.age = age;
        this.marks = marks;

    }
    public void viewstd(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("rollno: "+ rollno);
        System.out.println("marks: "+ marks);
    }
}
public class Project {
    
    public static void main(String[] args) {
        try {
                
            
            Scanner sc = new Scanner(System.in);
            HashMap <Integer,Student> database = new HashMap<>();
            
            
            while (true) {
                System.out.println("1. Add student");
                System.out.println("2. view student");
                System.out.println("3. search student");
                System.out.println("4. Calculate average marks");
                System.out.println("5. exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1: System.out.print("Enter your name: ");
                            String name =sc.nextLine();
                            System.out.print("Enter yr rollno: ");
                            int rollno = sc.nextInt();
                            System.out.print("Enter yr age: ");
                            int aage = sc.nextInt();
                            System.out.println("Enter yr marks: ");
                            int marks = sc.nextInt();
                            Student std = new Student(name, rollno, aage, marks);
                            database.put(rollno, std);
                            System.out.println("Student added successsfuly");
                        break;
                    case 2: System.out.println("List of student: ");
                            for(Student e : database.values()){
                                e.viewstd();
                            }
                        break;
                    case 3: System.out.print("Enter yr rollno: ");
                            int roll = sc.nextInt();
                            Student data = database.get(roll);
                            if (data!=null) {
                                data.viewstd();
                            } else {
                                System.out.println("Student not found  ugfu");
                            }
                            System.out.println("**********************");
                        break;
                    case 4: 
                            int totalstd = database.size();
                            int totalmarks = 0 ; 
                            for (Student j : database.values()) {
                                totalmarks += j.marks;
                            }
                            double avg = (double)totalmarks/totalstd;   /////   totalmarks/totalstd;
                            System.out.println("Average marks : "+ avg);
                        break;
                    case 5: System.exit(0); /////  when loop is running time then use system.exit(0)v then our lopp exit 
                            break;
                    default: System.out.println("Invalid choice");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
