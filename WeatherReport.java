import java.util.Scanner;
	
public class WeatherReport
{
	
	public static void main(String[] args) 
		{		
		System.out.println("Hello, please type to the tempature in degrees Fahrenheit.");
		
		Scanner cin = new Scanner(System.in);
		
		
		double temp = cin.nextInt();
		double c = 5*(temp-32)/9;
		double answer =  c;
		
		
		System.out.println(answer);
		
		
		 if(temp<=32)
		 {
			 System.out.println("It is freezing.");
		 }
	
		  if(temp>=90)
		 {
			 System.out.println("It is hot.");
		 }
		   if(temp>=212)
		  {
			  System.out.println("Okay, so yeah you are probably gonna die!");
		  }
		 
		 
	cin.close();
	
	
		}}
	