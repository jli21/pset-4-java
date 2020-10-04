import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%-13s: ", "Length");
		double length = sc.nextDouble();
		System.out.printf("%-13s: ", "Width");
		double width = sc.nextDouble();
		System.out.printf("%-13s: ", "Diameter");
		double diameter = sc.nextDouble();
		
		double area = (length*width) - (0.5*0.5*diameter*diameter*3.1415);
		System.out.printf("%n%-13s: %,.2f", "Surface Area", area);

	}
}
