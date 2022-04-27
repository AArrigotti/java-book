// Prime numbers

class Prime {
	public static void main(String args[]) {
		int i,m=0, flag=0;
		int n=2;
		m=n/2;
		for(i=2; i<=m; i++) {
			if(n%i==0) {
				flag=1;
				break;
			
				if(flag==0) {
					System.out.println(n+" is prime number");
				}
			}
			
		}
	}
}

