import java.util.Scanner;
public class swapchar {
	public static void main(String at[])
	{
		String adi;
		Scanner sc = new Scanner(System.in);
		adi = sc.nextLine();
		int len = adi.length();
		char ch[] = new char[len];
		char c;
		for(int i=0;i<len;i++)
		{
			ch[i] = adi.charAt(i);
		}
		for(int i=len-1;i>0;i--)
		{
			ch[i] = ch[i-1];
		}
		System.out.print(ch);
	}

}
