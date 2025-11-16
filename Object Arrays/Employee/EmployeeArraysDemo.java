import java.util.Scanner;

public class EmployeeArraysDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of an array : ");
        int size = Integer.parseInt(sc.nextLine());

        Employee emp[] = new Employee[size];

        for(int i = 0 ; i < emp.length ; i++){
            System.out.print("Enter a employee id : ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter a employee name : ");
        String name = sc.nextLine();

        System.out.print("Enter a employee salary : ");
        int salary = Integer.parseInt(sc.nextLine());

        emp[i] = new Employee(id,name,salary);
        }

        for(Employee e1 : emp){
            System.out.println(e1);
        }
    }
}
