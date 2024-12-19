package InterfacePackage;

public interface Banana {
    void color();

    default void pizza(){
        System.out.println("Pizza recipe");
    }

     static void bananaStaticMethod(){
        System.out.println("Banana static interface method");
    }

}
