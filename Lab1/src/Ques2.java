import java.util.Scanner;
public class Ques2 {
	public static void main(String args[]) {
		System.out.println("Enter s=");
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    switch(s) {
	    case "red":
	    	System.out.println("Stop");
	    	break;
	    case "yellow":
	    	System.out.println("Ready");
	    	break;
	    case "green":
	    	System.out.println("Go");
	    	break;
	    default:
	    	System.out.println("Wrong choice");
	    	break;
	    }
	}

}
