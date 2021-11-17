import java.util.Scanner;

public class OddNumbers  
{  
    public static void main(String args[])   
    {  
    	Scanner sha = new Scanner(System.in);
		System.out.println("Enter the minimum range ");
		
    	for (int  x=1,n=200; x<=n; x=x+1)   
        {  
         if(x %2!=0)   
         {  
         System.out.print(x + " ");  
         }  
       }  
     }  
} 
