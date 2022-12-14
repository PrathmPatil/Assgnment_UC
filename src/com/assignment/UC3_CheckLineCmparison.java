package com.assignment;
import java.util.Scanner;

public class UC3_CheckLineCmparison {
	static double x1,x2,y1,y2;
	static double a1,a2,b1,b2;
	static double linefirst;
	static double linesecond;
    //method for first line
	public static double firstLine(double x1, double x2, double y1, double y2) {
		linefirst=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1), 2));
		return linefirst;
	}
	public static double secondline(double a1, double a2, double b1, double b2) {
		linesecond=Math.sqrt(Math.pow((a2-a1),2)+Math.pow((b2-b1), 2));
		return linesecond;
	}
	public static void comparison(double linefirst,double linesecond) {
		if(linefirst == linesecond)
		{
			System.out.println("first line and second line both line are same");
		}
		else if(linefirst > linesecond)
		{
			System.out.println("first line are greter then  second line");
		}
		else if(linefirst < linesecond)
		{
			System.out.println("first line are less then  second line");
		}
		else 
		{
			System.out.println("first line and second line are not same");
		}
	}
	public static void main(String[] args) {
       try(Scanner sc= new Scanner(System.in))
       { 
    	   System.out.println("enter the value of First line \n x1,x2,y1,y2");
    	   x1=sc.nextDouble();
    	   x2=sc.nextDouble();
    	   y1=sc.nextDouble();
    	   y2=sc.nextDouble();
    	   System.out.println("enter the value of Second line \n a1,a2,b1,b2");
    	   a1=sc.nextDouble();
    	   a2=sc.nextDouble();
    	   b1=sc.nextDouble();
    	   b2=sc.nextDouble();
       }
       firstLine(x1,x2,y1,y2);
       secondline(a1,a2,b1,b2);
       System.out.println(linefirst+" " +" "+ linesecond);
       comparison(linefirst,linesecond);
      
	}

}