import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 4. 21..
 */
public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.printf("%.15f", a/b);
    }
}
