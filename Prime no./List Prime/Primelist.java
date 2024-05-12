import java.util.Scanner;
import java.lang.Math;
public class Primelist
{ 
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter starting integer:");
   long s=sc.nextLong();
   System.out.println("Enter ending integer:");
   long e=sc.nextLong();
   Primelist p=new Primelist();
    if(s<3)
    {
     System.out.print("2\t");	
     s=3;
    }
    else if(s%2==0)
     s+=1;
     for(long i=s; i<=e; i+=2)
     {
      long r= p.isPrime(i);
      if(r==1)
      System.out.print(i+"\t");
     }
   } 
  
long isPrime(long n)
{
 double k=Math.sqrt(n);
 long l=(long)k;
 for(int j=3; j<=l; j+=2)
 { 
  if(n%j==0)
   return(0);
 }
 return(1);
}
} 
