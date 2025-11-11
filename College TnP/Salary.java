import java.util.Scanner;
public class Salary {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);

        System.out.print("Enter the salary : ");
        double basic  = sk.nextDouble();

        double hr = 0.10 * basic;
        System.out.println("House Rent is " +hr);

        double da = 0.05* basic;
        System.out.println("Dearness Allowance is " + da);

        double grossalary = basic + hr + da ;
        System.out.println("Gross Salary is " + grossalary);

        double pf = 0.12 *  basic;
        System.out.println("PF is " +pf);

        double tax =  0.12 * grossalary;
        System.out.println("Tax is " +tax);

        double netpay = grossalary - tax;
        System.out.println("Netpay is " +netpay);





    }
}
