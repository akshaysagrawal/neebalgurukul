package com.gurukul.day4;

class Polar{
	private double r,th;
	
	Polar()
	{}
	
	Polar(double r,double th)
	{
		this.r=r;
		this.th=th;
	}
	
	public String toString()
	{
		return r+" : "+th;
	}
	
	public double getX()
	{
		return r * Math.cos(Math.toRadians(th));
	}
	
	public double getY()
	{
		return r * Math.sin(Math.toRadians(th));
	}
	
	public void setPolar(double x,double y)
	{
		
		this.r = Math.hypot(x, y);
		double d = Math.atan2(y, x);
		this.th = Math.toDegrees(d);	
	}
		
	
}

public class PolarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polar a =new Polar(5,50);
		Polar b =new Polar(6,50);
		Polar c =new Polar();
		double x = a.getX() + b.getX();
		double y = a.getY() + b.getY();
		
		c.setPolar(x,y);
		
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
		
	}

}
