import java.util.Random;
public class keypad {

	
	public static void main(String at[])
	{
		char c[] = new char[26];
		char d = 'A';
		Random rand = new Random();
		int  n = rand.nextInt(27) + 1;
		
		System.out.println("Number Generated: "+n);
		for(int i=0;i<26;i++)
		{
			c[i] =  d;
			d++;
		}
		System.out.println("Converted Letter: "+c[n-1]);
		if(n-1<3)
		{
			System.out.println("Keypad Number: 2");
		}
		else if(n-1>2&&n-1<6)
		{
			System.out.println("Keypad Number: 3");
		}
		else if(n-1>5&&n-1<9)
		{
			System.out.println("Keypad Number: 4");
		}
		else if(n-1>8&&n-1<12)
		{
			System.out.println("Keypad Number: 5");
		}
		else if(n-1>11&&n-1<15)
		{
			System.out.println("Keypad Number: 6");
		}
		else if(n-1>14&&n-1<19)
		{
			System.out.println("Keypad Number: 7");
		}
		else if(n-1>18&&n-1<22)
		{
			System.out.println("Keypad Number: 8");
		}
		else if(n-1>21&&n-1<26)
		{
			System.out.println("Keypad Number: 9");
		}
		
		
	}
	
}
