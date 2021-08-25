package com.bridgelabz;
import java.util.Scanner;

public class LineComp {
	public static void main(String[] args) {
		System.out.println("Welcome to line Comparision Computation");
		double x1,y1,x2,y2,LineLength;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 and y1\n");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		System.out.println("Enter x2 and y2\n");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		sc.close();
		LineLength=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("Length of the line :"+LineLength);
		
		
	}

}
