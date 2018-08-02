import java.util.Scanner;
public class strpalindrome {
	
	public static void main(String at[])
	{
		String adi;
	    Scanner sc = new Scanner(System.in);
	    adi = sc.nextLine();
	    int f=0;
	    int len = adi.length();
	    for(int i=0,j=len-1;i<j;i++,j--)
	    {
	    	if(adi.charAt(i)==adi.charAt(j))
	    	{
	    		f++;
	    	}
	    	
	    }
	    if(f==(len/2)-1||f==(len/2))
	    {
	    	System.out.println("It is Palindrome");
	    }
	    else
	    {
	    	System.out.println("It is not Palindrome");
	    }
		
	}

}
