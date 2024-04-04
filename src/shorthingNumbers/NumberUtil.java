package shorthingNumbers;

public class NumberUtil {
	

public static void main(String[] args) {
		
		run();
	}
	
	public static  void run () {
		
		java.util.Scanner input  = new java.util.Scanner(System.in);
		System.out.println("Enter three numbers");
		int a  = Integer.parseInt(input.nextLine());
		int b  = Integer.parseInt(input.nextLine());
		int c  = Integer.parseInt(input.nextLine());
		input.close();
		
		shortingNumbers(a, b, c);
	}
	
	public static void shortingNumbers(int a, int b, int c) {
		
		smallest_a(a, b, c);
		smallest_b(a, b, c);
		smallest_c(a, b, c);
		
		 
	}
	public static void smallest_a (int a, int b, int c) {
		
		
		if(a < b && b <  c)
			System.out.printf("%d < %d < %d", a, b, c);
		
		if(a < c && c <  b)
			System.out.printf("%d < %d < %d", a, c, b);
			
		if(a < b && b == c)
			System.out.printf("%d < %d = %d", a, b, c);
		
		if(a == b && b <  c)
			System.out.printf("%d = %d < %d", a, b, c);
		
		if(a == c && a <  b)
			System.out.printf("%d = %d < %d", a, c, b);
		
		
		
		
	}
		
	
	public static void smallest_b (int a,int b, int c) {
		
		if(b < a && a <  c)
			System.out.printf("%d < %d < %d", b, a, c);
		
		if(b < c && c < a)
			System.out.printf("%d < %d < %d", b, c, a);
			
		if(b < a && a == c)
			System.out.printf("%d < %d = %d", b, a, c);
		
		if(b == c && c < a)
			System.out.printf("%d = %d < %d", b, c, a);
		
		
		
		}
	
	
	public static void smallest_c (int a, int b, int c) {
		

		if(c == a && a == b)
			System.out.printf("%d = %d = %d", c, a, b);
		
		if(c < a && a < b)
			System.out.printf("%d < %d < %d", c, a, b);
		
		if(c < b && b < a)
			System.out.printf("%d < %d < %d", c, b, a);
			
		if(c < b && b == a)
			System.out.printf("%d < %d = %d", c, b, a);
		
		
		
	}
		
  

}
