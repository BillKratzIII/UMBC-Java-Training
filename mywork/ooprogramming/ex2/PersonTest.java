package mywork.ooprogramming.ex2;

/**
 * 
 * @author William Kratz
 * Program that when run creates several Person objects using different constructors
 * from the Person class and test the methods defined in the Person class.
 *
 */

public class PersonTest {

	public static void main(String[] args) {
		
		//PERSON OBJECT bill
		Person bill = new Person("Bill", "Kratz", 30);
		System.out.println(bill.getFirstName());
		System.out.println(bill.getLastName());
		System.out.println(bill.getFullName());
		System.out.println(bill.getAge());
		System.out.println(bill.toString());
		System.out.println();
		
		//PERSON OBJECT melissa
		Person melissa = new Person("Melissa Ann Kratz", 32);
		System.out.println(melissa.getFirstName());
		System.out.println(melissa.getLastName());
		System.out.println(melissa.getFullName());
		System.out.println(melissa.getAge());
		System.out.println(melissa.toString());
		

	}

}
