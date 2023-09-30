import java.util.*;

class StudentGrade {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("\nEnter the total Subjects : ");
        int totalSub = sc.nextInt();
        double[] marks = new double[totalSub];
        double totalMarks = 0.0;

        for(int i = 0; i < marks.length;i++) {
            System.out.print("Enter marks in subject "+(i+1)+" : ");
            marks[i] = sc.nextDouble();
            totalMarks += marks[i];
        }

        double avgPercentage = totalMarks / totalSub;

        String grade;
        if(avgPercentage >= 90) {
            grade = "Outstanding";
        }
        else if(avgPercentage >= 80) {
            grade = "Excellent";
        }
        else if(avgPercentage >= 70) {
            grade = "Verygood";
        }
        else if(avgPercentage >= 60) {
            grade = "Good";
        }
        else if(avgPercentage >= 50) {
            grade = "Average";
        }
        else {
            grade = "Fail";
        }

        System.out.println("\nTotal Marks is : " + totalMarks);
        System.out.println("Average Percentage : " + avgPercentage);
        System.out.println("Grade : " + grade +"\n");
    }
}