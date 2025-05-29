package newProjectForPractice;

public class newada {
public static void main(String[] args) {
	int num1=123;
	int ori=num1;
	int res=0;
	int rev=0;
	while(num1>0)
	{
		res=num1%10;
		rev=rev*10+res;
		num1=num1/10;
	}
	System.out.println(rev);
}
}
