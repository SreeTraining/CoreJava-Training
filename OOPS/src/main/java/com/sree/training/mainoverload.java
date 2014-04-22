/**
 * 
 */
package com.sree.training;

/**
 * @author sreenivasrao.m
 *
 */
class mainoverload {

	public static void main(int a){  
		System.out.println(a);  
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("main() method invoked");  
		main(10);

	}

}
