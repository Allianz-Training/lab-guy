package homework;


public class hw3 {
	public static void main(String[] args) {
		draw14(4);
	}
	
	static void draw9(int n) {
		for(int i =0;i<n;i++) {
			System.out.println(i*2);
		}
	}
	
	static void draw10(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i*2);
		}
	}
	
	static void draw11(int n) {
		for(int i=1;i<=n;i++) {
			int count = 1;
			for(int j = 0;j<n;j++) {
				System.out.print(i*count);
				count++;
			}
			System.out.println();
		}
	}
	
	static void draw12(int n) {
		for (int i = 0;i<n;i++) {
			for(int j =0;j<n;j++) {
				if(j == i) {
					System.out.print("-");
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void draw13(int n) {
		for (int i = n;i>0;i--) {
			for(int j =1;j<=n;j++) {
				if(j == i) {
					System.out.print("-");
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void draw14(int n) {
		for (int i = 0;i<n;i++) {
			for(int j =0;j<n;j++) {
				if(j <= i) {
					System.out.print("*");
					continue;
				}
				System.out.print("-");
			}
			System.out.println();
		}
		
	}
	
	static void draw15(int n) {
		for (int i = n;i>0;i--) {
			for(int j =0;j<n;j++) {
				if(j>=i) {
					System.out.print("-");
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void draw16(int n) {
		for (int i = 0;i<(n*2-1);i++) {
			for(int j =0;j<n;j++) {
				if(j<=i && i <n) {
					System.out.print("*");
					continue;
				}
				else if (i>=n && j<(n-(i-n)-1)){	
					System.out.print("*");
					continue;
					}
				System.out.print("-");
			}
			System.out.println();
		}
		
	}
	
	static void draw17(int n) {
		for (int i = 0;i<(n*2-1);i++) {
			for(int j =0;j<n;j++) {
				if(j<=i && i <n) {
					System.out.print(i+1);
					continue;
				}
				else if (i>=n && j<(n-(i-n)-1)){	
					System.out.print(n-(i-n+1));
					continue;
					}
				System.out.print("-");
			}
			System.out.println();
		}
		
	}
	
	
	

}
