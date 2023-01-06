package FunctionOrMethodInJava;

public class Sample1 
{
	/*static */ int A=10,B=20, res=A+B;
	private void substraction()
	{
		//int A=20,B=10;
		System.out.println("I am Substraction Method\nSubstraction = "+(A-B)+"\n");
	}

	public static void main(String[] args) 
	{
		System.out.println("\nI Am DISHANT \nFrom Group : B \n9th Sep. Bach\n");
		
		Sample1.Multiplication(15,15); // this method is static so it is called directly...
		
		Sample1 A1=new Sample1(); // this method is non-static so first create object "syntax is,class name-space-object=new keyword-space-class name(); 
		A1.Add();                    //then we can call object.method name(); 
		
		A1.Devision();
		
		A1.substraction();
				
	}
	void Add()
	{
		System.out.println("I am Addition Method");
		//int A=10 , B=20, res=A+B;
		System.out.println("Addition = "+res+"\n");
	}
	public static void Multiplication(int A , int B)
	{
		System.out.println("I am Multiplication Method");
		//int A=10,B=20;
		System.out.println("Multiplication = "+(A*B)+"\n");
	}
	public int Devision()
	{
		System.out.println("I am Devision Method");
		double A=30,B=50;
		System.out.println("Division = "+(B/A)+"\n");
		return 10;
		
	}
	

}
