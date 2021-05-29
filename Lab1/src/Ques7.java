import java.util.Scanner;
public class Ques7 {
	static boolean checkno(int n) {
		while(n>0) {
			int a=n%10;
			n=n/10;
			int b=n%10;
			n=n/10;
			if(a<b) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range:");
		int n=sc.nextInt();
		boolean ans=checkno(n);
		if(ans==true) {
			System.out.println(n+" is increasing number");
			}
		else {
			System.out.println(n+" is not increasing number");	
			}
		}
	}

