package com.gurukul.day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReaderDemo {
    
    private static void readUsingBufferedReader()
	{
	BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
	try {
	    String data = reader.readLine();
	    System.out.println(data);
	    
	}catch(IOException e)
	{
	    throw new RuntimeException (e);
	}finally {
	    try {
		reader.close();
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		throw new RuntimeException (e);
	    }
	}
} 
    
    
    private static void readUsingFileReader()
    {
	try(FileReader fileReader = new FileReader(""))
	{
	    char[] charuf = new char[10];
	    int characterRead;
	    String fileData="";
	    while((characterRead = fileReader.read(charuf))!=-1)
	    {
		fileData += new String(charuf,0,characterRead);
	    }
	    System.out.println(fileData);
	}catch (IOException e) {
		// TODO Auto-generated catch block
		throw new RuntimeException ("Error in reading file ");
	    }
    }
    
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	 //Read using a buffered reader
	readUsingBufferedReader();
	//readUsingFileReader();
	
    }

}
