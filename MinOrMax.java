import java.util.Scanner;

public class MinOrMax
{
    public static void main(String[] args) 
    {
		// TODO Auto-generated method stub

    	Scanner bablu = new Scanner(System.in);
        System.out.println("Enter the minimum limit");
        int x = bablu.nextInt();
        Scanner taj = new Scanner(System.in);
        System.out.println("Enter the maximum  limit");
        int n = taj.nextInt();

		for( x=0 ; x <n; x = x+1)
		{
			if(x%2 == 0) 
			{
				System.out.println(x);
			}
			else
			{
				System.out.println(x++);
			}
		}
    }
 }

