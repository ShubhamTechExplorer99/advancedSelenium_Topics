package accessModifierCheck;

import java.util.Scanner;

public class XoxoDay {
	
	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text :  ");
		
		String originalText=sc.nextLine();
		String reversed = "";
		
		for(int  i = originalText.length()-1;i>=0;i--) {
			reversed +=originalText.charAt(i);
		}
		if(originalText.equalsIgnoreCase(reversed)){
			System.out.println("That is palendron");
		}
		else {
			System.out.println("That is not a pelendron ");
		}
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the int :  ");
	
		//sc.nextLine();
		
		String input= sc.nextLine();
		
		String[] number= input.split("");
		int sum =0;
		
		for(String num : number) {
			
		sum += Integer.parseInt(num);
		}
		System.out.println("The addiion of the value : "+sum);
		
		
		
	}

}
