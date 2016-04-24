import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 4. 24..
 */
public class Main {
    public static void main(String args[]){
        Scanner input;
        int n;
        int sum;

        input = new Scanner(System.in);
        n = input.nextInt();
        sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
