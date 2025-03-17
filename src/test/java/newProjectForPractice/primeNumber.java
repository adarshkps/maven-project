package newProjectForPractice;

public class primeNumber {
 public static void main(String[] args) {
	int num=10;
	
	for(int i=1;i<num;i++)
	{
		int count=1;
		for (int j=2;j<num;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime number "+i);
		}
	}
	
  }
 
}
