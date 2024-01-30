import java.util.Arrays;
import java.util.Scanner;

public class Exam {
    private int stuId;
    private String stuName;
    private int subLevel;

    public Exam(int id, String name, int level) {
        this.stuId = id;
        this.stuName = name;
        this.subLevel = level;
    }

    // toString method
    public String toString() {
        return "Id: " + this.stuId + "\n" + "Name: " + this.stuName + "\n" + "Level: " + this.subLevel;
    }

    // collect user input
    public void collectInput() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter your student ID(6 digits): ");
            try {
                stuId = scanner.nextInt();
                if(stuId < 100000  || stuId >= 1000000) {
                    System.out.println("Enter a valid input");
                }
            }
            catch(NumberFormatException e) {
                System.out.println("Invalid input");
                stuId = -1;
            }
        } 
        while(stuId < 100000  || stuId >= 1000000);
        System.out.print("Enter your name: ");
        stuName = scanner.next();
        do {
            System.out.print("Enter your level(1-10): ");
            try {
                subLevel = scanner.nextInt();
                if(subLevel <= 0 || subLevel > 10) {
                    System.out.println("Enter a valid INPUT");
                }
            }
            catch(NumberFormatException e) {
                System.out.println("Invalid input");
                subLevel = -1;
            }
        } 
        while(subLevel <= 0 || subLevel > 10);
        
        String[] subjects = {"PHY", "CHEM", "BIO", "EN", "MA", "IT"};
        double[] scores = new double[6];
        System.out.println("\nSUBJECT SCORE: ");
        for(int i = 0; i < subjects.length; i++) {
            do {
                System.out.print(subjects[i] + ": ");
                try {
                    scores[i] = scanner.nextDouble();
                    if(scores[i] < 0 || scores[i] > 100) {
                        System.out.println("Enter a valid input");
                    }
                }
                catch(NumberFormatException e) {
                    System.out.println("Invalid input");
                    scores[i] = -1;
                }
            } 
            while(scores[i] < 0 || scores[i] > 100);
        }

        results(scores);
        scanner.close();
    }

    //display result to the user
    public void results(double[] scores) { // set to public for testing
        double total = total(scores);
        double average = average(scores);
        Arrays.sort(scores);

        System.out.println("\nSTUDENT INFO");
        System.out.println(toString());
        System.out.println("\nEXAM RESULT");
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum score: " + scores[5]);
    }

    public double total(double[] scores) {
        double total = 0;
        for (int i = 0; i < scores.length; i++) {                 
            total += scores[i];                        
        }                                             
        return total;
    }

    public double average(double[] scores) { // set to public for testing
        double total = total(scores);
        return total / scores.length;
    }
}
