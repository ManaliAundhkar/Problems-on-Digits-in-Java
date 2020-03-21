//Write a java program which accept number from user and return the count of even digits.

//Input : 2395
//Output : 1

//Input : 1018
//Output : 2

//Input : -1018
//Output : 2

//Input : 8462
//Output : 4


import java.util.*;

class Digit
{
	public int CountDigits(int iNo)
	{
		int EvenCount=0,iDigit=0;
		
		if(iNo<0)
		{
			iNo=-iNo;	//updater
		}
		
		while(iNo>0)
		{
			iDigit=iNo%10;
			
			if((iDigit%2)==0)
			{
				EvenCount++;
			}
			iNo=iNo/10;
			
		}
		return EvenCount;
		
	}
}
class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int No=sobj.nextInt();
		
		Digit dobj=new Digit();
		
		int iRet=dobj.CountDigits(No);
		
		System.out.println("The Even Count is: "+iRet);
		
	}
}







