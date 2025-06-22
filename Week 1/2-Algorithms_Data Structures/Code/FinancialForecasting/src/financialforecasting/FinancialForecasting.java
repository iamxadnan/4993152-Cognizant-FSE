package financialforecasting;

import java.util.Arrays;
import java.util.List;

public class FinancialForecasting {
    
        public static double avggrowth(List<Double> pastdata) {
        double total=0.0;
        for(int i=1;i<pastdata.size();i++) {
            total+=(pastdata.get(i)-pastdata.get(i-1))/pastdata.get(i-1);
        }
        return total/(pastdata.size()-1);
    }

    public static double forecastvalue(List<Double> pastdata,double rate,int yearsahead) {
        if(yearsahead==0) return pastdata.get(pastdata.size()-1);
        return forecastvalue(pastdata,rate,yearsahead-1)*(1+rate);
    }

    public static void main(String[] args) {
        List<Double> pastdata=Arrays.asList(1000.0,1050.0,1102.5);
        int years=10;
        double rate=avggrowth(pastdata);
        System.out.printf("avggrowth: %.2f%%\n",rate*100);
        for(int i=1;i<=years;i++) {
            double predicted=forecastvalue(pastdata,rate,i);
            System.out.printf("year%d: %.2f\n",pastdata.size()-1+i,predicted);
        }
    }
}
