package newProjectForPractice;

public class ergae {
public static void main(String[] args) {
	int n = 1000;

	for (int i = 1; i < n; i++) 
	{
		int count = 1;
		for (int j = 2; j <= i; j++) 
		{
			if (i % j == 0) 
			{
				count++;
				System.out.println(j);
		    }
		

		}
	
	}
}
}
