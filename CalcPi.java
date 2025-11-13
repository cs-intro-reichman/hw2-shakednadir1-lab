// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int terms = Integer.parseInt(args[0]);

		if (terms == 0) {
            System.out.println("pi according to Java: " + Math.PI);
            System.out.println("pi, approximated:     " + 0.0);
			return;
		} else if (terms == 1) {
			System.out.println("pi according to Java: " + Math.PI);
			System.out.println("pi, approximated:     " + 4.0);
			return;
		}
		
		double piApproximation = 1.0;
		double num = 3.0;

		for (int i = 2; i <= terms; i++) {
			if (i % 2 == 0) {
				piApproximation -= 1.0 / num;
			} else {
				piApproximation += 1.0 / num;
			}
			num += 2.0;
		}
		piApproximation *= 4.0;
		Double piValue = Math.PI;
		System.out.println("pi according to Java: " + piValue);
		System.out.println("pi, approximated:     " + piApproximation);
	}
}
