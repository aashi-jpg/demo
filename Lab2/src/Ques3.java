
import java.util.Arrays;
import java.util.Scanner;
public class Ques3 {
	static void getSorted(int arr[]) {
		for(int i=0;i<arr.length/2;i++) {
			int b=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=b;
		}
		int brr[]=new int[arr.length];
		System.out.println("Reverse Elements are=");
		for(int i=0;i<arr.length;i++) {
			brr[i]=arr[i];
		}
		for(int item:brr) {
			System.out.print(item);
		}
		System.out.println();
		System.out.println("Sorted Reversed Element=");
		Arrays.sort(brr);
		for(int item:brr) {
			System.out.print(item);
		}
	}
	public static void main(String args[]) {
		Ques3 q=new Ques3();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Element=");
		int n=sc.nextInt();
		System.out.println("Enter Element=");
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		q.getSorted(arr);
	}
}
