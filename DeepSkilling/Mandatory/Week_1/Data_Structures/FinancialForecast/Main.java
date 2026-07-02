package Data_Structures.FinancialForecast;

public class Main {
    public static void main(String args[]){
        

        double intialInvestment = 10000;

        double growthRate = 1.5;

        double year = 5;

        System.out.println("Forecasted amount: "+ Forecast.recursiveforecast(intialInvestment, growthRate, year));
        
    }
}
