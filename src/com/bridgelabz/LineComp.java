package com.bridgelabz;
import java.util.Scanner;

class Length
{
	Scanner sc = new Scanner(System.in);
	double read()
	{
		double endpoint =sc.nextDouble();
		return endpoint;
	}
	double distance1(double x1,double y1,double x2,double y2)
	{
		return (double)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
	
	}
	double distance2(double x3,double y3,double x4,double y4)
	{
		return (double)Math.sqrt(Math.pow(x3-x4,2)+Math.pow(y3-y4,2));
	}
}

public class LineComp {
	public static void main(String[] args) {
		
		System.out.println("Welcome to line Comparision Computation");
		Length l=new Length();
		double x1,y1,x2,y2,x3,y3,x4,y4,LineLength1,LineLength2;
		
		System.out.println("Enter end points of line1 (x1,y1) and (x2,y2)");
		x1=l.read();y1=l.read();x2=l.read();y2=l.read();
		LineLength1=l.distance1(x1, y1, x2, y2);
		Double l1=new Double(LineLength1);
		System.out.println("Length of line1:"+LineLength1);
		
		
		System.out.println("Enter end points of line2(x3,y3) and (x4,y4)");
		x3=l.read();y3=l.read();x4=l.read();y4=l.read();
		LineLength2=l.distance2(x3, y3, x4, y4);
		Double l2=new Double(LineLength2);
		System.out.println("Length of line2:"+LineLength2);
		
		
		
		if(l1.equals(l2))
			System.out.println("Both lines are equal");
		else
		{
			int res=l1.compareTo(l2);
			if(res==1)
			{
				
			    System.out.println("Length of line1 is greater than line2");
			}
		
		    else
		    {
		
			    System.out.println("Length of line2 is greater than line1");
		    }
	
		}
	}
}
