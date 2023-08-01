package com.gurukul.day13.project;

public class MusicFileFormatException extends Exception
{
    @Override
	public String toString()
	{
		return "file extention is incorrect";
	}
}

class NoRecommendationException extends Exception
{
    @Override
	public String toString()
	{
		return "Oops !!! No recomendation found...";
	}
}
