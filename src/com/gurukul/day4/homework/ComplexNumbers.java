package com.gurukul.day4.homework;

class Complex{
	private double real,imag;
	
	Complex(){}
	
	Complex(double real,double imag)
	{
		this.real = real;
		this.imag = imag;
	}
	
	public String toString()
	{
		if(imag == -1)
			return real+" - i";
		if(imag ==1)
			return real+" + i";
		if(imag<0)
			return real+" - i"+(-1*imag);
		else
			return real+" + i"+imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}
	
	Complex add(Complex t)
	{
		double totalReal = getReal() + t.getReal();
		double totalImag = getImag() + t.getImag();
		Complex temp = new Complex(totalReal,totalImag);
		return temp;
	}
	
	Complex sub(Complex t)
	{
		double totalReal = getReal() - t.getReal();
		double totalImag = getImag() - t.getImag();
		Complex temp = new Complex(totalReal,totalImag);
		return temp;
	}
	
	Complex mul(Complex t)
	{
		double totalReal = (getReal()*t.getReal())-(getImag()*t.getImag());
		double totalImag = (getReal()*t.getImag())+(getImag()*t.getReal());
		Complex temp = new Complex(totalReal,totalImag);	
		return temp;
	}
	
	Complex div(Complex t)
	{
		double totalReal = ((getReal()*t.getReal()+getImag()*t.getImag())/(Math.pow(t.getReal(),2)+Math.pow(t.getImag(),2)));
		double totalImag = ((getImag()*t.getReal()-getReal()*t.getImag())/(Math.pow(t.getReal(),2)+Math.pow(t.getImag(),2)));
		Complex temp = new Complex(totalReal,totalImag);
		return temp;
	}
}

public class ComplexNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex x=new Complex(3,4);
        Complex y=new Complex(4,5);
        Complex a=x.add(y);
        Complex s=x.sub(y);
        Complex m=x.mul(y);
        Complex d=x.div(y);
        System.out.println(x); //3+i4
        System.out.println(y); //4+i5
        System.out.println(a);//7+i9
        System.out.println(s);//-1-i
        System.out.println(m);//-8+i31
        System.out.println(d);//.78+i0.02
	}

}
