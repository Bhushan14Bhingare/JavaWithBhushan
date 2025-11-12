package Inheritance;

import java.util.Scanner;

public class Hierarchical {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         boolean isValid = true;
	  
	  while(isValid) {
		  System.out.println("Enter a choice permanent or contract ");
		
	  String service = sc.nextLine().toLowerCase();
	  
	  if(service.equals("permanent")|| service.equals("contract")){
		 	  
	System.out.print("Enter "+service+" employee Id : ");
	int id = Integer.parseInt(sc.nextLine());
	
	System.out.print("Enter "+service+" employee Name : ");
	String name = sc.nextLine();
	
	System.out.print("Enter "+service+" employee Salary : ");
	double salary = Double.parseDouble(sc.nextLine());
	
	switch(service) {
	case "permanent" ->{
		PermanentEmployee permanentEmployee = new PermanentEmployee(id, name, salary);
		System.out.println(permanentEmployee);
		permanentEmployee.netSalary();
	}
	case "contract" ->{
		System.out.print("Enter contract duration in a year : ");
		int year = Integer.parseInt(sc.nextLine());
		ContractEmployee contract = new ContractEmployee(year, id, name, salary);
		System.out.println(contract);
	}
	}
	  
	  
        System.out.println("Do you want to continue to add employee details : ");
        String valid = sc.nextLine();
        
        if(valid.equalsIgnoreCase("No")){
        	System.out.println("Thank you for using my code....");
        	System.exit(0);
        }
	  }
	  else {
		  System.out.println("Invalid Choice...");
		  System.exit(0);
	  }
	  }
	  sc.close();
        
    }
}
class Employee{
    protected int employeeId;
    protected String employeeName;
    protected double salary;

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }    
}

class PermanentEmployee extends Employee{

    protected double providentFund = 12;

    public PermanentEmployee(int employeeId, String employeeName, double salary){
       super(employeeId, employeeName, salary);

       this.providentFund = salary * .12;
    }

    @Override
    public String toString() {
        return "PermanentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
                + ", providentFund=" + providentFund + "]";
    }

    public void netSalary(){
        System.out.println("Net Salary : "+(salary+providentFund));
    }
}
class ContractEmployee extends Employee {
           protected int contractDuration;
           
           public ContractEmployee(int contractDuration,int employeeId, String employeeName, double salary) {
        	   super(employeeId,employeeName,salary);
        	   
        	   this.contractDuration = contractDuration;
           }

		   @Override
		   public String toString() {
			return "ContractEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
					+ salary + ", contractDuration=" + contractDuration + " Years]";
		   }
           
           
}
