package ExceptionHandlingRules;

public class Rule_4 {
    //if we are having multiple statement in the try block ex 3 statement, but we got the error on the 2nd statement
    //So, try block will be terminate and our 3rd statement won't be execute.
    public static void main(String[] args) {
        try{
        System.out.println("Hi everyone");
        System.out.println(10/0);
        System.out.println("Good evening");
        } catch (ArithmeticException e) {
           e.printStackTrace();
        }
    }
}
