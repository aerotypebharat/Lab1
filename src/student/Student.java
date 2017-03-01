package student;

public class Student {

	int studentId;
	String studentName;
	static int studentSection=1;
	
	public  void printInfo(int x, String y, int z){
		
		System.out.println("Student Id= " + x+ "; Student Name: " + y+ "; Section = " + z + "\n");
		
		
		
				
	}
	
	public static void main(String args[]){
		
		
		Student s1 = new Student();
		s1.studentId=1;
		s1.studentName="Radhikesh";
		

		Student s2 = new Student();
		s2.studentId=2;
		s2.studentName="Kishor";
		

		Student s3 = new Student();
		s3.studentId=3;
		s3.studentName="Arjun";
		

		Student s4 = new Student();
		s4.studentId=4;
		s4.studentName="Ujjwol";
		
		
		s1.printInfo(s1.studentId, s1.studentName, studentSection);
		s2.printInfo(s2.studentId, s2.studentName, studentSection);
		s3.printInfo(s3.studentId, s3.studentName, studentSection);
		s4.printInfo(s4.studentId, s4.studentName, studentSection);
		
		
		
		
		
	}
	
	
	
	
	
	
}
