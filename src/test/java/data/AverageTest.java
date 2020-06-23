package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AverageTest{

    @Test
    public void compareTo() {
        Average average = new Average();
        average.assignFirstAverageAndAkts(2.0 , 100);
        average.addLesson();
        average.setNameLessson("mat1",0);
        average.setAktsLessson(7,0);
        average.setGradeLessson("CC",0);
        average.addLesson();
        average.setNameLessson("mat2",1);
        average.setAktsLessson(8,1);
        average.setGradeLessson("BB",1);
        average.addLesson();
        average.setNameLessson("mat4",2);
        average.setAktsLessson(6,2);
        average.setGradeLessson("FF",2);
        average.removeLesson();
        average.addLesson();
        average.setNameLessson("mat3",2);
        average.setAktsLessson(9,2);
        average.setGradeLessson("AA",2);

        Average temp = new Average();
        average.assignFirstAverageAndAkts(2.5 , 90);
        average.addLesson();
        average.setNameLessson("mat1",0);
        average.setAktsLessson(7,0);
        average.setGradeLessson("CB",0);
        average.addLesson();
        average.setNameLessson("mat2",1);
        average.setAktsLessson(8,1);
        average.setGradeLessson("BA",1);
        average.addLesson();
        average.setNameLessson("mat4",2);
        average.setAktsLessson(6,2);
        average.setGradeLessson("DD",2);
        average.removeLesson();
        average.addLesson();
        average.setNameLessson("mat3",2);
        average.setAktsLessson(9,2);
        average.setGradeLessson("BA",2);

        assertFalse(average.compareTo(temp) == 0);
        assertFalse(average.compareTo(temp) < 0);
        assertTrue(average.compareTo(temp) > 0);
    }
}
