package homework;

public class hw5 {
	public static void main(String[] args) {
		draw25(3);
	}

	static void draw18(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= n; j++) {
				if (j >= i) {
					System.out.print("*");
					continue;
				}
				System.out.print("-");
			}
			System.out.println();
		}

	}

	static void draw19(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = n; j > 0; j--) {
				if (j <= i) {
					System.out.print("*");
					continue;
				}
				System.out.print("-");
			}
			System.out.println();
		}

	}

	static void draw20(int n) {
		for (int i = 0; i < (n * 2 - 1); i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (j <= i && i < n) {
					System.out.print("*");
					continue;
				} else if (i >= n && j < (n - (i - n) - 1)) {
					System.out.print("*");
					continue;
				}
				System.out.print("-");
			}
			System.out.println();
		}

	}

	static void draw21(int n) {
		int count = 1;
		for (int i = 0; i < (n * 2 - 1); i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (j <= i && i < n) {

					System.out.print(count);
					count++;
					continue;
				} else if (i >= n && j < (n - (i - n) - 1)) {
					System.out.print(count);
					count++;
					continue;
				}
				System.out.print("-");
			}
			System.out.println();
		}

	}

	static void draw22(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2 - 1; j++) {
				if (j > n - i && j < n + i) {
					System.out.print("*");
					continue;
				}
				System.out.print("-");
			}
			System.out.println();
		}

	}

	static void draw23(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= n * 2 - 1; j++) {
				if (j > n - i && j < n + i) {
					System.out.print("*");
					continue;
				}
				System.out.print("-");
			}
			System.out.println();
		}

	}

	static void draw24(int n) {

		for (int i = 1; i <= n * 2 - 1; i++) {
			int count = 1;
			for (int j = 1; j <= n * 2 - 1; j++) {

				if (j > n - i && j < n + i && i <= n) {
					System.out.print("*");
					continue;
				} else if (j > i - n && j <= (n * 2 - 2) + count && i > n) {
					System.out.print("*");
					continue;
				}
				count--;
				System.out.print("-");
			}

			System.out.println();
		}

	}

	static void draw25(int n) {
		int mew = 1;
		for (int i = 1; i <= n * 2 - 1; i++) {
			int count = 1;
			for (int j = 1; j <= n * 2 - 1; j++) {

				if (j > n - i && j < n + i && i <= n) {
					System.out.print(mew++);
					
					continue;
				} else if (j > i - n && j <= (n * 2 - 2) + count && i > n) {
					System.out.print(mew++);
					continue;
				}
				count--;
				System.out.print("-");
			}

			System.out.println();
		}

	}
}
