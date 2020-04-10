package com.sapient.week1;
public class CheckEven {
    
      
   public CheckEven(){}
    
    
    public boolean check(int n) {
        int x = n % 2;
        return (x == 0) ? true : false;
    }
    public static void main (String[] args) {
		//if(check(2))
		System.out.println ("Hello World!");
    }
}