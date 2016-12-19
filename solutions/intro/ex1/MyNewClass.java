/*
Public Class MyNewClass {
    public void static main(String s){
        integer a = 5
        system.out.println("a = ", a);
    }
}

1. Public should be lower case
2. Class should be lower case
3. static and void are in the wrong order
4. String s should be String s[]
5. integer should be int
6. system should have a capital S
7. semi colon missing from a = 5 line
8. , is illegal in the println, should be +

*/
package solutions.intro.ex1;
public class MyNewClass {
    public static void main(String s[]){
        int a = 5;
        System.out.println("a = " + a);
    }
}