package javaPackage;

public class AccountEncapsulationMain {

	public static void main(String[] args) {

		AccountEncapsulation acc = new AccountEncapsulation();
		acc.setAccno(101);
		acc.setName("Shubham");
		acc.setAmount(1000);

		System.out.println(
				"AccountNumber : " + acc.getAccno() + " Name : " + acc.getName() + "Amount :   " + acc.getAmount());

	}

}
