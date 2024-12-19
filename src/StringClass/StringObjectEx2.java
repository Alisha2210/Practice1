package StringClass;

public class StringObjectEx2 {
    public static void main(String[] args) {
        String test = "Hello";
        String test2 = new String("Hello");

        System.out.println(test == test2);
        System.out.println(test.equals(test2));
    }
}
