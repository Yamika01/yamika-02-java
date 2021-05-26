package practiceprograms;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Matches
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int matches[]={6,2,5,5,4,5,6,3,7,6};
		int t=sc.nextInt();
		int c; 
		for(int i=0;i<t;i++)
		{
		    int a= sc.nextInt();
		    int b=sc.nextInt();
		    c=a+b;
		    int total=0;
		    while(c>0)
		    {
		        
		        total=total+matches[c%10];
		        c=c/10;
		    }
		    System.out.println(total);
		    total=0;
		}
	}
}
