package Final_Keyword;

class FinalKeyword1 {
	final int empId=10; // Non-Static global variable with final keyword
	double salary=34400.67; // Non-Static global variable
	void run() { 
		System.out.println("empId: "+empId);
	}

	public static void main(String args[]) {
		FinalKeyword1 obj = new FinalKeyword1();
		obj.run();
		System.out.println(obj.salary);
	}
}