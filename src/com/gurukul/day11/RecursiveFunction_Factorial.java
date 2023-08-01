package com.gurukul.day11;

class Recursive {

    static int fact(int n) {
	if (n == 0) {
	    return 1;
	} else {
	    int f = fact(n - 1) * n;
	    return f;
	}
    }

    static int add(int n) {
	if (n == 0) {
	    return 0;
	} else {
	    int sum = n + add(n - 1);
	    return sum;
	}
    }

    static int pow(int b, int p) {
	if (p == 0) {
	    return 1;
	} else {
	    int r = b * pow(b, p - 1);
	    return r;
	}
    }

    static int gcd(int x, int y) {

	// by modulus method
//	if(x%y==0)
//	{
//	    return y;
//	}
//	else
//	{
//	    return gcd(y,x%y);
//	}

	// by subtraction method
	if (x == y) {
	    return y;
	} else {
	    if (x > y) {
		return gcd(x - y, y);
	    } else {
		return gcd(x, y - x);
	    }
	}
    }

    static int max(int x) {
	if (x / 10 == 0) {
	    return x;
	} else {
	    int a = x % 10;
	    // int b = x / 10;
	    if (a > max(x / 10)) {
		return a;
	    } else {
		return max(x / 10);
	    }
	}
    }

    static String reverse(int x) {
	if (x / 10 == 0) {
	    return x + "";
	} else {
	    return (x % 10) + reverse(x / 10);
	}
    }

    static String binary(int x) {
	if (x == 0 || x == 1) {
	    return x + "";
	} else {
	    String bin = binary(x / 2) + (x % 2);
	    return bin;
	}
    }

    static int mul(int x, int y) {
	if (x == 0) {
	    return 0;
	} else {
	    if (x % 2 != 0) {
		y = y + mul(x / 2, y * 2);
		return y;
	    } else {
		int a = mul(x / 2, y * 2);
		return a;

	    }
	    // alternate method

//	return mul(x/2,y*2)+y*(x%2);
	}
    }

    static int vowel(String x) 
    {
	if (x == "") 
	{
	    return 0;
	} 
	else 
	{
	    char ch = x.charAt(0);
	    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
	    {
		return 1 + vowel(x.substring(1));
	    } 
	    else 
	    {
		return vowel(x.substring(1));
	    }
	}
    }
    
    void tower(int n, char S, char A,char T)
    {
	
    }
}

public class RecursiveFunction_Factorial {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int s = Recursive.fact(5);
	int a = Recursive.add(3);
	int b = Recursive.pow(2, 5);
	int c = Recursive.gcd(175, 125);
	int d = Recursive.max(18495);
	String e = Recursive.reverse(1234);
	String f = Recursive.binary(18);
	int g = Recursive.mul(19, 10);
	int h = Recursive.vowel("abcdi");
	System.out.println(s);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);

    }

}
