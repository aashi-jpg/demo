import java.util.Scanner;
public class Ques1 {
	int[]readArray(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n =sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter element of array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	static int getSecondSmallest(int[]arr) {
		int temp=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[1];
	}
	public static void main(String args[]) {
		Ques1 q=new Ques1();
		int arr[]=q.readArray();
		int a=q.getSecondSmallest(arr);
		System.out.println("Second Smallest element is="+a);
		}
}
