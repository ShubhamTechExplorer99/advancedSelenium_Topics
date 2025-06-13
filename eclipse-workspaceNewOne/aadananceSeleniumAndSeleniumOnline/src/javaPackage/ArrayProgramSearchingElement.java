package javaPackage;

public class ArrayProgramSearchingElement {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		int searchElement = 100;

		boolean status = false; // true = found and false = not found

		for (int se : a) {
			if (se == searchElement) {

				System.out.println("Elemet is found");
				status = true;
				break;
			}
		}
		if (status == false) {
			System.out.println("Element Not found");
		}

	}

}
