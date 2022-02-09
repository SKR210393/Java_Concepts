package Com.New;

public class LoopTringle {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 3; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = 1; i < 6; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}

		for (int i = 1; i < 6; i++) {

			for (int j = 5; j >= i; j--) {
				System.out.print("# ");
			}
			System.out.println();
		}

		for (int i = 1; i < 6; i++) {

			for (int j = 5; j >= i; j--) {
				System.out.print(j + " ");

			}
			System.out.println();
		}

		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = 1; i < 7; i++) {

			for (int j = 1; j < 7; j++) {
				System.out.print("1" + " ");
			}
			System.out.println();
		}
	}

}
