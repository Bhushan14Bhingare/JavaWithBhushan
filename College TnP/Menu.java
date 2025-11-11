import java.util.Scanner;
public class Menu {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        System.out.print("Choice any number :");
        int menu = sk.nextInt();

        switch(menu){

            case 1 : System.out.print("Enter  length of rectangle : ");
                     int length = sk.nextInt();

                     System.out.print("Enter breath of rectangle :");
                     int breath = sk.nextInt();

                     int area = length * breath;
                     System.out.println("Area of the rectangle : "+area );
                     break;

            case 2 : System.out.print("Enter height of the triangle :");
                     int h = sk.nextInt();
                     
                     System.out.print("Enter breath of the triangle :");
                     int b = sk.nextInt();

                     int triangle = (h*b)/2;
                     System.out.println("Area of the triangle : "+triangle);
                     break;

            case 3 : System.out.print("Enter first side of the  square : ");
                     int a = sk.nextInt();

                     System.out.print("Enter second side of the square : ");
                     int c = sk.nextInt();

                     int square = a * c;
                     System.out.println("Area of the square : "+square);
                     break;

            case 4 : System.out.println("Enter side of the equilateral : ");
                     int d = sk.nextInt();

                     double equilateral = (1.73 * (d * d)) / 4 ; 
                     System.out.print("Area of the equilateral "+equilateral);
                     break;

            case 5 : System.out.print("Enter the radius of the circle : ");
                     int r = sk.nextInt();

                     double circle = 3.14 * r * r ;
                     System.out.println("Area of the circle : "+circle);
                     break;

            default : System.out.println("Please choice the number between 1 to 5");            
        }
    }
}
