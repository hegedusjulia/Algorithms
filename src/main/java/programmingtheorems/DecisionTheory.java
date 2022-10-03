package programmingtheorems;

public class DecisionTheory {

	public static void main(String[] args) {

		int[] myArray = { 3, 5, 1, 61, 1, 24, 7, 0, 2 };
		int testNum = 1;
		boolean found = false;

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == testNum) {
				found = true;
				break;
			}
		}
		String result = (found == true) ? "yes" : "no";
		System.out.println("The item we are searching for is: " + testNum);
		System.out.println("Found: " + result);
	}
}
