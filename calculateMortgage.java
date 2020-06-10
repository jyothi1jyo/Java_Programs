import java.util.Scanner;
import java.text.NumberFormat;

public class Mortgage_Calculator {
	

	public static void main(String[] args) 
	{	
		//final variables
		final byte MONTHS_IN_YEARS = 12;
		final byte PERCENT = 100;
		
		//initialization of variables
		int principal,noOfPayments = 0;
		float monthlyInterest = 0;
		

		// Create a Scanner object
	    Scanner s = new Scanner(System.in);  
	    
	    //principal
	    while(true) {
	    System.out.print("Enter Principal: ");
	    principal = s.nextInt();
	    if (principal>=1000 && principal <=1_000_000)
	    	break;
	    System.out.println("Enter a value in between 1k - 100k");
	    }
	    
	    //Annual Interest Rate
	    while(true) 
	    {
	    	System.out.print("Enter Annual Interest Rate: ");
	    	float annualinterest = s.nextFloat();
	    	if (annualinterest>=1 && annualinterest <=30) {
	    		monthlyInterest = (annualinterest/PERCENT)/MONTHS_IN_YEARS;
	    		break;
	    }    
	    System.out.println("Enter a value in between 1 and 30");
	    }
	    
	    // Period
	    while(true) 
	    {
	    	System.out.print("Enter period(in years): ");
	    	byte years = s.nextByte();
	    	if (years>=1 && years<=30) {
	    		noOfPayments = years * MONTHS_IN_YEARS;
	    		break;
	    	}
	    	System.out.println("Enter a value in between 1 and 30");
	    }
	    
		//Calculation
		double temp = Math.pow((1+monthlyInterest),noOfPayments);
		double mortgage = principal * (monthlyInterest * temp)/(temp - 1);
	    
		//display
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortagage = "+mortgageFormatted);
		}    		
    }
