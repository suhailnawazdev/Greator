import java.util.Scanner;



class Greator
{

	public static void main(String args[])
	
	{
		
  int num1,num2;
  
  Scanner s = new Scanner(System.in);
  
  System.out.println("Enter the num");
  
  num1 = s.nextInt();
  num2= s.nextInt();
  
  if(num1>num2)
	  
System.out.println("Num1 is greator than Num2");
  
  else

	  System.out.println("Num1 is smaller than Num2");
  
	}
}
  