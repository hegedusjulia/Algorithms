package programmingtheorems;

public class Osszegzes {

	public static void main(String[] args) {
		System.out.println("Összegzés tétele");

		int[] someArray = { 1, 3, 5, 2, 6, 7, 0, 9 };
		int sum = 0;

		for (int i = 0; i < someArray.length; i++) {
			System.out.println("A tömb elemei: " + someArray[i]);
			sum += someArray[i];
		}
		System.out.println("A tömb összege: " + sum);
	}

}
