import java.util.Scanner;

public class Ques1 {
	public static void main(String args[]) {
		System.out.println("Enter a no=");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			int r=n%10;
			sum+=r*r*r;
			n/=10;
		}
		System.out.println("Sum is="+sum);
	}
}
