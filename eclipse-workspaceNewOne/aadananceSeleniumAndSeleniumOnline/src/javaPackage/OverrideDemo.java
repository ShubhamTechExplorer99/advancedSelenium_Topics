package javaPackage;

class Bank {
	double rio() {  //rate of interst
		return 0;
	}
}

class ICICI extends Bank {
	double roi() {
		return 10.5;
	}
}

class SBI extends Bank {
	double roi() {
		return 11.5;
	}
}

public class OverrideDemo {

	public static void main(String[] args) {

		ICICI ic = new ICICI();
		System.out.println(ic.roi());

		SBI sb = new SBI();
		System.out.println(sb.roi());

	}

}
