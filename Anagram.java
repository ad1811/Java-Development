import java.util.Scanner;
public class Anagram {

	public static void main(String at[])
	{
		String a;
		String b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		b = sc.nextLine();
		int alen = a.length();
		int blen = b.length();
		int f=0,c=0;
		if(alen==blen)
		{
			for(int i=0;i<alen;i++)
			{
				for(int j=0;j<blen;j++)
				{
					if(a.charAt(i)==b.charAt(j))
					{
						f++;
					}
				}
				if(f>0)
				{
					c++;
				}
			}
			if(c==alen)
			{
				System.out.println("Strings are anagram");
			}
			else
			{
				System.out.println("Strings are not anagram");
			}
		}
		else
		{
			System.out.println("Strings are not anagram");
		}
	}
}
