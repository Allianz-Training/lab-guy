public class lab11 {
		public static void main(String [] args) {
			lab11Return();
			lab11NotReturn();
		}
		
		public static String lab11Return(int temp) {
			  return "This is Return Value : " + temp;
			 }

		public static void lab11NotReturn() {
			  System.out.println("This is internal method PrintOut");
			 }