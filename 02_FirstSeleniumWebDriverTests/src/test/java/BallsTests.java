import org.junit.Assert;
import org.junit.Test;

public class BallsTests {


    @Test
    public void testScorenegative() {
        String actualresult = this.getMarkResult(0);
        Assert.assertEquals("2", actualresult);
    }

    @Test
    public void testScorenega() {
        String actualresult = this.getMarkResult(35);
        Assert.assertEquals("2", actualresult);
    }

    @Test
    public void testScoreudobletvoritelno() {
        String actualresult = this.getMarkResult(36);
        Assert.assertEquals("3", actualresult);
    }

    @Test
    public void testScoresatisfactory() {
        String actualresult = this.getMarkResult(56);
        Assert.assertEquals("3", actualresult);
    }

    @Test
    public void testScorechoroshist() {
        String actualresult = this.getMarkResult(57);
        Assert.assertEquals("4", actualresult);
    }

    @Test
    public void testScorechoroshist_1() {
        String actualresult = this.getMarkResult(70);
        Assert.assertEquals("4", actualresult);
    }

    @Test
    public void testScorechoroshist_2() {
        String actualresult = this.getMarkResult(71);
        Assert.assertEquals("4", actualresult);
    }

    @Test
    public void testScoreotlichnik_1() {
        String actualresult = this.getMarkResult(72);
        Assert.assertEquals("5", actualresult);
    }

    @Test
    public void testScoreotlichnik_2() {
        String actualresult = this.getMarkResult(73);
        Assert.assertEquals("5", actualresult);
    }

    @Test
    public void testScoreotlichnik_3() {
        String actualresult = this.getMarkResult(100);
        Assert.assertEquals("5", actualresult);
    }









    /*
    Всего ученик может заработать максимум 100 баллов, минимум 0.
    Его оценка за экзамен может принимать следующие значения: 2, 3, 4 или 5.

    Если ученик получил за экзамен:
    - от 0 баллов (включительно) до 35 (включительно), его оценка равна 2;
    - от 35 баллов (не включительно) до 56 (включительно), его оценка равна 3;
    - от 56 баллов (не включительно) до 71 (включительно), его оценка равна 4;
    - от 72 баллов (включительно) до 100 баллов (включительно), его оценка равна 5.
     */
    private String getMarkResult(Integer mark)
    {
        if(mark >= 0 && mark <= 35) return "2";
        if(mark > 35 && mark <= 56) return "3";
        if(mark > 56 && mark < 71) return "4";
        if(mark > 72 && mark < 100) return "5";
        return "no mark result";
    }
}
