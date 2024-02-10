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

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuName() {
        return stuName;
    }

    public void setsubLevel(int subLevel) {
        this.subLevel = subLevel;
    }

    public int getsubLevel() {
        return subLevel;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

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

    // @Override
    // public String toString() {
    //     return "Exam{Id='" + stuId + "', name=" + subLevel + "}";
    // }
}