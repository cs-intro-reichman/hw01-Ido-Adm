/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		boolean option1 = (a + b > c);
		boolean option2 = (a + c > b);
		boolean option3 = (c + b > a);
		boolean isTriangle;
		isTriangle = option1 && option2 && option3;
		System.out.println (a + ", " + b + ", " + c + ": " + isTriangle);
		}
}
