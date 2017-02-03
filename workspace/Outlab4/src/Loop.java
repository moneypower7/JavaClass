
public class Loop {
	// empty constructor
	public Loop() {

	}

	public void loop1(int lb, int ub, int incr) {
		System.out.println("Loop 1 output (lb = " + lb + ", ub = " + ub + ", incr = " + incr + ")");
		for (int n = lb; n < ub; n += incr) {
			System.out.println(n);
			
		}
		System.out.println("-----------------------------");
	}

	public void loop2(int lb, int ub, int incr) {
		int n = lb;
		System.out.println("Loop 2 output (lb = " + lb + ", ub = " + ub + ", incr = " + incr + ")");
		while (n < ub) {
			System.out.println(n);
			n += incr;
		}
		System.out.println("-----------------------------");
	}

	public void loop3() {
		System.out.println("Loop 3 Output:");
		int n = 1;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		while (n <= 26) {
			System.out.println(alphabet.substring(0, n));
			n++;
		}
		System.out.println("-----------------------------");
	}

	public void loop4(int val) {
		int n = 0;
		int num, counter;
		counter = 0;
		System.out.println("Loop 4 Output:");
		while (n < 10) {
			num = (int) (Math.random() * 10) + 1;
			if (num == val) {
				counter++;
			}
			n++;
		}
		System.out.println(val + " was found " + counter + " times.");
		System.out.println("-----------------------------");
	}

	public void loop5(int val) {
		int n = 0;
		int num, counter;
		counter = 0;
		System.out.println("Loop 5 Output:");
		while (counter < 5) {
			num = (int) (Math.random() * 10) + 1;
			if (num == val) {
				counter++;
			}
			n++;
		}
		System.out.println("It took " + counter + " iterations to generate " + val + " five times.");
		System.out.println("-----------------------------");
	}
}