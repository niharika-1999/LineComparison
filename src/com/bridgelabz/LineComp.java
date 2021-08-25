package com.bridgelabz;
import java.util.Scanner;

public class LineComp {
	public static void main(String[] args) {
		System.out.println("Welcome to line Comparision Computation");
		double x1,y1,x2,y2,x3,y3,x4,y4,LineLength1,LineLength2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter end points of line1 (x1,y1) and (x2,y2)");
		x1=sc.nextDouble();y1=sc.nextDouble();x2=sc.nextDouble();y2=sc.nextDouble();
		
		LineLength1=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("Length of line1\n"+LineLength1);
		
		System.out.println("Enter end points of line2(x3,y3) and (x4,y4)");
		x3=sc.nextDouble();y3=sc.nextDouble();x4=sc.nextDouble();y4=sc.nextDouble();
		sc.close();
		
		LineLength2=Math.sqrt(Math.pow(x3-x4,2)+Math.pow(y3-y4,2));
		System.out.println("Length of line2\n"+LineLength2);
		
		if(LineLength1==LineLength2)
			System.out.println("Both lines are equal");
		else
		{
			System.out.println("Both lines are not equal");
		}
	}

}
