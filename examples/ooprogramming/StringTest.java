package examples.ooprogramming;
public class StringTest {
    public static void main(String args[]) {

        String name = new String("Michael Saltzman");
        System.out.println("Name is " + name);

        int len = name.length();
        System.out.println("length is " + len);

        int place = name.indexOf(' ');
        System.out.print("a space was found ");
        System.out.println("at position " + place);

        String first = name.substring(0, place);
        System.out.println("First Name is " + first);

        String last = name.substring(place + 1);
        System.out.println("Last Name is  " + last);

        char firstNameInit = first.charAt(0);
        char lastNameInit  = last.charAt(0);

        System.out.println("Initials are " +
            firstNameInit + lastNameInit);
    }
}