package InterfacePackage;

public class InterfaceImplementation implements Banana,Mango {

    public void color(){
        System.out.println("The color is yellow");
    }

    public void pizza(){
        Banana.super.pizza();
        Mango.super.pizza();
    }

    public static void main(String[] args) {
        InterfaceImplementation ii = new InterfaceImplementation();
        ii.color();
        ii.pizza();
        Mango.mangoStaticMethod();
        Banana.bananaStaticMethod();
    }

}
