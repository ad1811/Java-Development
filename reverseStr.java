import java.util.Scanner;
public class reverseStr {

	static int len;
	public static void main(String at[])
	{
	String adi;
	Scanner sc = new Scanner(System.in);
	adi = sc.nextLine();
	len = adi.length();
	
	for(int i=len-1;i>=0;i--)
	{
		System.out.print(adi.charAt(i));
	}
	System.out.println();
	recursion(adi,len-1);
	
	
	}
	
	static void recursion(String adi,int len)
	{
		System.out.print(adi.charAt(len));
		if(len==0)
			return ;
		recursion(adi,len-1);
		
	}
}
