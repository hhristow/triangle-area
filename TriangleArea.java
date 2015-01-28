import java.util.Scanner;


public class TriangleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Ax = scan.nextInt();
		int Ay = scan.nextInt();
		int Bx = scan.nextInt();
		int By = scan.nextInt();
		int Cx = scan.nextInt();
		int Cy = scan.nextInt();
		double Area = 0;
		scan.close();
		Area = (Ax * 1.0 * (By - Cy) + Bx * 1.0 * (Cy - Ay) + Cx * 1.0 * (Ay - By)) / 2;
		Area = Math.abs(Area);
		System.out.println("The area is " + Math.round(Area));
	}

}

asfd