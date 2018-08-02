import java.util.Scanner;
public class NegPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    int b[] = new int[n];
	    int c[] = new int[n];
	    int k=0,z=0;
	    for(int i=0;i<n;i++)
	    {
	    	arr[i] = sc.nextInt();
	    	if(arr[i]<0)
	    	{
	    		b[k] = arr[i];
	    		k++;
	    	}
	    	else
	    	{
	    		c[z] = arr[i];
	    		z++;
	    	}
	    	
	    }
	    for(int i=0,j=0;j<z;j++)
	    {
	    	if(i<k)
	    	{
	    	   System.out.println(b[i]);
	    	   i++;
	    	}
	    	System.out.println(c[j]);
	    }
	    
	    

	}

}
