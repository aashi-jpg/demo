import java.util.Scanner;
public class Ques8 {
	static boolean checkno(int n) {
		while(n%2==0) {
			n=n/2;
			}
		if(n==1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		int n=sc.nextInt();
		boolean ans=checkno(n);
		if(ans==true) {
			System.out.println(n+" is power of 2");
			}
		else {
			System.out.println(n+" is not power of 2");	
			}
		}
}
