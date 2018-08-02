import java.util.Scanner;
public class HighestOccurence {

	public static void main(String at[])
	{
		String adi;
		Scanner sc = new Scanner(System.in);
		adi = sc.nextLine();
		int i = 0,f=0;
		int ch[] = new int[2];
		while(i<adi.length())
		{
			f = 0;
			for(int j=i+1;j<adi.length();j++)
			{
				if(adi.charAt(i)==adi.charAt(j))
					f++;
			}
			if(f>ch[0])
			{
				ch[0] = f;
				ch[1] = i;
			}
			i++;
		}
		System.out.println(adi.charAt(ch[1]));
	}
}
