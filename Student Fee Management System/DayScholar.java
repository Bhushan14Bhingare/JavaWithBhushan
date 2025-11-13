public class DayScholar extends Student {
     protected double transportFee;

	 public DayScholar(int studentId, String studentName, double examfee, double transportFee) {
		super(studentId, studentName, examfee);
		this.transportFee = transportFee;
	 }
     
     public void payFee(double amount) {
    	 double total = transportFee + super.payFee();
    	 
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
		return "DayScholar ["+super.displayDetails()+ ", transportFee=" + transportFee + "]";
	 }
     
     
     
     
}
