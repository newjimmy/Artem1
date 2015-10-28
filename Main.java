package firsttask;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int[] arr = new int[100];
		int countArraySize = 0;
		int countOne = 0;
		int countThree = 0;
		int countFive = 0;
		int countSeven = 0;
		int countNine = 0;

		for (int i = 0; i < arr.length; i++) {
			Random rnd = new Random();
			int temp = rnd.nextInt(10);

			if (temp % 2 != 0) {
				arr[i] = temp;
				countArraySize++;

				switch (arr[i]) {
				case 1:
					countOne++;
					break;
				case 3:
					countThree++;
					break;
				case 5:
					countFive++;
					break;
				case 7:
					countSeven++;
					break;
				case 9:
					countNine++;
					break;
				default:
					break;
				}
			} else {
				i--;
			}
		}

		System.out.println("Размер массива: " + countArraySize);
		System.out.println("1 - " + countOne + " попаданий");
		System.out.println("3 - " + countThree + " попаданий");
		System.out.println("5 - " + countFive + " попаданий");
		System.out.println("7 - " + countSeven + " попаданий");
		System.out.println("9 - " + countNine + " попаданий");

		System.out.println();
//		for (int a : arr) {
//			System.out.print(" " + a);
//		}
	}
}
