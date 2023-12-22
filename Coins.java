/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
    public static void main(String args[]) {
        int UserCents = Integer.parseInt(args[0]);
		int TotalQuarters = UserCents / 25;
		int RemainCents = UserCents - (TotalQuarters * 25);
		System.out.println("Use " + TotalQuarters + " quarters and " + RemainCents + " cents");
	
    }
}