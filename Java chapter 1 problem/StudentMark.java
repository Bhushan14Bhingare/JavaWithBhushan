import java .util.Scanner;
public class StudentMark {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int marks = sk.nextInt();
        String result = (marks >= 33)? "Pass":"Fail";
        System.out.println(result);
    }
    
}
