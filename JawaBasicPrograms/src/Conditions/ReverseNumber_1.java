package Conditions;

public class ReverseNumber_1 {

	public static void main(String[] args) {
		int Number=527 , Remainder, Reverse=0;
		
		System.out.println("Given No. is = "+Number);
		while(Number!=0)
		{
			Remainder = Number%10;
			Reverse=Reverse*10+Remainder;
			Number=Number/10;
		}
		
		System.out.println("Reverse No. is = "+Reverse);

	}

}
