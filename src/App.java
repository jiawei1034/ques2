import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //initialization
        Scanner scanner = new Scanner(System.in);
        int stuId = 0;
        String stuName = null;
        int subLevel = 0;
        Exam exam = new Exam(stuId, stuName, subLevel);
        
        //input student id
        do {
            System.out.print("Enter your student ID(6 digits): ");
            stuId = scanner.nextInt();
            exam.setStuId(stuId);
            if(stuId < 100000  || stuId >= 1000000) {
                System.out.println("Invalid input. Please enter a six-digit number.");
            }
        } 
        while(stuId < 100000  || stuId >= 1000000); 

        //input student name
        do {
            System.out.print("Enter your name: ");
            stuName = scanner.next();
            if(stuName != null && stuName.trim().length() >= 3) {
                exam.setStuName(stuName);
            } 
            else {
                System.out.println("Invalid input. Please enter a name with at least 3 characters.");
            }
        } 
        while(stuName.isEmpty() || stuName.trim().length() < 3);
    
        //input subject level
        do {
            System.out.print("Enter your level(1-10): ");
            subLevel = scanner.nextInt();
            exam.setsubLevel(subLevel);
            if(subLevel <= 0 || subLevel > 10) {
                System.out.println("Invalid input. Please enter a number(1-10).");
            }
        } 
        while(subLevel <= 0 || subLevel > 10);

        //input student score
        System.out.println("\nEnter exam scores for each subject:");
        double[] scores = new double[6];
        String[] subjects = {"PHY", "CHEM", "BIO", "EN", "MA", "IT"};
        for(int i = 0; i < subjects.length; i++) {
            do {
                System.out.print(subjects[i] + ": ");
                double score = scanner.nextDouble();
                scores[i] = score;
                exam.setScores(scores);
                if (score < 0 || score > 100) {
                    System.out.println("Invalid input. Please enter a correct value (0-100).");
                } 
            } 
            while(exam.getScores()[i] < 0 || exam.getScores()[i] > 100);
        }

        //output result
        System.out.println("\n" + "Student Information:");
        System.out.println("Id: " + exam.getStuId());
        System.out.println("Name: " + exam.getStuName());
        System.out.println("Level: " + exam.getsubLevel());
        System.out.println("\nEXAM RESULTS");
        System.out.printf("Total Score: %.2f%n", + exam.calcTotal());
        System.out.printf("Average Score: %.2f%n", + exam.calcAverage());
        System.out.printf("Maximum Score: %.2f%n", + exam.findMax());

        scanner.close();
    }
}
