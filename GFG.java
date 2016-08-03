import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static Boolean isPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		return false;
	}
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = Integer.parseInt(scan.nextLine());
	    System.out.println("number of nums is "+num);
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int i=0;i<num;i++)
	    {
	        list.add(Integer.parseInt(scan.nextLine()));
	    }
	    for(Integer n:list)
	    {
	    	System.out.println("the numbers are "+n);
	    }
		//code
		//int sum = 0;
		ArrayList<Integer> out = new ArrayList<Integer>();
		int sum=0;
		String o = "";
		for(Integer n:list)
		{
			System.out.println("inside for loop  "+n);
			 sum = 0;
		    
		   
			 o = Integer.toString(n);
			 String arr[] = o.split("");
			 for(int i=0;i<arr.length;i++)
			 {
			 	if(isPrime(Integer.parseInt(arr[i])))
			 	{
			 		sum=sum+Integer.parseInt(arr[i]);
			 	}
			 }
			 out.add(sum);

		}
		for(Integer n :out)
		{
		    System.out.println(n);
		}
	}
}