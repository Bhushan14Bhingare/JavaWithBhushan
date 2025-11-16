package TEST;

import java.util.Scanner;

public class EmployeeRole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a employee name : ");
        String name = sc.nextLine();

        System.out.print("Enter a employee id : ");
        int id = Integer.parseInt(sc.next());

        System.out.print("Enter a employee Salary : ");
        double salary = Double.parseDouble(sc.next());

         System.out.print("Enter a employee bonus : ");
        double bonus = Double.parseDouble(sc.next());
        Employee emp = new Employee(id, name, salary);

        System.out.println(emp);

        emp.setSalary(bonus);

        System.out.println(emp);

        emp.employeeRole(emp.getSalary());

         sc.close();
    
    }
}
class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        if(id<= 0 || name == null || name.isBlank() || salary<=0){
            System.out.println("Value is not valid.");
            System.exit(0);
        }
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(double salary){
        this.salary += salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public void employeeRole(double salary){
        if(salary >= 120000){
            System.out.println("It is a HR Manager.");
        }
        else if(salary >= 90000 && salary < 120000){
            System.out.println("It is a Developer.");
        }
        else if(salary >= 60000 && salary < 90000){
            System.out.println("It is a Designer.");
        }
        else {
            System.out.print("It is a tester.");
        }
    }

    @Override
    public String toString() {
        return "Employee Details :\nEmployee Id=" + id + "\nEmployee Name=" + name + "\nEmployee salary=" + salary;
    }

}
