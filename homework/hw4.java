package homework;

import java.util.Scanner;

public class hw4 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Input your number from 1 to 12 : ");
			int n = sc.nextInt();
			for(int i = 1 ;i<=12;i++) {
				System.out.println(n+"X"+i+" = "+(n*i));
			}
			sc.close();
		}
}
