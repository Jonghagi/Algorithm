import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 4. 29..
 */
public class Main {
    public static int Fibonnaci(int n){
        if(n == 1){
            return 1;
        } else if(n == 2){
            return 1;
        } else {
            return Fibonnaci(n-1) + Fibonnaci(n-2);
        }
    }

    public static void main(String args[]){
        Scanner input;
        int n;
        input = new Scanner(System.in);
        n = input.nextInt();

        System.out.println(Fibonnaci(n));
    }
}
