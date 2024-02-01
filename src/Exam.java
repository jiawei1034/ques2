import java.util.Arrays;

public class Exam {
    private int stuId;
    private String stuName;
    private int subLevel;
    private double[] scores;

    public Exam(int stuId, String stuName, int subLevel) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.subLevel = subLevel;
        this.scores = new double[6];
    }

    //Setter method
    public void setScores(double[] scores) {
        this.scores = scores;
    }

    //Getter method
    public double[] getScores() {
        return scores;
    }

    public double calcTotal() {
        double total = 0;
        for(double score : scores) {
            total += score;
        }
        return total;
    }

    public double calcAverage() {
        double total = calcTotal();
        return total / scores.length;
    }

    public double findMax() {
        Arrays.sort(scores);
        return scores[5]; 
    }

    @Override
    public String toString() {
        return "STUDENT INFO\n" +
                "Id: " + stuId + "\n" +
                "Name: " + stuName + "\n" +
                "Level: " + subLevel;
    }
}