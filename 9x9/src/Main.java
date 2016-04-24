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

        for(int i = 1; i < 10; i++){
            System.out.println(n  + " * " + i + " = " + n*i);
        }
    }


}
