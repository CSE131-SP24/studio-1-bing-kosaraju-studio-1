package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What is the Average?");
		int n1=in.nextInt();
		int n2=in.nextInt();
		double avg =(double) (n1 + n2) / 2;
		String name = in.nextLine();
		System.out.print(avg);
	}

}
