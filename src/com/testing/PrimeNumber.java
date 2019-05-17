package com.testing;

public class PrimeNumber {
	
//	public int Prime(int num) {
//		if(num<3) {
//			return num+1;
//		}
//		
//		if(num==3) {
//			return num+2;
//		}
//		if(num==4) {
//			return num+3;
//		}
//		if(num==5) {
//			return num+6;
//		}
//		if(num==6) {
//			return num+7;
//		}
//		if(num==7) {
//			return num+10;
//		}
//		if(num==8) {
//			return num+11;
//		}
//		if(num==9) {
//			return num+14;
//		}
		
		//Method to check if an input is prime
		public int primeCheck(int num) {
	        int counter = 2;
	        for (int i = 1; i < num ; i++) {
	            if (num % (num - i) != 0) {
	                counter++;
	            }
	        }
	            if (counter == num) {
	                return num;
	            } else {
	                return 0;
	            }
	    }
		//method to return the prime number in the sequence of primes at the index of the input(in)
	    public int Prime(int num) {
	        int out = 0;
	        int counter = 0;
	        for (int i = 1; counter < num; i++) {
	            if (primeCheck(i) != 0) {
	                counter++;
	                out = primeCheck(i);
	            }
	        }
	        return out;
	    }
}
