import java.util.Scanner;
public class Ques3 {
	 static int factorial(int n){   
		    if (n == 0)   
		        return 1;   
		    else   
		       return(n * factorial(n-1));   
		  }   
		  public static void main(String args[]) {
		     System.out.println("Enter no=");
		     Scanner sc=new Scanner(System.in);
		     int n=sc.nextInt();
		     int fact = 1;
		     fact = factorial(n);  
		     System.out.println("Factorial of "+n+" is : "+fact);   
		  }
}
