import java.util.*;
class sumofdigit
{
public static void main(String arg[])
{
int sum=0,i,r,num;
Scanner in=new Scanner(System.in);
System.out.print("Enter the number=");
num=in.nextInt();
while(num>0)
{
r=num%10;
sum=sum+r;
num=num/10;
}
System.out.print("Sum of digit="+sum);

}
}