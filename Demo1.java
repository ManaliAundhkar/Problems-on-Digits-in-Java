//Write a program which accept number from user and return the count of odd digits.

//Input : 2395
//Output : 3

//Input : 1018
//Output : 2

//Input : -1018
//Output : 2

//Input : 8462
//Output : 0

import java.util.*;

class Digit
{
	public int CountDigits(int iNo)
	{
		int OddCount=0,iDigit=0;
		
		if(iNo<0)
		{
			iNo=-iNo;	//updater
		}
		
		while(iNo>0)
		{
			iDigit=iNo%10;
			
			if((iDigit%2)!=0)
			{
				OddCount++;
			}
			iNo=iNo/10;
			
		}
		return OddCount;
		
	}
}
class Demo1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int No=sobj.nextInt();
		
		Digit dobj=new Digit();
		
		int iRet=dobj.CountDigits(No);
		
		System.out.println("The Odd Count is: "+iRet);
		
	}
}







