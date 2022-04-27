// Demonstrates If

class IfDemo {
	public static void main (String args[]) {
		int a,b,c;
		a = 2;
		b = 3;
		
		if(a<b) System.out.println("a is less then b");
		
		if(a==b) System.out.println("you wont see this");
		
		System.out.println();
		
		c = a-b; // c contains -1
		
		System.out.println("c contains -1");
		if(c>=0) System.out.println("c is non-negative");
		if(c<0) System.out.println("c is negative");
		
		System.out.println();
		
		c = b-a; // c contains -
		
		System.out.println("c contains 1");
		if(c>=0) System.out.println("c is non-negative");
		if(c<0) System.out.println("c is negative");
		
	}
}