import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 4. 21..
 */
public class Main {
    public static void main(String args[]){
        Scanner input;
        int A;
        int B;
        int C;
        input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();

        System.out.println((A+B)%C);
        System.out.println((A%C+B%C)%C);
        System.out.println((A*B)%C);
        System.out.println((A%C*B%C)%C);
    }
}
