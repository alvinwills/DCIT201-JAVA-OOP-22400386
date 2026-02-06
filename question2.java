// Going to show method overloading in this example

public class Question2{
     
     public static double calculateClassAverage(double score1, double score2) {
        return (score1 + score2) / 2.0;
    }

    public static double calculateClassAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3.0;
    }

}