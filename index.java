//Hollow Diamond
import java.util.Scanner;  
public class HollowDiamondPattern1  
{  
public static void main(String args[])  
{  
Scanner scan=new Scanner(System.in);  
System.out.print("Enter the number of rows: ");  
int rows=scan.nextInt();  
System.out.print("Enter the symbol you want to print: ");   
char symbol=scan.next().charAt(0);  
for(int i=1; i<=rows; i++)  
{  
for(int j=rows; j>i; j--)  
{  
System.out.print(" ");  
}  
System.out.print(symbol);  
for(int j=1; j<(i-1)*2; j++)  
{  
System.out.print(" ");  
}  
if(i==1)  
{  
System.out.print("\n");  
}  
else  
{  
System.out.print(symbol+"\n");  
}  
}    
for(int i=rows-1; i>=1; i--)  
{  
for(int j=rows; j>i; j--)  
{  
System.out.print(" ");  
}  
System.out.print(symbol);  
for(int j=1; j<(i-1)*2; j++)  
{  
System.out.print(" ");  
}  
if(i==1)  
{           
System.out.print("\n");  
}  
else  
{  
System.out.print(symbol+"\n");  
}  
}  
}  
}  

//Lower Left Triangle Pattern
import java.util.Scanner;
public class LeftTriangle{
   public static void main(String args[]){
      int i, j, my_input;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.print("Enter the number of rows : ");
      my_input = my_scanner.nextInt();
      System.out.println("The left triangle star pattern : ");
      for(i=0; i<my_input; i++){
         for(j=0; j<=i; j++){
            System.out.print("* ");
         }
         System.out.println();
      }
   }
}

// Pascal Triangle
public class CodesCracker
{
   public static void main(String[] args)
   {
      int row=5, i, j, space, num;
      for(i=0; i<row; i++)
      {
         for(space=row; space>i; space--)
         {
            System.out.print(" ");
         }
         num=1;
         for(j=0; j<=i; j++)
         {
            System.out.print(num+ " ");
            num = num*(i-j)/(j+1);
         }
         System.out.print("\n");
      }
   }
}


//Even Sum Pairs
public class SumofEven1 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number, i, evenSum = 0;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i; 
			}
		}
		System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
	}
}

//Sum of even nos in array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] intArr = new int[size];

        System.out.println("Enter the elements of the array separated by space : ");
        for (int i = 0; i < size; i++) {
            intArr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (intArr[i] % 2 == 0) {
                sum += intArr[i];
            }
        }

        System.out.println("Sum of all even numbers in the array is : " + sum);
    }
}

//Prime number
import java.io.*;
class GFG {
	static boolean isPrime(int n)
	{
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
		return true;
	}
	public static void main(String args[])
	{
		if (isPrime(11))
			System.out.println(" true");
		else
			System.out.println(" false");
		if (isPrime(15))
			System.out.println(" true");
		else
			System.out.println(" false");
	}
}

//Time to input 24 Hours
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FormatDate {
  public static void main(String[] args) {
    Date date = new GregorianCalendar(2019, Calendar.SEPTEMBER, 15, 24, 20, 15).getTime();
    System.out.println("DateTime is- " + date);
    // Pattern 
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy kk:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
    System.out.println("Time in 24 Hour format - " + sdf1.format(date));
    System.out.println("Time in 24 Hour format - " + sdf2.format(date));
  }
}
