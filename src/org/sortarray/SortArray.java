package org.sortarray;

public class SortArray {

	public static void main(String[] args) {

		int a[] = { 6, 5, 7, 9, 8, 4, 3, 0, 2, 13, 22, 343, 45, 67, 98, 2222 };
		int temp;

		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length - 1; i++) {

				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;

				}

			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
	}

}