import java.util.ArrayList;

public class ComputeMean {
	public static void main(String[] args) {
		// Fill an ArrayList with the numbers 1-10
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			list.add((int) (Math.random() * 100));
		}

		double result = computeMean(list); // You will complete this method

		System.out.println("The mean value of list = " + result);

	}

	// POST: computes and returns the mean value of list
	public static double computeMean(ArrayList<Integer> list) {
		double mean = 0;

		// Compute the mean here
		
		
		// Do not modify this line
		return mean;
	}
}
