package com.gurukul.day12;

class Node<T extends Comparable<T>>
{
	private T data;
	private Node<T> next;
	
	public T getData() 
	{
		return data;
	}
	public void setData(T data) 
	{
		this.data = data;
	}
	public Node<T> getNext() 
	{
		return next;
	}
	public void setNext(Node<T> next) 
	{
		this.next = next;
	}
	
	public Node(T data, Node<T> next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
}

class LinkedList<T extends Comparable<T>>
{
    
    //Add a node to the list
	private Node<T> first=null;
	void add(T data) 
	{
		Node<T> newnode= new Node<T>(data,null);
		if(first==null) 
		{
			first=newnode;
		}
		else
		{
			Node<T> temp=first;
			while(temp.getNext()!=null) 
			{
			    temp=temp.getNext();
			}
			temp.setNext(newnode);
		}
	}
	
	
	public String toString() {
		String msg="[";
		Node<T> temp=first;
		while(temp!=null) {
		
		msg+=(temp.getData()+" ");
		temp=temp.getNext();
		}
		msg+="]";
		return msg;
	}
	
	
	//counts the number of nodes
	
	public int count()
	{
	    int c=0;
	    Node<T> temp=first;
	    if (first == null)
	    {
		return 0;
	    }
	    else
	    {
		while(temp!=null) 
		{
		    c++;
		    temp=temp.getNext();
		}
		return c;
	    }
	}
	
	//finds the largest
	
	public T max()
	{
	    Node<T> temp=first;
	    T max = temp.getData();
	    if (first == null)
	    {
		return max;
	    }
	    else
	    {
		while(temp!=null)
		{
		    
		    if(temp.getData().compareTo(max)>0)
		    {
			max = temp.getData();
		    }
		    temp=temp.getNext();
		}
		return max;
	    }
	}
	
	//inserts the node after a given value
	
	boolean insert(T data, T afterdata)
	{
	    Node<T> newnode= new Node<T>(data,null);
	    Node<T> temp=first;
	    while(temp!=null)
		{
			if(temp.getData()==(afterdata))
			{
			    Node<T> tempNext;
			    tempNext = temp.getNext();
			    temp.setNext(newnode);
			    newnode.setNext(tempNext);
			    return true;
			}
			temp=temp.getNext();		
		}
	    return false;
	}
	
	//delete the given data
	
	boolean delNode(T data)
	{
	    Node<T> temp=first;
	    Node<T> tempNext = temp.getNext();
	    if (temp.getNext()== null)
	    {
		first=null;
		return true;
	    }
	    else
	    {
		while(tempNext!=null)
		{
		    if(first.getData()==data)
		    {
			first = first.getNext();

			return true;
		    }
		    else if(tempNext.getData() == data)
		    {	
			temp.setNext(tempNext.getNext());
			return true;
		    }                  
		    temp=tempNext;
		    tempNext = tempNext.getNext();
		   
		}
		return false;
	    }
	}
	
	
	//reverse the list
	
	void reverse()
	{
	    Node<T> previous=null;;
	    Node<T> temp;
	    while (first != null)
	    {
		temp = first.getNext();
		first.setNext(previous);
		previous =first;
		first = temp;
	    }
	    first = previous;
	}
	
	//inserts the element at the given index
	boolean insertAt(T data,int index)
	{
	    Node<T> newnode= new Node<T>(data,null);
	    Node<T> temp=first;
	    Node<T> tempNext;
	    int i=0;
	    while(temp!=null)
		{
			i++;
			if(i==index)
			{
			    tempNext = temp.getNext();
			    temp.setNext(newnode);
			    newnode.setNext(tempNext);
			    return true;
			}
			temp=temp.getNext();		
		}
	    return false;
	}
}
public class LinkedListDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
            LinkedList<Integer> x=new LinkedList<Integer>();
            x.add(10);
            x.add(80);
            x.add(30);
            x.add(40);
            x.add(90);
            int a = x.count();
            System.out.println(x);
            System.out.println(a);
            System.out.println(x.max());
            x.insertAt(20,3);
            x.delNode(40);
//            x.insert(20,80);
            System.out.println(x);
            x.reverse();
            System.out.println(x);
	}

}