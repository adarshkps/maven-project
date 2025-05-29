package newProjectForPractice;

public class asdf {
	public static void main(String[] args) {
		
		String s="madam";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);;
			rev=rev+ch;
		}
		System.out.println(rev);
		if(rev.equals(s))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
