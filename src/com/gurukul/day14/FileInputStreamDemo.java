package com.gurukul.day14;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo {

    
    
    private String readEntireStream(InputStream in)
	{
	    try
	    {
		String filedata ="";
	    	    int bytesRead;
	    	    byte[] data = new byte[10];
	    	    while((bytesRead = in.read(data))!=-1)
	    	    {
	    		filedata += new String(data,0,bytesRead);
	    	    }
	    	    return filedata;
	    }
	    catch(IOException e)
	    {
		System.out.println("Error in i/p"+e.getMessage());
	    	return null;
	    }
	    finally 
	    {
		try {
		    in.close();
		}catch(IOException e)
		{
		    System.err.println("Error closing the stream"+e.getMessage());
		}
		
	    }
	}
    
    
    //Reading using File input Stream
    private void readFromFile()
    {
    	try
    	{
    	    FileInputStream fis = new FileInputStream("C:\\Users\\Akshay\\eclipse-workspace\\neebalgurukul\\src\\com\\gurukul\\day13\\project\\Music_list.txt");
    	    String filedata = readEntireStream(fis);
    	    System.out.println(filedata);
    	}
    	catch(IOException e)
    	{
    	    System.out.println("Error in i/p");
    	}
}
    
    //Read using buffered Input stream
    private void ReadUsingBufferedStream()
    {
	InputStream bis;
	try
	{
	    bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Akshay\\eclipse-workspace\\neebalgurukul\\src\\com\\gurukul\\day13\\project\\Music_list.txt"));
	    String filedata = readEntireStream(bis);
    	    System.out.println(filedata);
    	}
    	catch(IOException e)
    	{
    	    System.out.println("Error in i/p");
    	}
    }
	
	
	
	
//	private void readInputFromGeneric()
//	{
//		     
//	    try
//	    	{
//	    	    FileInputStream fis = new FileInputStream("C:\\Users\\Akshay\\eclipse-workspace\\neebalgurukul\\src\\com\\gurukul\\day13\\project\\Music_list.txt");
//	    	    String filedata =readEntireStream(fis); 
//	    	    System.out.println(filedata);
//	    	}
//	    	catch(IOException e)
//	    	{
//	    	    System.out.println("Error in i/p");
//	    	}
//
//	
//	}
    
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	FileInputStreamDemo obj = new FileInputStreamDemo ();
	//obj.readFromFile();
	obj.ReadUsingBufferedStream();
	
    }

}
