package InterfacePackage;

public class Demo implements Banana {
    public void color()
    {
        System.out.println("green");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.pizza();
        d.color();
        Banana.bananaStaticMethod();
    }
}
