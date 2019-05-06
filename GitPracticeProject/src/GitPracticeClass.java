import java.util.Scanner;

public class GitPracticeClass {
//	public static void main(String[] args) {
//		average();
//	}
	
	public static void average() {
		System..println("Enter five numbers:");
		Scanner s = new Scanner(System.in);
		
		int num1 = Integer.parseInt(s.next());
		 num2 = Integer.parseInt(s.next());
		int num3 = Integer.parseInt(s.next());
		int num4 = Integer.parseInt(s.next());
		int num5 = Integer.parsInt(s.next());
		
		System.out.println("\nAverage:");
		System.out.println((num1 + num2 + nu + num4 + num5) / 5);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type one integer");
		int a = s.nextInt();
		System.out.println("Type another integer");		
		int b = s.nextInt();
		int avg = (a + b) / 2; 
		System.out.println("This is the average of the two numbers: " + avg);
	}
	
}
