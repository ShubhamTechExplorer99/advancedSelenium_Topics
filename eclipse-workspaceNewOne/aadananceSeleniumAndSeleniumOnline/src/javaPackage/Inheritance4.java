package javaPackage;

public class Inheritance4 extends Inheritance3 {
	
	public void multiple(int x,int y) {
		z = x * y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		
		int x = 20; 
		int y =10;
		
		Inheritance4 i4 = new Inheritance4();
		i4.add(x, y); //30
		i4.subtract(20, 15); //5
		i4.multiple(x, y); //200
		
	}

	

}
