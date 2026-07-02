package Data_Structures.FinancialForecast;

public class Forecast {

    public static double recursiveforecast(double amt, double r, double year){
        if(year==0) return amt;

        return recursiveforecast(amt*(1+r), r, year-1);
    }
    
}
