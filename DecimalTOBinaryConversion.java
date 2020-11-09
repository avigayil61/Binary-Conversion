/*
Decimal to Binary Conversion: only using integers, no Strings
*/
import java.util.Scanner;
public class BinaryConversion 
{
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		long binaryNum=0;

		boolean isBinary=true;							//verify that user entered a binary number
		do
		{
			isBinary=true;
			System.out.print("Enter a Binary (base 2) number: ");
			binaryNum=input.nextLong();
			long binaryCheck=binaryNum;

			while (binaryCheck>0 && isBinary)			//go thru every digit, while isBinary still==true
			{
				if(binaryCheck%10>1)
				{
					isBinary=false;
				}
			binaryCheck/=10;
			}
			if(!isBinary)
			{
				System.out.println("Invalid Input");
			}
		} while (!isBinary);					//end user validation

//Convert to Decimal:
		long lastDigit; 		
		int count=0;							//counts how many digits in binaryNum 
		int decNum = 0;		
		long save=binaryNum;
		while (binaryNum>0)
		{
			lastDigit=binaryNum%10;				//get lastDigit
			if (lastDigit==1)					
			{	
				double x=(Math.pow(2, count));	//get value of 2 to power of x
				decNum+=x;						
			}
			count++;
			binaryNum=binaryNum/10;			   //cut off last digit from binaryNum
		}
		System.out.println(save +" converted to decimal (base 10) is: " +decNum);

	} //end main()
}
