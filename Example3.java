// Differenze double int

class Example3 {
	public static void main(String args[]) {
		int v; // intero
		double x; // floating-point
		v = 10;
		x = 10.0;
		
		System.out.println("Original value of v: " + v);
		System.out.println("Original value of x: " + x);
		System.out.println();
		
		// divide both by 4
		
		x = x / 4;
		v = v / 4;
		
		System.out.println("v after division: " + v);
		System.out.println("x after division: " + x);
				
	}
}