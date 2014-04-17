/**
 * 
 */
package com.sree.training;

/**
 * @author sreenivasrao.m
 *
 */
class Fabnoci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n = 10, f0 = 1, f1 = 1, f2 = 0;
		for(int i = 1; i <= n; i++){
			f2 = f0 + f1;
			f0 = f1;
			f1 = f2;
			f2 = f0;
			System.out.print(f2 + " ");
		}

	}

}
