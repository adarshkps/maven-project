package newProjectForPractice;

public class reversingNumber {
	public static void main(String[] args) {
		int num1=122394;
		int ori=num1;
		int rev=0;
		int res=0;
		
		while(num1>0)
		{
		res=num1%10;
		rev=rev*10+res;
		num1=num1/10;

		}
		
		System.out.println(rev);
		
	}
	
	
	

}
