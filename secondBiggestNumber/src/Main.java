import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 4. 25..
 */
public class Main {
    public static void main(String args[]){
        Scanner input;
        int a, b, c;
        input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if((a >= b && b >= c) || (c >= b && b >= a)){
            System.out.println(b);
        } else if((b >= a && a >= c) || (c >= a && a >= b)){
            System.out.println(a);
        } else {
            System.out.println(c);
        }
    }
}
