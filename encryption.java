import java.util.Scanner;
import java.util.Random;
public class encryption {

	String gp;
	String fb;
	static Scanner sc = new Scanner(System.in);
	public static void main(String at[])
	{
		encryption obj = new encryption();
		obj.gp = sc.next();
		Random rand = new Random();
		int  n = rand.nextInt(1000) + 1;
		int len = obj.gp.length();
		char a[] = new char[len];
		for(int i=0;i<len;i++)
		{
			a[i] = obj.gp.charAt(i);
			
		}
		
		for(int i=0;i<len;i++)
		{
			a[i] = (char) (a[i] + n);
			
		}
		int z=0;
		obj.fb = sc.next();
		int lenfb = obj.fb.length();
		char b[] = new char[lenfb];
		for(int i=0;i<lenfb;i++)
		{
			b[i] = obj.fb.charAt(i);
		}
		if(len==lenfb)
		{
		for(int i=0;i<len;i++)
		{
			a[i] = (char) (a[i] - n);
			
		}
		for(int i=0;i<len;i++)
		{
			if(a[i]==b[i])
			{
				z++;
			}
		}
		
		if(z==len)
		{
			System.out.println("Password is Matched");
		}
		else
		{
			System.out.println("Password is not matched length");
			System.out.println(a);
			System.out.println(b);
		}
		}
		else
		{
			System.out.println("Password is not matched");
		}
		
	}
}
