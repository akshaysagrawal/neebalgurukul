package com.gurukul.day5;

abstract class Shape1{
	
	double x,y;
	Shape1(){
		
	}
	Shape1(double x,double y){
		this.x=x;
		this.y=y;
	}
	void set(double x,double y){
		this.x=x;
		this.y=y;
	}
	abstract double area();
	public String toString() {
		return x+" "+ y;
	}
}
class Rect1 extends Shape1
{
	Rect1(double x,double y){
		super(x,y);
	}
	double area() {
		return x*y;
	}
	
}

class  Tri1 extends Shape1{
	double area() {
		return x*y/2;
	}
}
public class ShapeDemo {

	public static void main(String[] args) {
		
		Shape1 a;//=new Shape();
		//a.set(2, 3);
	   // double ar=a.area();
	   // System.out.println("area"+ar);
		Rect1 r=new Rect1(4,5);
		r.set(6,7);
		double ar=r.area();
		System.out.println("area"+ar);//42
		
		Tri1 t=new Tri1();
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

		//For object Class
		Object o = r;
		System.out.println(o);
	}

}