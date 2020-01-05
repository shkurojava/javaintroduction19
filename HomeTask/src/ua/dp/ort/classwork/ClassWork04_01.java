package ua.dp.ort.classwork;

public class ClassWork04_01 {

	public static void main(String[] args) {

		int counter = -1000;

		// while (counter++ <= 1_000) {
		// if ((counter % 3 == 0) && (counter % 5 == 0)) {
		// System.out.println(counter);
		// }
		// counter++;
		// }
		int n = -1;
		while (counter++ <= 1_000) {
			if (counter < 0) {
				continue;
			}
			if (counter % 2 == 0) {
				n++;
				int q;
				System.out.println(counter);
			}
			if (n >=11) {
				break;
			}
		}
		int q;
		System.out.println(n);
	}
}
