package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckException {
    public static void main(String[] args) {
        try{
            FileInputStream fi = new FileInputStream("C:\\Program Files");
        }catch (FileNotFoundException f){
            f.printStackTrace();
        }
    }

}
