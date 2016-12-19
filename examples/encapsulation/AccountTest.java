package examples.encapsulation;
public class AccountTest {
    public static void main(String args[]) {
        System.out.print("Next # is ");
        System.out.println(Account.nextNumber());
        Account workers [] = { new Account("Mike"),
                               new Account("Susan"),
                               new Account("Alan") };
        for (int i = 0; i < workers.length; i++)
            System.out.println(workers[i]);
        System.out.print("Next # is ");
        System.out.println(Account.nextNumber());
    }
}