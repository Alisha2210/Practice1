package ThrowAndThrowsKeyword;

public class Marriage {
    public static void verify(int age){
        if (age >= 21){
            System.out.println("This boy is eligible for marriage");
        }else {
            throw new RuntimeException("This boy isn't eligible for the marriage");
        }
    }
    public static void main(String[] args) {
        verify(20);
    }
}
