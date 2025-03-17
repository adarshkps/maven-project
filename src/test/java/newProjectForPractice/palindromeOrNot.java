package newProjectForPractice;

import java.util.Scanner;

public class palindromeOrNot {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s1="madam";
		System.out.println(s1);
		String[] s2=s1.split("");
		for(String str:s2)
		{
//			System.out.print(str);
			for(int i=str.length()-1;i>=0;i--)
			{
				System.out.println(str.charAt(i));
			}
			System.out.print("");
		}
		
		
		
		
		
		
		
		
		
	}

}
