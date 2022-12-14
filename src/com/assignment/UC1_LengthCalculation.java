package com.assignment;
import java.util.Scanner;

public class UC1_LengthCalculation {
		static double x1,x2,y1,y2;
		static double line;
		/*
		 * calculate line using x-y xo-ordinator:
		 * on creating method
		 */
		public static double cal(double a,double b,double c,double d)
		{
			 line=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y2),2));
			return line;
			
		}
		public static void main(String[] args) {
	      
			try(Scanner sc= new Scanner(System.in))
	      {
	    	  x1=sc.nextDouble();
	    	  x2=sc.nextDouble();
	    	  y1=sc.nextDouble();
	    	  y2=sc.nextDouble();
	       }
	      cal(x1,x2,y1,y2);
	      System.out.println("If x1="+x1+", x2="+x2+", y1="+y1+", y2="+y2+" length of line is "+line);

		}

	}

