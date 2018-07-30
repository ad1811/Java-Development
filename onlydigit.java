import java.util.Scanner;
public class onlydigit {

	public static void main(String at[])
	{
		String adi;
		Scanner sc = new Scanner(System.in);
		adi = sc.nextLine();
		int len = adi.length();
		int f=0;
		for(int i=0;i<len;i++)
		{
			if(adi.charAt(i)>='0'&&adi.charAt(i)<='9')
			{
				f++;
			}
		}
		if(f==len)
		{
			System.out.println("Yes it only has digits");
		}
		else
		{
			System.out.println("no it does not only has digits");
		}
	}
}
