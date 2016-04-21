import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 4. 21..
 */
public class Add {
    public static void main(String args[]) throws IOException{
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(a+b);
    }
}
