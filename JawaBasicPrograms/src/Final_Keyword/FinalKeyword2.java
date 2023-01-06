package Final_Keyword;

class FinalKeyword2 {

	final int speedlimit;    // blank final variable
	FinalKeyword2() {        // here create constructor ...constructor use to initialize non-static member of the object
		speedlimit = 70;
		System.out.println(speedlimit);
	}
	public static void main(String args[]) {
		FinalKeyword2 f1=new FinalKeyword2();
		System.out.println(f1.speedlimit); 
	}
}
