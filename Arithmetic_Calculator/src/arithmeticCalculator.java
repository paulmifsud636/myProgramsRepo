import java.util.Scanner;

public class arithmeticCalculator 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		try {
			System.out.print("Enter 1st integer: ");
			int x= sc.nextInt();
			System.out.print("Enter 2nd integer: ");
			int y=sc.nextInt();
			sc.nextLine();
			
			System.out.print("Select operator: +, -, *, /: ");
		    String pattern=sc.nextLine();
		   		
			switch(pattern)
				{
					case "+": System.out.println("Sum is "+(x+y));
	                        break;
					case "-": System.out.println("Difference is "+(x-y));
	                        break;
					case "*": System.out.println("Product is "+(x*y));
	                        break;
					case "/": System.out.println("Ratio is "+(x/y));
	                        break;
					default:     System.out.println("Invalid option selection!");
	                        break; 
				}
			}
	     catch (Exception e)
	         {
	        	  System.out.println("Enter only integers !! ");
	         }
	    }
}
	

