//Write a program which accept number from user and return multiplication of all digits.

//Input : 2395
//Output : 270

//Input : 1018
//Output : 8

//Input : 9440
//Output : 144

//Input : 922432
//Output : 864

import java.util.*;

class Digit
{
	public int MultiplyD(int iNo)
	{
		int iMult=1,iDigit=0;
		
		if(iNo<0)
		{
			iNo=-iNo;	//updater
		}
		
		while(iNo>0)
		{
			iDigit=iNo%10;
			
			if(iDigit!=0)
			{
				iMult=iMult*iDigit;
			}
			
			iNo=iNo/10;
			
		}
		return iMult;
		
	}
}
class Demo3
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int No=sobj.nextInt();
		
		Digit dobj=new Digit();
		
		int iRet=dobj.MultiplyD(No);
		
		System.out.println("The Odd Count is: "+iRet);
		
	}
}







