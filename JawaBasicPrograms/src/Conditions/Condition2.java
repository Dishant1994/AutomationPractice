package Conditions;

public class Condition2 {

	public static void main(String[] args) {
		 
			//defining a variable  
			int number=711;  
			//Check if the number is divisible by 2 or not  
			if(number%2==0){  
				System.out.println("even number");  
			}else{  
				System.out.println("odd number");
			
			}  
			int year = 2017;
			if ((year % 4 == 0)||(year % 400 == 0) && (year % 100 != 0)) {
				System.out.println("Given year "+year+" is LEAP YEAR");
			} else {
				System.out.println("Given year "+year+" is COMMON YEAR or NON LEAP YEAR");
			}
			checkEvenOddNumber(711);
			isNumberEven(60);
			checkEvenOddNumber2();

	}
		
			/*
			IfCondition1_2.checkEvenOddNumber(700);
			checkEvenOddNumber(711);
			*/
		
		/*
		 * static method with argument/parameter and return type as void
		 */
		static void checkEvenOddNumber(int num) {//int num=700;
			
			if(num%2==0){  
				System.out.println("Given number is even number: "+num);  
			}else{  
				System.out.println("Given number is odd number: "+num);  
			}
		}
		/*
		 * static method with argument and return type as boolean
		 */
		static boolean isNumberEven(int num) {
			if(num%2==0){ 
				System.out.println(true);
				return true;
			}else{ 
				System.out.println(false);
				return false;
			}
		}
		/**
		 * static method with no argument and return type as void
		 */
		static void checkEvenOddNumber2() {
			int num=50;
			if(num%2==0){  
				System.out.println("Given number is even number: "+num);  
			}else{  
				System.out.println("Given number is odd number: "+num);  
			
			}
		}



	}

