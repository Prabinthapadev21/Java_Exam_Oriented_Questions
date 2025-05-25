package Stastatics;

public class Correlation {
    public void Solution(int x[],int y[])
    {
        int n = x.length;
        int sumX = 0,sumY = 0, sumXY = 0, sumX2 = 0, sumY2 = 0,SumXY2 = 0;
        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
            sumY2 += y[i] * y[i];
        }
        // Calculate the correlation coefficient
        double numerator = n * sumXY - sumX * sumY;
        double denominator = Math.sqrt((n * sumX2 - sumX * sumX) * (n * sumY2 - sumY * sumY));
        double correlation = numerator / denominator;

//        for calculating mean,median,mode,standard deviation,variance
        double meanXY = (double) sumXY / n;
        double standardDeviationX = Math.sqrt((sumX2 - (sumX * sumX) / n) / n);

        System.out.println("The sum of x is: " + sumX);
        System.out.println("The sum of y is: " + sumY);
        System.out.println("The sum of x*y is: " + sumXY);
        System.out.println("The sum of x^2 is: " + sumX2);
        System.out.println("The sum of y^2 is: " + sumY2);
        System.out.println("The correlation coefficient is: " + correlation);
    }
}
