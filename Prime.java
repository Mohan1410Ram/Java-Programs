import java.util.Scanner;
import java.lang.Math;
class Prime
{
public static void main(String args[])
{
Scanner obj= new Scanner(System.in);
System.out.println("Enter an integer: ");
int number=obj.nextInt();
if(number%2==0)
System.out.println(number+" is not a prime number.");
else
{
double sqrt= Math.sqrt(number); 
int sqrtt=(int)sqrt;
for(int i=3; i<=sqrtt; i+=2)
{
int num=number%i;
if(num==0)
{
System.out.println(number+" is not a prime number.");
System.out.println("Divisor is "+i);
System.exit(0);
}
}
System.out.println(number+" is a prime number.");
}
}}