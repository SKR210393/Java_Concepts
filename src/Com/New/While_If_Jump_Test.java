package Com.New;

public class While_If_Jump_Test {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		int n = 10;
		do {
			System.out.println(n);
			n--;
		} while (n >= 1);

		// Selection statement
		// If statement

		for (int j = 1; j < 11; j++) {
			if (j == 9) {
				System.out.println(j + " IF value");
			}

			// Else if Statement

			else if (j == 7) {
				System.out.println(j + " ElseIF Value");
			}

			// else used to print the rest of value in for loop
			else {
				System.out.println(j);
			}

		}

		// Jumping Statement
		// Break used the to print the J value that mentioned in the If statement but
		// the J.

		for (int j = 1; j < 11; j++) {
			if (j == 5) {
				break;
			}
			System.out.println(j);
		}

		// continue used to skip the j value mentioned in the If statement

		for (int j = 1; j < 11; j++) {
			if (j == 7) {
				continue;
			}
			System.out.println(j);
		}
		
	}
}
