//Write a program which accept number from user and return the count of digits in between 3 and 7.

//Input : 2395
//Output : 1

//Input : 1018
//Output : 0

//Input : 4521
//Output : 2

//Input : 9922
//Output : 0

import java.util.*;

class Digit
{
	public int CountDigits(int iNo)
	{
		int Count=0,iDigit=0;
		
		if(iNo<0)
		{
			iNo=-iNo;	//updater
		}
		
		while(iNo>0)
		{
			iDigit=iNo%10;
			
			if((iDigit>3)&&(iDigit<7))
			{
				Count++;
			}
			iNo=iNo/10;
			
		}
		return Count;
		
	}
}
class Demo2
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int No=sobj.nextInt();
		
		Digit dobj=new Digit();
		
		int iRet=dobj.CountDigits(No);
		
		System.out.println("The Count between 3 & 7 is: "+iRet);
		
	}
}







