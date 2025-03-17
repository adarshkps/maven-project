package newProjectForPractice;

public class reversing_given_number {
	public static void main(String[] args) {
		int num1 = 123454321;
		int ori = num1;
		int rev = 0;
		int res = 0;
		while (num1>0)
		{
			res = num1%10;
			rev = rev*10+res;
			num1=num1/10;
		}
		System.out.println(rev);
		if(ori==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
