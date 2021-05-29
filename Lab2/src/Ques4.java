import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class Ques4 {
	public static int remove_duplicate_elements(int arr[], int n)
	{
	if (n==0 || n==1)
	return n;
	int temp[] = new int[n];
	int j = 0;
	int i;
	for (i=0; i<n-1; i++)
	 if (arr[i] != arr[i+1])
	   temp[j++] = arr[i];
	   temp[j++] = arr[n-1];
   for (i=0; i<j; i++)
	arr[i] = temp[i];
	return j;
	}

	public static void main(String[] args)
	{
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter no. of elements you want in array:");
	n = sc.nextInt();
	int a[] = new int[n+1];
	System.out.println("Enter all the elements:");

	for(int i = 0; i < n; i++)
	{
	a[i] = sc.nextInt();
	}
    for(int i=0;i<n;i++)
    {
    	for(int j=0;j<n-i-1;++j)
    	{
    		if(a[j]<a[j+1])
    		{
    			int temp = a[j];
    			a[j] = a[j+1];
    			a[j+1] = temp;
    		}
    	}
    }
	n = remove_duplicate_elements(a, n);
	
	System.out.print("Array after removing and sorted in descending : ");
	for (int i=0; i<n; i++)
	System.out.print(a[i] + " ");

	}
}

