package com.gurukul.day15;


class ArrayStack<T>
{
   T arr[];
   int top = -1;
   
   public ArrayStack()
   {
       arr =(T[]) new Object[5];
   }
   
   public ArrayStack(int size)
   {
       arr =(T[]) new Object[size];
   }
   
   public void push(T data)
   {
       if(top == arr.length-1)
       {
	   throw new RuntimeException("Stack is full");
       }
        arr[++top] =data;
   }
   
    T pop()
   {
       if(top== -1)
       {
	   throw new RuntimeException("Stack is empty");
       }
       return arr[top--];
   }
    
   boolean isEmpty()
   {
//       if(top==-1)
//	   return true;
//       else
//	   return false;
       
       // alternatively
       return top == -1;
   }
   
  T peak()
  {
      if(top== -1)
      {
	   throw new RuntimeException("Stack is empty");
      }
      return arr[top];
  }
    
}

public class ArrayStackDemo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	ArrayStack<Integer> s = new ArrayStack<>();
	int x = 18;
	while(x!=0)
	{
	    s.push(x%2);
	    x=x/2;
	}
	
	while(!s.isEmpty())
	{
	    System.out.print(s.pop());
	}
    }

}
