package programmingtheorems;

public class CountingTheory {

	public static void main(String[] args) {

		int[] myArray = { 1, 2, 1, 5, 6, 8, 9, 10, 1 };
		int testNum = 1;
		int howMany = 0;

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == testNum)
				howMany++;
		}
		System.out.println("Searched element: " + testNum);
		System.out.println("Found: " + howMany);
	}
}
