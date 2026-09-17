import java.util.Scanner;

class SGPACalculator {
    
    // Maps the letter grade to the exact point values you used
    public static int getGradePoint(String grade) {
        switch (grade.toUpperCase()) {
            case "S": return 10;
            case "A": return 9;
            case "B": return 8;
            case "C": return 7;
            case "D": return 6;
            case "E": return 5;
            case "F": return 0;
            default: return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects (e.g., EEE, Python, Calculus, etc.): ");
        int numSubjects = scanner.nextInt();
        
        int totalCredits = 0;
        int totalGradePoints = 0;
        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("\nSubject " + i + ":");
            
            System.out.print("Enter credits: ");
            int credits = scanner.nextInt();
            
            System.out.print("Enter expected grade (S, A, B, C, D, E, F): ");
            String grade = scanner.next();
            
            int gradePoint = getGradePoint(grade);
        
            while (gradePoint == -1) {
                System.out.print("Invalid grade. Please enter S, A, B, C, D, E, or F: ");
                grade = scanner.next();
                gradePoint = getGradePoint(grade);
            }
            
            totalCredits += credits;
            totalGradePoints += (credits * gradePoint);
        }
        
        if (totalCredits > 0) {
            double sgpa = (double) totalGradePoints / totalCredits;
            System.out.printf("\nYour calculated SGPA is: %.2f\n", sgpa);
        } else {
            System.out.println("\nTotal credits cannot be zero.");
        }
        
        scanner.close();
    }
}