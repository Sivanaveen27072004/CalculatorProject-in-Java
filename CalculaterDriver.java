import java.util.*;
class Calculater
{
static void addition()
{
System.out.println();
System.out.println("------You are in Addition------");
System.out.println();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number of Elements to Add");
int no=sc.nextInt();
int sum=0;
int arr[] =new int[no];
for(int i=0;i<no;i++)
{
System.out.println("Enter "+i+" Element");
arr[i]=sc.nextInt();
sum+=arr[i];
}
System.out.println();
System.out.println("The Sum answer is "+sum);
}
static void subtraction()
{
System.out.println();
System.out.println("------You are in Subtraction------");
System.out.println();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Element for Subtraction");
int sub=sc.nextInt();
System.out.println("Enter the Number of Elements to Sub");
int no=sc.nextInt();
int arr[] =new int[no];
for(int i=0;i<no;i++)
{
System.out.println("Enter "+i+" Element");
arr[i]=sc.nextInt();
sub-=arr[i];
}
System.out.println();
System.out.println("The Subtraction answer is "+sub);
}
static void multiplication()
{
System.out.println();
System.out.println("------You are in Multiplication------");
System.out.println();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number of Elements to Multiply");
int no=sc.nextInt();
int mul=1;
int arr[] =new int[no];
for(int i=0;i<no;i++)
{
System.out.println("Enter "+i+" Element");
arr[i]=sc.nextInt();
mul*=arr[i];
}
System.out.println();
System.out.println("The Multiplication answer is "+mul);
}
static void division()
{
System.out.println();
System.out.println("------You are in Division------");
System.out.println();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Element Divident");
int div=sc.nextInt();
System.out.println("Enter the Element Divisor");
int no=sc.nextInt();
int ans = (div/no);
System.out.println();
System.out.println("The Division answer is "+ans);
}
}
public class CalculaterDriver extends Calculater
{
public static void main(String [] args)
{
Calculater c=new Calculater();
System.out.println();
System.out.println("**********************************");
System.out.println();
while(true)
{
System.out.println();
System.out.println("----Welcome to Calculater------\n");
System.out.println("Please choose from below operations");
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.println();
System.out.println();
System.out.print("Enter your choise");
System.out.println();
Scanner sr=new Scanner(System.in);
int choice = sr.nextInt();
switch(choice)
{
case 1:
c.addition();
break;
case 2:
c.subtraction();
break;
case 3:
c.multiplication();
break;
case 4:
c.division();
break;
default:
System.out.println();
System.out.println("Enter the valid number");
}
System.out.println();
System.out.println();
System.out.println("******************************");
System.out.println();
System.out.println();
}
}
}