import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 5. 4..
 */
public class Main {
    public static void main(String args[]){
        Scanner input;
        int R1, R2, S;
        input = new Scanner(System.in);
        R1 = input.nextInt();
        S = input.nextInt();
        R2 = S * 2 - R1;

        System.out.println(R2);

    }
}
