package com.gurukul.day4;

class Time{
	
	private int hours,min,sec;
	
	Time(){ }
	
	Time(int hours,int min,int sec)
	{
		this.hours=hours;
		this.min=min;
		this.sec=sec;
	}
	
	public String toString()
	{
		return hours+" : "+min+" : "+sec;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}
	
	int getTimeInSeconds()
	{
		return hours * 3600 + min *60 + sec;
	}
	
	void setTimeInSeconds(int s)
	{
		hours = s/3600%24;
		s = s%3600;
		min = s/60;
		sec = s%60;
	}
	
	Time add(Time t)
	{
		Time a = new Time();
		int total = getTimeInSeconds() + t.getTimeInSeconds();
		a.setTimeInSeconds(total);
		return a;
	}
	
	 String convertIn12Hours()
	{
		int h = hours%12;
		String w;
		 if(hours>=12)
		 {
			 if(h==0)
				 h=12;
			w= h + " : "+min+" : "+sec+" PM";
		 }
		 else
			 w= h + " : "+min+" : "+sec+" AM";
		return w;
	}
	
}

public class TimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time x = new Time(12,30,25);
		Time y = new Time(19,20,35);
		Time z = x.add(y);
		String timeMessage1 = x.convertIn12Hours();
		String timeMessage2 = y.convertIn12Hours();
		System.out.println(x);	//12:30:25
		System.out.println(y);	//19:20:35
		System.out.println(z);	// 7:51:10
		System.out.println(timeMessage1);	//12:30:25 PM
		System.out.println(timeMessage2);	// 7:20:35 PM
		
	}

}
