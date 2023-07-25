package com.gurukul.day8;

import java.util.*;





public class LinkDemo {
	
		static <T extends AbstractList<?>> void display(T t)
		{
			Iterator<?> it = t.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		
		public LinkDemo()
		{
			
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("10");
		arrList.add("20");
		arrList.add("30");
		
		Vector<Integer> vect = new Vector<>();
		vect.add(100);
		vect.add(200);
		vect.add(300);
		
		Stack<Double> st = new Stack<>();
		st.add(50.0);
		st.add(100.0);
		st.add(150.0);
		
		LinkDemo.display(arrList);
		LinkDemo.display(vect);
		LinkDemo.display(st);
	}

}
