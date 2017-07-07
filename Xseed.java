package Guvi;
import java.util.Scanner;
public class Xseed {

	public static void main(String[] args) {
		System.out.print("Enter the number to seed");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int num2=scan.nextInt();
		int temp=num;
		int rem=0;
		int mul=num;
		while(temp!=0){
		rem=temp%10;
		mul*=rem;
		temp=temp/10;
	   }
		if(num2==mul){
			System.out.print("Seed");
		}
	}

}
