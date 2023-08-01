package com.gurukul.day14;

import java.io.BufferedInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

    //buffered Input Stream
    private static void readSinigleByte()
  	{
  	BufferedInputStream b = new BufferedInputStream(System.in);
  	try
  	{
  	    System.out.println("Enter an input");
  	    int a = b.read();
  	    System.out.println("input was "+a);
  	    
  	}
  	catch(IOException e)
  	{
  	    System.err.println("Error in i/p");
  	}
      }
  	
  	private static void readByteArray()
  	{
  	    BufferedInputStream bis = new BufferedInputStream(System.in);
  		try
  		{
  		    
  		    System.out.println("Enter an input");
  		    byte[] b = new byte[5];
  		    bis.read(b);
  		    
  		    System.out.println("input was "+ new String(b));
  		    
  		}
  		catch(IOException e)
  		{
  		    System.err.println("Error in i/p");
  		}
      }
    
  	private static void readByteArrayLine()
  	{
  	    BufferedInputStream bis = new BufferedInputStream(System.in);
  		try
  		{
  		    
  		    System.out.println("Enter an input");
  		    byte[] b = new byte[5];
  		    String s ="";
  		    int pos;
  		    while(true)
  		    {
          		    pos = bis.read(b);
          		    if(pos == -1)
          			break;
          		    s += new String(b,0,pos);
          		    if(b[pos-1]=='\n')
          			break;
          		    b = new byte[5];
  		    }
  		    System.out.println(s);
  		}
  		catch(IOException e)
  		{
  		    System.err.println("Error in i/p");
  		}
  	}
  	
  	
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	BufferedInputStreamDemo.readSinigleByte();
	BufferedInputStreamDemo.readByteArray();
	BufferedInputStreamDemo.readByteArrayLine();
	
    }
	

}
