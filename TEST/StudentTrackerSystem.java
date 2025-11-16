package TEST;

import java.util.Scanner;

public class StudentTrackerSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a student id : ");    
        int id = Integer.parseInt(sc.nextLine());
         System.out.print("Enter a student name : ");
        String name = sc.nextLine();
         System.out.print("Enter a student hardwork : ");
        int hardWork = Integer.parseInt(sc.nextLine());
         System.out.print("Enter a student task : ");
        int task = Integer.parseInt(sc.nextLine());
         System.out.print("Enter a student lab attendance : ");
        double lab = Double.parseDouble(sc.nextLine());
         System.out.print("Enter a student class attendance : ");
        double attendance = Double.parseDouble(sc.nextLine());

        int choice = Integer.parseInt(sc.nextLine());

        Placement student = new Placement(id, name, hardWork, task, attendance, lab);
        System.out.println("1. Check Details.");
        System.out.println("2. Probability of placement.");
        System.out.println("3. Eligible or not for palcement.");

        switch(choice){
          case 1->{
                 student.displayDetails();
          }
          case 2->{
            student.checkEligibility();
          }
          case 3->{
            student.eligibilityCriteria();
          }
          case 4->{
            System.out.print("Exit the loop");
            System.exit(0);
          }
        }
sc.close();
    
    }
}
class Person{
    protected int id;
    protected String name;
    
    public Person(int id, String name){
         this.id = id;
         this.name = name;
    }  
}

class Student extends Person{
    protected int hardWork;
    protected int task;

    public Student(int id, String name, int hardWork, int task){
        super(id, name);
        this.hardWork = hardWork;
        this.task = task;
    }
}

class Placement extends Student{
    protected double attendance;
    protected double labAttendance;

    public Placement(int id, String name, int hardWork, int task, double attendance, double labAttendance){
        super(id, name, hardWork, task);

        this.attendance = attendance;
        this.labAttendance = labAttendance;
    }

    public void checkEligibility(){
        double probability = (hardWork *0.3)+(task * 5)+(attendance * 0.2)+(labAttendance * 0.2);
        System.out.println("Esitmate chance of Placement : "+probability);
    }

    public void eligibilityCriteria(){
        if(hardWork>=70 && task >=7 && attendance >= 75 && labAttendance >= 75){
            System.out.println("You are eligible for placement..");
        }
        else{
            System.out.println("You are NOT a eligible for palcement..");
        }
    }

    public void displayDetails(){
        System.out.println("Student Id : "+id);
        System.out.println("Student Name : "+name);
        System.out.println("Student Hard Work : "+hardWork);
        System.out.println("Student Completed Task : "+task);
        System.out.println("Student Class Attendance : "+attendance);
        System.out.println("Student Lab Attendance "+labAttendance);
    }
}
