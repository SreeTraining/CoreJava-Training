/**
 * 
 */
package com.sree.training;

/**
 * @author sreenivasrao.m
 *
 */
class FactRecursion {

	static int fact(int n){
		if(n == 1)
			return 1;
		return n *= fact(n-1);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int f = fact(5);
		System.out.println(f);

	}

}
