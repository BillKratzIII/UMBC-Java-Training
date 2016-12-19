package mywork.ooprogramming.ex2;

import java.util.StringTokenizer;

/**
 * 
 * @author William Kratz
 * Class to store information about a Person such as:
 * first, last & full name as well as age.
 *
 */

public class Person {
	String firstName, lastName;
	int age;
	
	//Constructors
	public Person(String first, String last, int age) {
		this.firstName = first;
		this.lastName = last;
		this.age = age;
	}
	
	public Person(String fullName, int age) {
		StringTokenizer st = new StringTokenizer(fullName);
		this.firstName = st.nextToken();
		while(st.hasMoreTokens()){
			this.lastName = st.nextToken();
		}
		this.age = age;
	}

	//Getters
	public String getFirstName() {		
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public int getAge() {
		return age;
	}
	
	//Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//Returns formatted String of all variables in Person Class
	@Override
	public String toString() {
		return "Person [first=" + firstName + ", last=" + lastName + ", age=" + age + "]";
	}

	
	
	

}
