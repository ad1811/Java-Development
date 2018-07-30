import java.util.Scanner;
public class CountString {

	public static void main(String at[])
	{
		String adi;
		int f=0;
		Scanner sc = new Scanner(System.in);
		adi = sc.nextLine();
		int len = adi.length();
		char ch[] = new char[len];

		for(int i=0;i<len;i++)
		{
			ch[i] = adi.charAt(i);
		}
		for(int i=0;i<len;i++)
		{
			f = 0;
			for(int j=i+1;j<len;j++)
			{
				if(ch[i]==ch[j])
					f++;
			}
			if(f==1)
			{
				System.out.println(ch[i]+" = "+f);
			}
		}
	}
}
