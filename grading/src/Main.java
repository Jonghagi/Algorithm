import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 4. 25..
 */
public class Main {
    public static void main(String args[]){
        Scanner input;
        int Score;
        input = new Scanner(System.in);
        Score = input.nextInt();

        if(Score >= 90){
            System.out.println("A");
        } else if(Score >= 80){
            System.out.println("B");
        } else if(Score >= 70){
            System.out.println("C");
        } else if(Score >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
