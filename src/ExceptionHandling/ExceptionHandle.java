package ExceptionHandling;

public class ExceptionHandle {
    public static void main(String[] args) {
        System.out.println("Hello world");
        try{
            System.out.println(10/0);
        }catch (ArithmeticException a){
            a.printStackTrace();
        }
        System.out.println("How are you");
    }
}
