package Guvi;
import java.util.Scanner;
public class LCM {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int a,b,lcm=1;
	System.out.print("Enter the 1st number : ");
	a=s.nextInt();
	System.out.print("Enter the 2nd number : ");
	b=s.nextInt();
	for(int i=a;i<=a*b;i++) 
	{
	if(i%a==0 && i%b==0) {
	lcm=i;
	break; 
	}
	}
	System.out.println("L.C.M. = "+lcm);
	}
}
