import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 5. 3..
 */
public class Main {
    public static void main(String args[]){
        Scanner input;
        int NumberOfMultiTabs;
        int MaximumComputer;

        input = new Scanner(System.in);
        NumberOfMultiTabs = input.nextInt();
        MaximumComputer = 0;

        for(int i = 0; i < NumberOfMultiTabs; i++){
            MaximumComputer += input.nextInt();
        }
        MaximumComputer -= NumberOfMultiTabs-1;
        System.out.println(MaximumComputer);
    }
}
