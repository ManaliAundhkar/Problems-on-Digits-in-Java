//Write a program which accept number from user and return difference between summation of even digits and summation of odd digits.

//Input : 2395
//Output : -15 (2 - 17)

//Input : 1018
//Output : 6 (8 - 2)

//Input : 8440
//Output : 16 (16 - 0)

//Input : 5733
//Output : -18 (0 - 18)

import java.util.*;

class Digit
{
	public int DiffDigits(int iNo)
	{
		int iEven=0,iDigit=0,iOdd=0;
		
		if(iNo<0)
		{
			iNo=-iNo;	//updater
		}
		
		while(iNo>0)
		{
			iDigit=iNo%10;
			
			if((iDigit%2)==0)
			{
				iEven=iEven+iDigit;
			}
			else
			{
				iOdd=iOdd+iDigit;
			}
			iNo=iNo/10;
			
		}
		return (iEven-iOdd);
		
	}
}
class Demo4
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int No=sobj.nextInt();
		
		Digit dobj=new Digit();
		
		int iRet=dobj.DiffDigits(No);
		
		System.out.println("The Difference between Even count and Odd count is: "+iRet);
		
	}
}







