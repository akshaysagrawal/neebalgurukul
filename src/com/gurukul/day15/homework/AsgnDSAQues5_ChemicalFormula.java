package com.gurukul.day15.homework;

import java.util.Hashtable;
import java.util.Set;
import java.util.Stack;

class Data {
    String ch;
    int count;

    public String getCh() {
	return ch;
    }

    public void setCh(String ch) {
	this.ch = ch;
    }

    public int getCount() {
	return count;
    }

    public void setCount(int count) {
	this.count = count;
    }

    @Override
    public String toString() {
	return "Data [ch=" + ch + ", count=" + count + "]";
    }

    public Data(String ch, int count) {
	super();
	this.ch = ch;
	this.count = count;
    }

}

public class AsgnDSAQues5_ChemicalFormula {
    public static void main(String[] args) {

	// TODO Auto-generated method stub
//		Hashtable<Integer,Double> x=new Hashtable<>();
//		x.put(7,10.5);
//		x.put(9,20.9);
//		x.put(2,30.2);
//		x.put(9,40.9);
//		Double d=x.get(9);
//		System.out.println(d);

	String msg = "K4(ON(SO3)2)2";

	Stack<Data> stack = new Stack<>();

	for (int i = 0; i < msg.length(); i++) {
	    char ch = msg.charAt(i);
	   // System.out.print(ch);
	    if (Character.isLetter(ch)) {
		if (Character.isUpperCase(ch)) {
		    stack.push(new Data(ch + "", 1));
		    //System.out.println(ch);
		}
		else {
		    Data data = stack.pop();
		    data.setCh(data.getCh() + ch);
		    stack.push(data);
		}

	    } else if (Character.isDigit(ch)) {

		if (stack.peek().getCh().equals(")")) {
		    int count = 0;
		    Stack<Data> temp = new Stack<>();
		    do {
			Data data = stack.pop();
			if (data.getCh().equals(")")) {
			    count++;
			} else if (data.getCh().equals("(")) {
			    //temp.push(data);
			    count--;
			} else {
			    int num = (ch - 48);
			    data.setCount(data.getCount() * num);
			    //temp.push(data);
			}
			temp.push(data);
			

		    } while (count != 0);
		    while (!temp.isEmpty()) {
			stack.push(temp.pop());
		    }
		} else {

		    Data data = stack.pop();
		    data.setCount((ch - 48) * data.getCount());

		    stack.push(data);
		}

	    } else if (ch == '(') {

		stack.push(new Data("(", 1));
	    }

	    else {
		stack.push(new Data(")", 1));

	    }

	}

	Hashtable<String, Data> table = new Hashtable<>();
	while (!stack.isEmpty()) {

	    Data data = stack.pop();
	    if (table.get(data.getCh()) != null) {
		String key = data.getCh();
		int count = data.getCount() + table.get(key).getCount();
		data.setCount(count);
		;

		table.put(data.getCh(), data);
	    } else {
		table.put(data.getCh(), data);
	    }
	}
	Set<String> keyset = table.keySet();

	for (String key : keyset) {
	    if(table.get(key).getCh() =="(" || table.get(key).getCh() ==")")
		continue;
	    else
		System.out.println(table.get(key));
	}

    }

}
