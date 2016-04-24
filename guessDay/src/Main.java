import java.util.Scanner;

/**
 * Created by Kimjonghak on 2016. 4. 24..
 */
public class Main {
    public static void main(String args[]){
        Scanner input;
        int month, day;
        int[] DaysofMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int numberOfDays;
        int day_of_week;

        input = new Scanner(System.in);
        month = input.nextInt();
        day = input.nextInt();
        numberOfDays = 0;

        for(int i = 0; i < month - 1; i++){
            numberOfDays += DaysofMonth[i];
        }

        numberOfDays += day - 1;

        day_of_week = numberOfDays % 7;

        System.out.println(week[day_of_week]);
    }
}
