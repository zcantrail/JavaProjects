import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String str = in.next();
        
        int sum = 0;
        
        for(int x = 0; x < str.length(); x++) {
        	char c = str.charAt(x);
        	
        	if((c - '0') %2 == 1) {
        		sum = (c - '0');
        	}
        }
        System.out.println(sum);
	}

}
