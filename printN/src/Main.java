import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 4. 24..
 */
public class Main {
    public static void main(String argsp[]){
        Scanner input;
        int n;
        input = new Scanner(System.in);
        n = input.nextInt();

        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }
    }
}
