package data;

import java.util.ListIterator;
import java.util.Stack;

public class Average implements Comparable<Average>{
    private Stack<Lesson> lessons = new Stack<>();
    private double firstAverage = 0;
    private int firstAkts = 0;

    public void addLesson() {
        lessons.push(new Lesson());
    }
    public Lesson removeLesson(){
        return lessons.pop();
    }

    public void assignFirstAverageAndAkts(double firstAverage, int firstAkts){
        if(firstAkts > 0 && firstAverage > 0) {
            this.firstAkts = firstAkts;
            this.firstAverage = firstAverage;
        }
    }

    public void setNameLesson(String name , int index){
        try{
            if(index < 0 || index >= lessons.size() )
                throw new IndexOutOfBoundsException();

            ListIterator<Lesson> iter = lessons.listIterator(index);
            Lesson tempLesson = iter.next();

            tempLesson.setName(name);
        }

        catch (IndexOutOfBoundsException e){
            System.err.println("Lesson Stack Index out of Bounds");
        }
    }

    public void setAktsLesson(int AKTS , int index){
        try{
            if(index < 0 || index >= lessons.size() )
                throw new IndexOutOfBoundsException();

            ListIterator<Lesson> iter = lessons.listIterator(index);
            Lesson tempLesson = iter.next();

            tempLesson.setAkts(AKTS);
        }

        catch (IndexOutOfBoundsException e){
            System.err.println("Lesson Stack Index out of Bounds");
        }
    }

    public void setGradeLesson(String gradeLetter , int index){
        try{
            if(index < 0 || index >= lessons.size() )
                throw new IndexOutOfBoundsException();

            ListIterator<Lesson> iter = lessons.listIterator(index);
            Lesson tempLesson = iter.next();

            tempLesson.gradeValue(gradeLetter);
        }

        catch (IndexOutOfBoundsException e){
            System.err.println("Lesson Stack Index out of Bounds");
        }
    }

    public double calculateAverage(){
        int lessonsTotalAkts = 0;
        double lessonsTotalGrade = 0;
        Lesson tempLesson;

        for (Lesson lesson : lessons) {
            tempLesson = lesson;
            lessonsTotalAkts += tempLesson.getAkts();
            lessonsTotalGrade += tempLesson.getGrade() * tempLesson.getAkts();
        }

        lessonsTotalAkts += firstAkts;
        lessonsTotalGrade += firstAkts * firstAverage;

        return lessonsTotalGrade / lessonsTotalAkts;
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure
     * {@code sgn(x.compareTo(y)) == -sgn(y.compareTo(x))}
     * for all {@code x} and {@code y}.  (This
     * implies that {@code x.compareTo(y)} must throw an exception iff
     * {@code y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code x.compareTo(y)==0}
     * implies that {@code sgn(x.compareTo(z)) == sgn(y.compareTo(z))}, for
     * all {@code z}.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * {@code sgn(}<i>expression</i>{@code )} designates the mathematical
     * <i>signum</i> function, which is defined to return one of {@code -1},
     * {@code 0}, or {@code 1} according to whether the value of
     * <i>expression</i> is negative, zero, or positive, respectively.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Average o) {
        return Double.compare(calculateAverage(), o.calculateAverage());
    }

    private static class Lesson{
        private String name;
        private int AKTS;
        private double grade;

        private Lesson(){
            name = "";
            AKTS = 0;
            grade = 0;
        }

        public int getAkts(){
            return AKTS;
        }

        public double getGrade(){
            return grade;
        }

        public String getName(){
            return name;
        }

        public void setAkts(int AKTS){
            if(AKTS > 0) {
                this.AKTS = AKTS;
            }
        }

        public void setName(String name) {
            this.name = name;
        }

        public void gradeValue(String gradeLetter1){
            switch (gradeLetter1) {
                case "AA":
                    grade = 4;
                    break;
                case "BA":
                    grade = 3.5;
                    break;
                case "BB":
                    grade = 3;
                    break;
                case "CB":
                    grade = 2.5;
                    break;
                case "CC":
                    grade = 2;
                    break;
                case "DC":
                    grade = 1.5;
                    break;
                case "DD":
                    grade = 1;
                    break;
                default:
                    grade = 0;
                    break;
            }
        }
    }
}
