package com.gurukul.day5;

interface Shape{
	
	/*final static*/ double x=1,y=1;
	
	/*public abstract */void set(double x,double y);
	/*public abstract */double area();
	

}



class Rect extends Object implements Shape
{
	double l,b;
	Rect(double x,double y){
		set(x,y);
	}
	public void set(double x,double y){
		//super(x,y);
		l=x;
		b=y;
		
	}
	public double area() {
		return l*b;
	}
	
}

class  Tri  implements Shape{
	double b,h;
	public void set(double x,double y) {
		b=x;
		h=y;
	}
	public double area() {
		return b*h/2;
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
		Shape a;//=new Shape();
		//a.set(2, 3);
	   // double ar=a.area();
	   // System.out.println("area"+ar);
		Rect r=new Rect(4,5);
		r.set(6,7);
		double ar=r.area();
		System.out.println("area"+ar);//42
		
		Tri t=new Tri();
		t.set(16,17);
		ar=t.area();
		System.out.println("area"+ar);//136
		// TODO Auto-generated method stub
		
		a=t;
		a.set(20,30);
		ar=a.area();
		System.out.println("area"+ar);//300
		a=r;
		a.set(6,60);
		ar=a.area();
		System.out.println("area"+ar);//360
		ar=r.area();
		System.out.println("area"+ar);//360
        Object o=r;
      //  o.area();
        System.out.println(a);
	}
}
