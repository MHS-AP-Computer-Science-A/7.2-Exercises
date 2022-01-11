import java.util.ArrayList;

public class RemoveElements {
	public static void main(String[] args) {
		// Fill an ArrayList with the numbers 1-10
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		System.out.println("Before removing first 2 and last 2:\n" + list);

		removeElements(list); // You will complete this method

		System.out.println("After removing first 2 and last 2:\n" + list);

	}

	public static void removeElements(ArrayList<Integer> list) {
		// Your code to remove the first two elements and the last two elements from
		// list

	}
}
