import java.util.Scanner;
public class Percentage {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);

        System.out.print("Enter the maths marks : ");
        int maths = sk.nextInt();

        System.out.print("Enter the English marks : ");
        int eng = sk.nextInt();

        System.out.print("Enter the Science marks : ");
        int sci = sk.nextInt();

        System.out.print("Enter the art marks : ");
        int art = sk.nextInt();

        System.out.print("Enter the  computer marks : ");
        int com =  sk.nextInt();

        int total = eng + sci + art + com + maths;
        System.out.println("Total Marks out of 500 : " +total);

        int per = (total * 100)/500;
        System.out.print("Percentage of the student : "+per);

    }
    
}
