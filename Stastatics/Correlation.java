package Stastatics;

public class Correlation {
    public void Coefficient(int x[],int y[])
    {
        int n = x.length;
        int sumX = 0,sumY = 0, sumXY = 0, sumX2 = 0, sumY2 = 0;
        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
            sumY2 += y[i] * y[i];
        }
        double numerator = n * sumXY - sumX * sumY;
        double denominator = Math.sqrt((n * sumX2 - sumX * sumX) * (n * sumY2 - sumY * sumY));
        double correlation = numerator / denominator;
        System.out.println("The correlation coefficient is: " + correlation);
    }
}
