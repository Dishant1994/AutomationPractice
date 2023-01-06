package Final_Keyword;

public class Pyramid1 {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		for(char i='a';i<='e';i++) {
			for(char j='a';j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(char i='a';i<='e';i++) {
			for(char j='a';j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		for(int i=5;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=5;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}	
			System.out.println();
			
		}
		for(int i=5;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}	
			System.out.println();
		}

		for(char i='e';i>='a';i--) {
			for(char j='a';j<=i;j++) {
				System.out.print(j+" ");
			}	
			System.out.println();
		}
		for(char i='e';i>='a';i--) {
			for(char j='a';j<=i;j++) {
				System.out.print(i+" ");
			}	
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1;k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) 
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1;k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1;k++) 
			{
				System.out.print(i);
			}
			System.out.println();
		}


	}
}

