package com.practices;

public class primenumber {

	public static void main(String[] args) {
		for( int i= 1; i <= 100; i++) {
			int count = 0;    					 // this variable counts how many no. divide
			for(int n =1; n<=i; n++) {
				if(i % n ==0) {
				count++;						//counting dividing no. ex.1,2,3,..
			
				}
				}
			if(count==2) {
				System.out.println(i + " ");
			}
		}
	}
}
		
