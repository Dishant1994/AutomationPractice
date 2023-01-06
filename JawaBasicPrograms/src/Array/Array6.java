package Array;

import java.util.Arrays;

public class Array6 {
	public static void main(String args[]) {
		int[] num1= {5,2,55,80,100,20,3};
		for(int a:num1) {
			System.out.println(a);
		}
		 //sort will sort the elements of an array in ascending order and stores in the same array
		System.out.println("************num1 after sorting***************");
		
		Arrays.sort(num1);
		for(int a:num1) {
			System.out.println(a);
		}
		
		System.out.println("***********CopyOf array*******************");
		int copyArray[]=Arrays.copyOf(num1, 7);
		
		for(int num:copyArray) {
			System.out.println(num);
		}
		/*
		System.out.println("***********CopyOf array1*******************");
		int copyArray1[]=Arrays.copyOf(num1, 10);
		for(int num:copyArray1) {
			System.out.println(num);
		}
		*/
		System.out.println("*************CopyRange array***************");
		int[] num2=Arrays.copyOfRange(num1, 0, 7);
		for(int a:num2){
			System.out.println(a);
		}
	}
}
