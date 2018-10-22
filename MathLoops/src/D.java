import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a scanner instance to gather input
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int a = in.nextInt();
        System.out.println("Please enter a second integer");
        int b = in.nextInt();

        // Loop through all numbers
        int sum = 0;
        for (int x = a; x<=b; x++) {
        	sum += x;
	}
        System.out.println(sum);
	}
}
