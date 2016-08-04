import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static ArrayList<String> out = new ArrayList<String>();
	 
	public static void fun(ArrayList<Integer> intArr,int num)
	{
		int k = 0;
		int count = 0;
		for(Integer n:intArr)
		{
			k = n/num;
			if(n%num==0)
			{
				
				count+=k;
			}
			else
			{
				count=count+k+1;
			}
		}
		out.add(count+"\n");

	}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int numT = Integer.parseInt(scan.nextLine());
		//System.out.println(numT);
		 int tot = 2*numT;
		// System.out.println(tot);
		int sizeArr = 0; 
		String str1="";
		String str2="";
		int count = 0;
		
		//String str = "";
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		int divNum = 0;
			 
			 
			 for(int i=0;i<tot;i++)
			 {
			 	if(i%2==0)
			 	{
			 		str1 = scan.nextLine();
			 		String splt[] = str1.split(" ");
			 		divNum = Integer.parseInt(splt[1]);

			 	}
			 	else
			 	{
			 		str2 = scan.nextLine();
			 		String arr[] = str2.split(" ");
					for(int j=0;j<arr.length;j++)
					{
						intArr.add(Integer.parseInt(arr[j]));
					}
			 		fun(intArr,divNum);
			 		intArr.clear();
			 	}
			 }
			 	
			


		 
		 
		
		
			
			
		
		for(String n :out)
		{
			// if(n=="\n")
			// {
			// 	System.out.print(n);
			// }
			// else
			System.out.print(n);
		}
		//code
	}
}