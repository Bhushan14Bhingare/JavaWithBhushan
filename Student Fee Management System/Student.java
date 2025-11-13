public class Student {
   protected int studentId;
   protected String studentName;
   protected double examfee;
   
   public Student(int studentId, String studentName, double examfee) {
	super();
	if(studentId <=0 ) {
		System.out.println("Student Id cannot be zero OR positive");
		System.exit(0);
	}
	this.studentId = studentId;
	if(studentName == null || studentName.isBlank()) {
		System.out.println("Name cannot be null or blank");
		System.exit(0);
	}
	this.studentName = studentName;
	if(examfee <= 0) {
		System.out.println("Exam fees cannot be negative");
		System.exit(0);
	}
	this.examfee = examfee;
   }
   
   public double payFee() {
	   return examfee;
   }

   
   public String displayDetails() {
	return "studentId=" + studentId + ", studentName=" + studentName + ", examfee=" + examfee;
   }
   
   
}
