import java.util.Scanner;


public class StudentFeesCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Select a particular type of Student :\n" + "		 1) Hosteller Student \n"
				+ "		 2) DayScholer Student ");
		int choice = Integer.parseInt(sc.nextLine());

		switch (choice) {
		case 1 -> {
			System.out.println("You have selected Hosteller!!!");
			System.out.print("Enter Student Id : ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("Enter Student Name : ");
			String name = sc.nextLine();
			System.out.print("Enter Exam Fee :");
			double fee = Double.parseDouble(sc.nextLine());
			System.out.print("Enter Hostel Fee :");
			double hostelFee = Double.parseDouble(sc.nextLine());
			Hosteller student = new Hosteller(id, name, fee, hostelFee);
			System.out.print("Payable Amount is : ");
			double amount = Double.parseDouble(sc.nextLine());
			if (amount <= 0) {
				System.out.println("Amount should be positive.");
				System.exit(0);
			}
			System.out.println(student);
			student.payFee(amount);
		}
		case 2 -> {
			System.out.println("You have selected Hosteller!!!");
			System.out.print("Enter Student Id : ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("Enter Student Name : ");
			String name = sc.nextLine();
			System.out.print("Enter Exam Fee :");
			double fee = Double.parseDouble(sc.nextLine());
			System.out.print("Enter transport Fee :");
			double transportFee = Double.parseDouble(sc.nextLine());
			DayScholar student = new DayScholar(id, name, fee, transportFee);
			System.out.print("Payable Amount is : ");
			double amount = Double.parseDouble(sc.nextLine());
			if (amount <= 0) {
				System.out.println("Amount should be positive.");
				System.exit(0);
			}
			System.out.println(student);
			student.payFee(amount);
		}
		}
		sc.close();
	}

}
