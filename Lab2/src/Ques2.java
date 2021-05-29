import java.util.*;
public class Ques2 {
	static String[] sortString(String str[]) {
		Arrays.sort(str);
		int len=str.length-1;
		if(str.length%2==0) {
			for(int i=0;i<len/2;i++) {
				str[i]=str[i].toUpperCase();
				}
			for(int i=len/2;i<len;i++) {
				str[i]=str[i].toLowerCase();
				}
		}
		else if(str.length%2!=0) {
			for(int i=0;i<(len/2)+1;i++) {
				str[i]=str[i].toUpperCase();
			}
			for(int i=len/2;i<len;i++) {
				str[i]=str[i].toLowerCase();
				}
		}
		return str;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Element=");
		int n=sc.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.nextLine();
		}
		String[] s=sortString(str);
		for(String item:s) {
			System.out.print(item);
		}
	}

}
