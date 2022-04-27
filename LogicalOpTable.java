// Try this 2-2, truth table

class LogicalOpTable {
	public static void main (String args[]) {
		boolean p, q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = true; q = true;
        System.out.print(toBinary(p) + "\t" + toBinary(q) + "\t");
        System.out.print(toBinary(p&q) + "\t" + toBinary(p|q) + "\t");
        System.out.println(toBinary(p^q) + "\t" + toBinary(!p) + "\t");

        p = true; q = false;
        System.out.print(toBinary(p) + "\t" + toBinary(q) + "\t");
        System.out.print(toBinary(p&q) + "\t" + toBinary(p|q) + "\t");
        System.out.println(toBinary(p^q) + "\t" + toBinary(!p) + "\t");

        p = false; q = true;
        System.out.print(toBinary(p) + "\t" + toBinary(q) + "\t");
        System.out.print(toBinary(p&q) + "\t" + toBinary(p|q) + "\t");
        System.out.println(toBinary(p^q) + "\t" + toBinary(!p) + "\t");

        p = false; q = false;
        System.out.print(toBinary(p) + "\t" + toBinary(q) + "\t");
        System.out.print(toBinary(p&q) + "\t" + toBinary(p|q) + "\t");
        System.out.println(toBinary(p^q) + "\t" + toBinary(!p) + "\t");
	}
	
	private static int toBinary(boolean value) {
		if (value == true)
			return 1;
		else
			return 0;
	}
}