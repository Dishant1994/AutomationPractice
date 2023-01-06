package FunctionOrMethodInJava;

public class Sample {
     /* Static global variable */
	static int empID=101;
     /* Non-Static global variable */
	double salary=15000.78d;
	 /* Non-Static method */
	public double getEmpsalary()
	{
		System.out.println("Hi , you are in getEmpSalary()..."+salary);
		return salary ;
	}
	 /* Static method */
	public static int getEmpId()
	{
		System.out.println("Hi , you are in getEmpID()..."+empID);
		return empID ;
	}
	 /* Static method */
	public static void main(String[] args) 
	{
		System.out.println("Programs Stars");
		Sample.getEmpId(); // in standard form
		Sample S1 = new Sample();
		S1.getEmpsalary();
		System.out.println("");
		System.out.println("******** Take a New Value********");
		System.out.println("");
		empID=205;
		Sample.getEmpId(); // in standard form
		S1.salary=51000;
		S1.getEmpsalary();

	}
	

}
