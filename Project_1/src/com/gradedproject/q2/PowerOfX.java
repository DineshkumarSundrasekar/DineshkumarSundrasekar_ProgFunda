package com.gradedproject.q2;
import java.util.*;
public class PowerOfX {
	int fun(int x,int n) {
		if(n==0)
			return 1;
		else
			return x*fun(x,n-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PowerOfX obj = new PowerOfX();
		int x=0,n=0;
		System.out.println("Enter the base number X: ");
		x = sc.nextInt();
		System.out.println("Enter the power N = ");
		n = sc.nextInt();
		int value = obj.fun(x,n);
		System.out.println("X power N is: "+value);
		sc.close();
	}
}
