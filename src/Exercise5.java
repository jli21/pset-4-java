import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%-14s: ", "Diameter");
		double diameter = sc.nextDouble();
		double area =  diameter * diameter * 0.5 * 0.5 * 3.1415;
		double circumference = (diameter * 3.1415);
		
		System.out.printf("%n%-14s: %,.2f", "Area", area);
		System.out.printf("%n%-14s: %,.2f", "Circumference", circumference);
	}
}
