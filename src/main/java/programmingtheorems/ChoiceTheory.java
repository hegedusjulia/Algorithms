package programmingtheorems;

public class ChoiceTheory {

	public static void main(String[] args) {

		int[] myArray = { 1, 3, 5, 4, 22, 1, 45, 18, 22 };

		int choice = 22;
		System.out.println("We are searching for: " + choice);

		int i = 0;
		while (myArray[i] != choice && i < myArray.length) {
			i++;
		}
		System.out.println("Element found here: " + (i + 1));
	}
}
