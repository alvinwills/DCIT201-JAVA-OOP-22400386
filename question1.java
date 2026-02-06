public class Question1{
     public static boolean validateScore(double score) {
        return score >= 0 && score <= 100;
    }


    public static char calculateLetterGrade(double score) {
        if (score >= 80) return 'A';
        else if (score >= 70) return 'B';
        else if (score >= 60) return 'C';
        else if (score >= 50) return 'D';
        else return 'F';
    }

     public static void displayPerformanceMessage(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent work!");
                break;
            case 'B':
                System.out.println("Very good!");
                break;
            case 'C':
                System.out.println("Good effort.");
                break;
            case 'D':
                System.out.println("You passed.");
                break;
            case 'F':
                System.out.println("Needs improvement.");
                break;
            default:
                System.out.println("Unknown grade.");
        }
    }
}