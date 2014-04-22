/**
 * 
 */
package com.sree.training;

/**
 * @author sreenivasrao.m
 *
 */
class Student {

	int rollno;
	String name;
	
	void insertRecord(int r, String n){
		rollno = r;
		name = n;
	}
	
	void displayRecords(){
		System.out.println(rollno+" "+name);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.insertRecord(1, "Sree");
		s2.insertRecord(2, "Choudary");
		
		s1.displayRecords();
		s2.displayRecords();

	}

}
