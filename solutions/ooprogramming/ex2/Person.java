package solutions.ooprogramming.ex2;
public class Person{
    String firstName, lastName;
    int theAge;

    public Person(String first, String last, int age){
        firstName = first;
        lastName = last;
        theAge = age;
    }

    public Person(String fullName, int age){
        int place = fullName.indexOf(' ');
        firstName = fullName.substring(0, place);
        lastName = fullName.substring(place + 1);
        theAge = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public int getAge(){
        return theAge;
    }

    public String toString(){
        return getFullName() + ", " + theAge;
    }
}