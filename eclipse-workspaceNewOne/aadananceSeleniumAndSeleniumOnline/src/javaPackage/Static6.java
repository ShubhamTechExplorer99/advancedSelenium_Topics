package javaPackage;

public class Static6 {
	
	int x = 10; //global variable
	static int y = 5; //static variable
	
	
	//Non static method
	public void a() {
		int z = 10;
		System.out.println(z);
	}
	
	static int b = 6;  //static variable
	
	//static method
	public static  void b() {
		int a = 5;
		System.out.println(a);
	}
	
		public static void main(String[] args) {
			
			Static6 s6 = new Static6();
			s6.a();//10
			System.out.println(s6.b); //6 -Not appropriate way
			System.out.println(Static6.b);//6-Not appropriate way  for same class
			System.out.println(b); //6-correct way
			b();//5
			System.out.println(s6.x);//10
			System.out.println(y);//5
			
			
		}

}
