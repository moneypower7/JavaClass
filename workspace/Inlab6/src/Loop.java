
public class Loop {
	// empty constructor
	public Loop() {

	}

	public void loop1(int lb, int ub, in incr) {
		for (int n = 1; n < 11; n++) {
			System.out.println("Loop 1 output (lb = 1, ub = 10, incr = 1)");
			System.out.println(n);
			System.out.println("-----------------------------");
		}
	}

	public void loop2(int lb, int ub, int incr) {
		int n = 1;
		System.out.println("Loop 1 output (lb = 1, ub = 10, incr = 1)");
		while (n < 11) {
			System.out.println(n);
			n++;
		}
		System.out.println("-----------------------------");
	}
	public void loop3(){
		char c = 'a';
		 
		while (c <= 'z') {
		  System.out.println(c);
		  c++;
		}
	}
}
