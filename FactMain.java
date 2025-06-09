import java.util.*;
class FactMain
{
	public static long factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return(n*factorial(n-1));
		}
	}

	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n term: ");
		n=sc.nextInt();
		long f=factorial(n);
		System.out.println("Factorial= "+f);
	}
}