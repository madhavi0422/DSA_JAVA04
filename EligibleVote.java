import java.util.*;
public class EligibleVote
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    if(a>=18)
	    {
		System.out.println("eligible for vote");
	}
	else{
	    System.out.println("not eligible");
	}
	}
}