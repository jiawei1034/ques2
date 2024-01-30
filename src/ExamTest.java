import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExamTest {

    @Test
    public void testCalTotal() {
        double[] scores = {90.5, 85.0, 92.5, 78.0, 88.5, 95.0};
        Exam exam = new Exam(120183, "Jay Chou", 1);
        double result = exam.total(scores);
        assertEquals(529.5, result, 0.0001); 
    }

    @Test
    public void testCalAverage() {
        double[] scores = {90.5, 85.0, 92.5, 78.0, 88.5, 95.0};
        Exam exam = new Exam(170434, "Brandon", 1);
        double result = exam.average(scores);
        assertEquals(88.25, result, 0.0001); 
    }
}
