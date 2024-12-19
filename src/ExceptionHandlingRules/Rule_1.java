package ExceptionHandlingRules;

public class Rule_1 {
    public static void main(String[] args) {
        //You can handle the exception with the try & catch block
        int a[] = {1, 2, 3, 4, 5};

        try {
            System.out.println(a[6]);
        } catch (ArrayIndexOutOfBoundsException ai) {
            ai.printStackTrace();
        }
        System.out.println("Good Evening");
    }
}
