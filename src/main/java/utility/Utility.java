package utility;

/**
 * Created by Alireza on 6/28/2015.
 */
public abstract class Utility{
    public static boolean hasError = false;

    public static void printError(String msg) {
        hasError = true;
        System.out.println(msg);
    }

    public static void print(String s)
    {
//        System.out.println(s);
    }
}
