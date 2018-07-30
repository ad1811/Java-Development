import java.util.Scanner;
public class stringpermutation {

	public static void main(String at[])
	{
		String adi;
		Scanner sc = new Scanner(System.in);
		adi = sc.nextLine();
		String a[] = adi.split(" ");
        int len = a.length;
        for(int i=0;i<len;i++)
        {
        	recursion(a[i],a[i].length()-1);
        	System.out.print(" ");
        }
	}
	static void recursion(String adi,int len)
	{
		System.out.print(adi.charAt(len));
		if(len==0)
			return ;
		recursion(adi,len-1);
	}
}
