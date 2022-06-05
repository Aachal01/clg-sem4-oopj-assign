//data members day_of_month, high_temp, low_temp, amount_rain and amount_snow.
public class WeatherReport {
    int dayOfMonth;
    double highTemp;
    double lowTemp;
    double amountRain;
    double amountSnow;

    WeatherReport(){
        this.dayOfMonth = 0;
        this.highTemp = 0;
        this.lowTemp = 0;
        this.amountRain = 0;
        this.amountSnow = 0;
    }

    WeatherReport(int dOM, double hT, double lT, double aR, double aS){
        this.dayOfMonth = dOM;
        this.highTemp = hT;
        this.lowTemp = lT;
        this.amountRain = aR;
        this.amountSnow = aS;
    }

    }
