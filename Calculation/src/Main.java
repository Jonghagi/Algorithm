import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 4. 21..
 */
public class Main {
    public static void main(String args[]){
        Scanner in;
        int a;
        int b;
        in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
