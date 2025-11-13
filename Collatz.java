// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int value = Integer.parseInt(args[0]);
		char vc = args[1].charAt(0);

	if (vc == 'v') {
		for (int i = 1; i <= value; i++) {
			int n = i;
			int steps = 1;
			System.out.print(n + " ");
			do { 
				if (n % 2 == 0) {
					n = n / 2;
				} else {
				n = 3 * n + 1;
				}
				steps++;
				System.out.print(n + " ");
			} while (n != 1);

			System.out.println("(" + steps + ")");
		}
		System.out.println("Every one of the first " + value + " hailstone sequences reached 1.");
		
	} else if (vc == 'c') {
			System.out.println("Every one of the first " + value + " hailstone sequences reached 1.");
		}

	}
}
