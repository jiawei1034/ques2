import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExamTest {

    @Test
    public void testcalcTotal() {
        Exam exam = new Exam(126577, "Brandon", 3);
        double[] scores = {80, 75, 90, 85, 95, 88};
        exam.setScores(scores);
        double expectedTotal = 513.0;
        double actualTotal = exam.calcTotal();
        assertEquals(expectedTotal, actualTotal, 0.01); 
    }

    @Test
    public void testcalcAverage() {
        Exam exam = new Exam(122344, "Jia Wei", 2);
        double[] scores = {80, 75, 90, 85, 95, 88};
        exam.setScores(scores);
        double expectedAverage = 85.5;
        double actualAverage = exam.calcAverage();
        assertEquals(expectedAverage, actualAverage, 0.01); 
    }

    @Test
    public void testcalcMaximum() {
        Exam exam = new Exam(123343, "Yang", 1);
        double[] scores = {80, 75, 90, 85, 95, 88};
        exam.setScores(scores);
        double expectedMaximum = 95.0;
        double actualMaximum = exam.findMax();
        assertEquals(expectedMaximum, actualMaximum, 0.01); 

    }
}

