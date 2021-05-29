import java.util.Scanner;

public class Ques5 {
	static int CalSum(int n){
		int i;
		int sum=0;
		for(i=1;i<=n;i++) {
			if(i%3==0||i%5==0) {
				sum+=i;
			}
		}
        return sum;
    }
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter range: ");
	int n=sc.nextInt();
	int CalSum=CalSum(n);
	Ques5 q=new Ques5();
	int sum=q.CalSum(n);
    System.out.println("sum of number is divisible by 3 or 5 is="+sum);
    }
}
    