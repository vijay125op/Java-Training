import java.util.*;
class day2_2 
{
public static void main(String args[])

{
Scanner sc=new Scanner (System.in);
int x;
System.out.println("Enter number ");
x=sc.nextInt();

if (x>0)

   {
   System.out.println("Number is Positive");
   }   

else if (x<0)
  {
   System.out.println("Number is Negative");
  }
else 
{
System.out.println("Number is Zero"); 
}
}
}