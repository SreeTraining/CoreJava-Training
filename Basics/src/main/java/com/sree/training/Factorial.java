/**
 * 
 */
package com.sree.training;

/**
 * @author sreenivasrao.m
 *
 */
class Factorial {

	static int fact(int num){
		int f = 1;
		for(int i = 1; i <= num; i++){
			f = f*i;
		}
		return f;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int result = fact(5);
		System.out.println("Factorial of 5 = "+result);

	}

}
