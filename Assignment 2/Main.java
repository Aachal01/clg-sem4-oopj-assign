
/*Design a class named weather report that holds a daily weather report with data members day_of_month,
 high_temp, low_temp, amount_rain and amount_snow. Use different types of constructors to initialize the  objects.
 Write a program to generate a monthly report that displays the average of each attribute.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of days: ");
        int N = sc.nextInt();

        WeatherReport reports[] = new WeatherReport[N];
        //for user input
        for(int i = 0; i < N; ++i){
            System.out.println("Entry number: " + (i+1));
            System.out.print("Day of month: ");
            int dayOfMonth = sc.nextInt();

            System.out.print("High Temp: ");
            double highTemp = sc.nextDouble();

            System.out.print("low Temp: ");
            double lowTemp = sc.nextDouble();

            System.out.print("amount of rain: ");
            double amountRain = sc.nextDouble();

            System.out.print("Amount of snow: ");
            double amountSnow = sc.nextDouble();

            reports[i] = new WeatherReport(dayOfMonth, highTemp, lowTemp, amountRain, amountSnow);
        }


        int total_dayOfMonth = 0;
        double total_highTemp = 0;
        double total_lowTemp = 0;
        double total_amountRain = 0;
        double total_amountSnow = 0;
        //for average
        for(int i = 0; i < N; ++i){
            total_dayOfMonth += reports[i].dayOfMonth;
            total_highTemp += reports[i].highTemp;
            total_lowTemp += reports[i].lowTemp;
            total_amountRain += reports[i].amountRain;
            total_amountSnow += reports[i].amountSnow;
        }

        double avg_highTemp = total_highTemp/N;
        double avg_lowTemp = total_lowTemp/N;
        double avg_amountRain = total_amountRain/N;
        double avg_amountSnow = total_amountSnow/N;

        System.out.println("Average high temperature: " + avg_highTemp);
        System.out.println("Average low temperature: " + avg_lowTemp);
        System.out.println("Average amount of rain: " + avg_amountRain);
        System.out.println("Average amount of snow: " + avg_amountSnow);

    }
}
