package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AverageTest{

    @Test
    public void compareTo() {
        Average average = new Average();
        average.assignFirstAverageAndAkts(2.0 , 100);
        average.addLesson();
        average.setNameLesson("mat1",0);
        average.setAktsLesson(7,0);
        average.setGradeLesson("CC",0);
        average.addLesson();
        average.setNameLesson("mat2",1);
        average.setAktsLesson(8,1);
        average.setGradeLesson("BB",1);
        average.addLesson();
        average.setNameLesson("mat4",2);
        average.setAktsLesson(6,2);
        average.setGradeLesson("FF",2);
        average.removeLesson();
        average.addLesson();
        average.setNameLesson("mat3",2);
        average.setAktsLesson(9,2);
        average.setGradeLesson("AA",2);

        Average temp = new Average();
        average.assignFirstAverageAndAkts(2.5 , 90);
        average.addLesson();
        average.setNameLesson("mat1",0);
        average.setAktsLesson(7,0);
        average.setGradeLesson("CB",0);
        average.addLesson();
        average.setNameLesson("mat2",1);
        average.setAktsLesson(8,1);
        average.setGradeLesson("BA",1);
        average.addLesson();
        average.setNameLesson("mat4",2);
        average.setAktsLesson(6,2);
        average.setGradeLesson("DD",2);
        average.removeLesson();
        average.addLesson();
        average.setNameLesson("mat3",2);
        average.setAktsLesson(9,2);
        average.setGradeLesson("BA",2);

        assertEquals(0, average.compareTo(temp));
        assertTrue(average.compareTo(temp) < 0);
        assertTrue(average.compareTo(temp) > 0);
    }
}
