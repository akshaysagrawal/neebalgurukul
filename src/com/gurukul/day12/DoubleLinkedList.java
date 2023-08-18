package com.gurukul.day12;

class Node1<T extends Comparable<T>>
{
	private T data;
	private Node1<T> next;
	private Node1<T> prev;
	
	public T getData() 
	{
		return data;
	}
	public void setData(T data) 
	{
		this.data = data;
	}
	public Node1<T> getNext() 
	{
		return next;
	}
	public void setNext(Node1<T> next) 
	{
		this.next = next;
	}
	
	public Node1<T> getPrev() {
	    return prev;
	}
	
	public void setPrev(Node1<T> prev) {
	    this.prev = prev;
	}
	
	public Node1(T data, Node1<T> next, Node1<T> prev) {
		super();
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	
//	@Override
//	public String toString() {
//		return "Node1 [data=" + data + "]";
//	}
}

class DoublyLinkedList<T extends Comparable<T>>
{
    
    //Add a Node1 to the list
	private Node1<T> first=null;
	void add(T data) 
	{
		Node1<T> newNode1= new Node1<T>(data,null,null);
		if(first==null) 
		{
			first=newNode1;
		}
		else
		{
			Node1<T> temp=first;
			while(temp.getNext()!=null) 
			{
				temp=temp.getNext();
			}
			temp.setNext(newNode1);
			newNode1.setPrev(temp);
		}
	}
	
	
//	public String toString() {
//		String msg="[";
//		Node1<T> temp=first;
//		while(temp!=null) {
//		
//		msg+=(temp.getData()+" ");
//		temp=temp.getNext();
//		}
//		msg+="]";
//		return msg;
//	}
	
	public void displayforward()
	{
	    Node1<T> temp=first;
	    if (first == null)
	    {
		System.out.println(" ");
	    }
	    else
	    {
		while(temp!=null) 
		{
		    System.out.print(temp.getData()+" ");
		    temp=temp.getNext();
		}
	    }
	}
	
	public  void displaybackward()
	{
	    Node1<T> temp=first;
	    if (first == null)
	    {
		System.out.println(" ");
	    }
	    else
	    {
		while(temp.getNext()!=null) 
		{
		    temp=temp.getNext();
		}
		
		while(temp!=null)
		{
		    System.out.print(temp.getData()+" ");
		    temp=temp.getPrev();
		}
		    
	    }
	}
	
//	boolean delete(T data)
//	{
//	    Node1<T> temp=first;
//	    Node1<T> tempNext=first;
//	    Node1<T> tempPrev=first;
//	    if (temp.getNext()== null)
//	    {
//		first=null;
//		return true;
//	    }
//	    else
//	    {
//		while(temp!=null)
//		{
//		    tempNext = temp.getNext();
//		    tempPrev = temp.getPrev();
//		    
//		    if(first.getData()==data)
//		    {
//			first=first.getNext();
//			first.setPrev(null);
//
//			return true;
//		    }
//		    else if(temp.getData() == data)
//		    {	
//			tempPrev.setNext(temp.getNext());
//			tempNext.setPrev(temp.getPrev());
//			return true;
//		    }                  
//		    temp=temp.getNext();
//		}
//		return false;
//	    }
//	}

	public void Delete(T data) {
		Node1<T> temp = first;
		while (temp != null) {
		    if (temp.getData() == data)
			break;
		    temp = temp.getNext();
		}
		if (temp == null)
		    return;
		if (temp == first) {
		    first = first.getNext();
		    first.setPrev(null);
		} else {
		    if (temp.getNext() == null)
			temp.getPrev().setNext(null);
		    else {
			temp.getNext().setPrev(temp.getPrev());
			temp.getPrev().setNext(temp.getNext());
		    }
		}
}
}

public class DoubleLinkedList {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	DoublyLinkedList<Integer> s = new DoublyLinkedList<Integer>();
        s.add(50);
        s.add(35);
        s.add(60);
        s.add(40);
        s.add(90);
        //System.out.println(s);
        //s.displayforward();
        System.out.println();
        //s.displaybackward();
        s.Delete(90);
        s.displayforward();
    }	

}
