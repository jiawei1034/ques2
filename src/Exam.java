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
    @Override
    public String toString() {
        return "Id: " + this.stuId + "\n" + "Name: " + this.stuName + "\n" + "Level: " + this.subLevel;
    }

    // collect user input
    public void collectInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID: ");
        stuId = scanner.nextInt();
        System.out.print("Name: ");
        stuName = scanner.next();
        System.out.print("Level: ");
        subLevel = scanner.nextInt();

        String[] subjects = {"PHY", "CHEM", "BIO", "EN", "MA", "IT"};
        double[] scores = new double[6];

        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + ": ");
            scores[i] = scanner.nextDouble();
        }

        displayResults(scores);
        scanner.close();
    }

    public void displayResults(double[] scores) { // set to public for testing
        double total = calTotal(scores);
        double average = calAverage(scores);
        Arrays.sort(scores);

        System.out.println("\nSTUDENT INFO");
        System.out.println(toString());
        System.out.println("\nEXAM RESULT");
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum score: " + scores[5]);
    }

    public double calTotal(double[] scores) { // set to public for testing
        double total = 0;
        for (int i = 0; i < scores.length; i++) {      // for (double score : scores) {             
            total += scores[i];                        //     total += score;
        }                                              // }
        return total;
    }

    public double calAverage(double[] scores) { // set to public for testing
        double total = calTotal(scores);
        return total / scores.length;
    }
}
