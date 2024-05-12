import java.util.Scanner;
class Fibonacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of terms in the fibonacci series: ");
int n=sc.nextInt();
int s=0,nxt=1;
System.out.print(s+"\t"+nxt+"\t");
for(int i=0; i<n-2; i++)
{
int r=s+nxt;
System.out.print(r+"\t");
s=nxt;
nxt=r;
}
}
}
