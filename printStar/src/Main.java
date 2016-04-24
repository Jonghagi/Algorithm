import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 4. 24..
 */
public class Main {
    public static void main(String args[]){
        Scanner input;
        int n;
        input = new Scanner(System.in);
        n = input.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = n; j > n-i; j--){
                System.out.print(" ");
            }

            for(int j = 0; j < n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
