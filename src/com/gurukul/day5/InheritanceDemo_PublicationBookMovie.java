package com.gurukul.day5;

class Publication
{
	String title;
	double price;
	
	Publication(){}
	
	Publication(String title,double price)
	{
		this.title=title;
		this.price=price;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}
	
	public String toString()
	{
		return "title: "+title+" price: "+price;
	}
	
}

class Book extends Publication
{
	int noOfPages;
	
	Book(String title,double price,int noOfPages)
	{
		super(title,price);
		this.noOfPages= noOfPages;
	}

	public int getNoOfPages() {
		return noOfPages;
	}
	
	public String toString()
	{
		return super.toString()+" No. of Pages: "+noOfPages;
	}
}

class Movie extends Publication
{
	String director, leadActor;
	
	Movie(String title,double price,String director,String leadActor)
	{
		super(title,price);
		this.director=director;
		this.leadActor=leadActor;
	}

	public String getDirector() {
		return director;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public String toString()
	{
		return super.toString()+" Director's name: "+director+" LeadActor: "+leadActor;
	}
}

public class InheritanceDemo_PublicationBookMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book x = new Book("Harry Potter book",1500,2000);
		Movie y = new Movie("Harry Patter movie",500,"xyz","abc");
		
		if(x.getPrice()<y.getPrice()) 
			System.out.println(x);
		else
			System.out.println(y);
	}

}
