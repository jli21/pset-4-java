import java.util.Scanner;
public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%-12s: ", "Temperature");
		double temperature = sc.nextDouble();
		System.out.printf("%-12s: ", "Wind Speed");
		double speed = sc.nextDouble();
		
		double chill = 35.74 + 0.6215*temperature + (0.4275*temperature - 35.75)*Math.pow(speed, 0.16);
		
		System.out.printf("%n%-12s: %,.2f", "Wind chill", chill);
	}
}
