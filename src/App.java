import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stuId;
        do {
            System.out.print("Enter your student ID(6 digits): ");
            try {
                stuId = scanner.nextInt();
                if(stuId < 100000  || stuId >= 1000000) {
                    System.out.println("Invalid input. Please enter a six-digit number.");
                }
            }
            catch(NumberFormatException e) {
                System.out.println("Invalid input");
                stuId = -1;
            }
        } 
        while(stuId < 100000  || stuId >= 1000000);

        System.out.print("Enter your name: ");
        String stuName = scanner.next();
        
        int subLevel;
        do {
            System.out.print("Enter your level(1-10): ");
            try {
                subLevel = scanner.nextInt();
                if(subLevel <= 0 || subLevel > 10) {
                    System.out.println("Invalid input. Please enter a number(1-10).");
                }
            }
            catch(NumberFormatException e) {
                System.out.println("Invalid input");
                subLevel = -1;
            }
        } 
        while(subLevel <= 0 || subLevel > 10);

        Exam exam = new Exam(stuId, stuName, subLevel);

        System.out.println("\nEnter exam scores for each subject:");
        double[] scores = new double[6];
        String[] subjects = {"PHY", "CHEM", "BIO", "EN", "MA", "IT"};
        for(int i = 0; i < subjects.length; i++) {
            do {
                System.out.print(subjects[i] + ": ");
                try {
                    double score = scanner.nextDouble();
                    if (score < 0 || score > 100) {
                        System.out.println("Enter a valid score (0-100).");
                    } 
                    else {
                        scores[i] = score;
                        exam.setScores(scores); 
                    }
                } 
                catch(Exception e) {
                    System.out.println("Invalid input. Please enter a correct value (0-100).");
                    scanner.nextLine(); 
                }
            } 
            while(exam.getScores()[i] < 0 || exam.getScores()[i] > 100);
        }

        System.out.println("\n" + exam);
        System.out.println("\nEXAM RESULTS");
        System.out.println("Total Score: " + exam.calcTotal());
        System.out.println("Average Score: " + exam.calcAverage());
        System.out.println("Maximum Score: " + exam.findMax());

        //testing
        // double[] examScores = exam.getScores();
        // for(int i = 0; i < examScores.length; i++) {
        //     System.out.println(subjects[i] + ": " + examScores[i]);
        // }
        // examScores[0] = 0; 
        // exam.setScores(scores); 
        // for(int i = 0; i < examScores.length; i++) {
        //     System.out.println(subjects[i] + ": " + examScores[i]);
        // }

        scanner.close();
    }
}
