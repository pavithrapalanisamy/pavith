package Guvi;
import java.util.Scanner;
public class CountParagraph {

	public static void main(String[] args) {
		System.out.println("Enter the para");
		Scanner scan=new Scanner(System.in);
		String line=scan.nextLine();
		int Count=0;
		scan.close();
		String[] sentenceList = line.split("[!?.:]+");
        Count += sentenceList.length;
		System.out.println(Count);

	}

}
