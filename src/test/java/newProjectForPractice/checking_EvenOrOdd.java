package newProjectForPractice;

import java.util.Scanner;

public class checking_EvenOrOdd {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n%2==0)
	{
		System.out.println("even "+n);
	}
	else
	{
		System.out.println("odd "+n);
	}
}
}
