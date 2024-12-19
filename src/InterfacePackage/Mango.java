package InterfacePackage;

public interface Mango {
    void color();

    default void pizza(){
        System.out.println("different pizza recipe");
    }

     static void mangoStaticMethod(){
        System.out.println("Mango static interface method");
    }

    private void privateMethod(){
        System.out.println("This is the private method");
    }
}
