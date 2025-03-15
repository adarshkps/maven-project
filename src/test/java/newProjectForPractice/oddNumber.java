package newProjectForPractice;

public class oddNumber {
	public static void main(String[] args) {
		int num1 = 100;
		for (int i = 1; i < num1; i++) {
			if (i % 2 != 0) {
				System.out.println("odd ->" + i);
			} else {
				System.out.println("even ->" + i);
			}

		}
	}

}
