package solutions.ooprogramming.ex2;
public class PersonTest{
    public static void main(String args[]){
        Person p1 = new Person("John", "Doe", 35);
        Person p2 = new Person("Jane Smith", 27);

        System.out.println(p1.getFirstName());
        System.out.println(p1.getLastName());
        System.out.println(p1.getAge());

        System.out.println(p2.getFullName());

        System.out.println(p1);
        System.out.println(p2);
    }
}