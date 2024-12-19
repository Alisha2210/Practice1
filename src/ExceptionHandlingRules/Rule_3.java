package ExceptionHandlingRules;

public class Rule_3 {
    //You can use single try block & multiple catch block
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        try {
            System.out.println(a[6]);
        } catch (ArrayIndexOutOfBoundsException ai) {
            ai.printStackTrace();
        }
        catch (ArithmeticException ae){
            ae.printStackTrace();
        }
        System.out.println("Good Evening");
    }
}
