import java.util.Scanner;
class Sumnum
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int num=0;
  do
  {
   System.out.println("Enter number upto which addition should be performed:");
   System.out.println("Enter integer greater than or equal to 1!!!");
   num=sc.nextInt();
    if(num>=1)
     break;
  }while(num<1);
   Sumnum s=new Sumnum();
   int res=s.sum(num);
   System.out.println("Sum of the digits upto "+num+" is "+res); 
 }
 int sum(int num)
 {
  if(num==1)
   return (1);
  return num+sum(num-1);
 }
}
