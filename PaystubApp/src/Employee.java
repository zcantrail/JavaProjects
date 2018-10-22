import java.util.Scanner;

/**
 * @author Zac
 *
 */

public class Employee {

	/**
	 * Employee class 
	 */
	Scanner input = new Scanner(System.in);
	String firstName; // Employees first name
	String lastName; // Employees last name
	double payRate; // Employees pay rate
	double hoursWorked; // How many hours the employee has worked.
	private double Pay; // The amount the Employee got paid.
	public Employee() { // default constructor with default values
		
		firstName = "John";
		lastName = "Doe";
		payRate = 8.00;
	}
	
	public Employee(String fName, String lName, double pRate) { // constructor with all values set through input
		
		firstName = fName;
		lastName = lName;
		payRate = pRate;
	}
	
	public void setFirstName () { // Set first name
		
		System.out.println("Please enter the employee's first name.");
		firstName = input.next();
	}
	
	public void setLastName() { // Set last name
		
		System.out.println("Please enter the employee's last name.");
		lastName = input.next();
	}
	
	public void setPayRate () { // set pay rate
		
		System.out.println("Please enter the employee's pay rate.");
		payRate = input.nextDouble();
	}
	
	public void setHoursWorked() {
		
		System.out.println("Please Enter the number of hour " + firstName + " has woked in this pay period.");
		hoursWorked = input.nextDouble();
	}
	
	public void calculatePay () {
		
		if (hoursWorked <= 40)
			Pay = payRate * hoursWorked;
		else
			Pay = 40 * payRate;
			Pay += (hoursWorked - 40) * (payRate * 1.5);			
	}
	
	public void PayCheck () { // calculate the pay check
		
		System.out.println("Employee: " + firstName + lastName);
		System.out.println("Pay rate: " + payRate);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Has earned " + Pay);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee mike = new Employee();
		mike.setFirstName();
		mike.setLastName();
		mike.setPayRate();
		mike.setHoursWorked();
		mike.calculatePay();
		mike.PayCheck();

	}
}
