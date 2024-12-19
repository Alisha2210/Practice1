package StringClass;

public class StringObjectEx1 {
    public static void main(String[] args) {
        String name = new String("Alisha");
        String name2 = new String("Alisha");

        System.out.println(name == name2);
        System.out.println(name.equals(name2));
    }
}
