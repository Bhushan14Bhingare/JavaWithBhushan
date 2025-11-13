public class Hosteller extends Student {
     protected double hostelFee;

	 public Hosteller(int studentId, String studentName, double examfee, double hostelFee) {
		super(studentId, studentName, examfee);
		this.hostelFee = hostelFee;
	 }
     
	 public void payFee(double amount) {
    	 double total = hostelFee + super.payFee();
    	 
    	 if(amount == total) {
    		 System.out.println("All Fees Clear");
    	 }
    	 else if(total > amount) {
    		 System.out.println("Remaining fee of the college : "+(total-amount));
    	 }
    	 else {
    		 System.out.println("Refundabale Amount is : : "+(amount-total)); 
    	 }
      }

	 @Override
	 public String toString() {
		return "Hosteller ["+super.displayDetails()+ ", hostelFee=" + hostelFee + "]";
	 }
	 
	 
}
