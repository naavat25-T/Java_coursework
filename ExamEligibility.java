
import java.util.Scanner;

public class ExamEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter attendance percentage: ");
        double attendance = input.nextDouble();

        if (attendance >= 75) {
            System.out.println("Eligible for exams.");
        } else if (attendance >= 60) {
            System.out.println("Eligible with a warning letter.");
        } else {
            System.out.println("Not eligible — see the Dean of Students.");
        }

        input.close();
    }
}