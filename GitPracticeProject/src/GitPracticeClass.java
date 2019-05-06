import java.util.Scanner;

public class GitPracticeClass {
	public static void main(String[] args) {
		average();
	}
	
	public static void average() {
		System.out.println("Enter five numbers:");
		Scanner s = new Scanner(System.in);
		
		int num1 = Integer.parseInt(s.next());
		int num2 = Integer.parseInt(s.next());
		int num3 = Integer.parseInt(s.next());
		int num4 = Integer.parseInt(s.next());
		int num5 = Integer.parseInt(s.next());
		
		System.out.println("\nAverage:");
		System.out.println((num1 + num2 + num3 + num4 + num5) / 5);
	}
	
}
