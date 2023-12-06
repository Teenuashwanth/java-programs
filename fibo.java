import java.util.Scanner;
public class fibo{
public static void main(String args[]){
int num;
int a=0,b=1,c,i;
Scanner sc=new Scanner(System.in);
System.out.print("enter the range:");
num=sc.nextInt();
System.out.print(a + "," + b + ",");
for(i=2;i<num;i++)
{
c=a+b;
a=b;
b=c;
System.out.print(c + ",");
}
}
}