package homework;

public class hw2 {
	public static void main(String[] args) {
		String[][] table = {
				{"1","2","3"},{"4","5","6"},{"7","8","9"}
		};
		multiplyTable(table);
		
		
	}
	
	static void multiplyTable(String[][] n) {
	
		for(int i =0;i<n.length;i++) {
			for(int j = 0;j<n[i].length;j++) {
				System.out.print(Integer.parseInt(n[i][j])*2);
			}
			System.out.println();
		}
		
	}
}
