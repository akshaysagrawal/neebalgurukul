package com.gurukul.day14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {

    private void writeToStream(OutputStream outputStream,String s)
    {
	try
	{
	    byte[] data = s.getBytes();
	    outputStream.write(data);
	    outputStream.flush();
	}
	catch(IOException e)
	{
	    throw new RuntimeException(e);
	}
	finally
	{
	    try
		{
		    outputStream.close();
		}
		catch(IOException e)
		{
		    throw new RuntimeException(e);
		}
	}
    }
    
    private void writeToFile()
    {
	String data = "1234567890123456";
	try (OutputStream outputStream = new FileOutputStream("a")) {
	    writeToStream(outputStream, data);
	} catch(IOException e) {
	    throw new RuntimeException();
	}
    }
    
    
    
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	FileOutputStreamDemo x = new FileOutputStreamDemo ();
	x.writeToStream(null, null);
	
    }

}
