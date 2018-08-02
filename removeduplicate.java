import java.util.Scanner;
public class removeduplicate {

	public static void main(String at[])
	{
		Scanner sc = new Scanner(System.in);
		String adi;
		adi = sc.nextLine();
		int len = adi.length();
		int c = 0,f = 0;
		char ch[] = new char[len];
		for(int i=0;i<len;i++)
		{
			f = 0;
			for(int j=0;j<len;j++)
			{
				if(i!=j)
				{
					if(adi.charAt(i)==adi.charAt(j))
					{
						f++;
					}
				}
			}
			if(f==0)
			{
				ch[c] = adi.charAt(i);
				c++;
			}
		}
		System.out.println(ch);
	}
}
