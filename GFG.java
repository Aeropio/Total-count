import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	static ArrayList<String> out = new ArrayList<String>();
	 public static void fun(ArrayList<Integer> intArr)
		{
			int count=0;
			for(int i=0;i<intArr.size();i++)
			{
				count = 0;
				for(int j=i+1;j<intArr.size();j++)
				{
					if(intArr.get(i)<intArr.get(j))
					{
						count++;
					}
				

				}
				out.add(Integer.toString(count));
			}
			out.add("\n");
		}
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int numT = Integer.parseInt(scan.nextLine());
		//System.out.println(numT);
		 int tot = 2*numT;
		// System.out.println(tot);
		int sizeArr = 0; 
		int str1=0;
		String str2="";
		int count = 0;
		
		//String str = "";
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		
			 
			 
			 for(int i=0;i<tot;i++)
			 {
			 	if(i%2==0)
			 	{
			 		str1 = Integer.parseInt(scan.nextLine());
			 	}
			 	else
			 	{
			 		str2 = scan.nextLine();
			 		String arr[] = str2.split(" ");
					for(int j=0;j<arr.length;j++)
					{
						intArr.add(Integer.parseInt(arr[j]));
					}
			 		fun(intArr);
			 		intArr.clear();
			 	}
			 }
			 	
			


		 
		 
		
		
			
			
		
		for(String n :out)
		{
			if(n=="\n")
			{
				System.out.print(n);
			}
			else
			System.out.print(n+" ");
		}
		//code
	}
}