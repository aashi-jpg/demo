import java.util.Scanner;
public class Ques6 {
	static int CalDiff(int n) {
		int i;
		int a=0,b=0;
		for(i=1;i<n;i++) {
			b=(n*(n+1)*(2*n+1))/6;
		}
		for(i=1;i<=n;i++) {
			a=(n*(n+1))/2;
			a=a*a;
		}
		int sum=Math.abs(a-b);
		return sum;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range:");
		int n=sc.nextInt();
		int CalDiff=CalDiff(n);
		Ques6 q=new Ques6();
		int sum=q.CalDiff(n);
		System.out.println("Answer:"+sum);
		}

}
