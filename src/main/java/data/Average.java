package data;

import java.util.ListIterator;
import java.util.Stack;

public class Average implements Comparable<Average>{
    /**
     * Program create lessons and use stack
     */
    private Stack<Lesson> lessons = new Stack<>();

    /**
     * first average is last average for the student
     */
    private double firstAverage = 0;

    /**
     * first akts is last taked lessons akts
     */
    private int firstAkts = 0;


    /**
     * create a new lesson
     */
    public void addLesson() {
        lessons.push(new Lesson());
    }

    /**
     * if student wanna delete a lesson need this function
     * @return
     */
    public Lesson removeLesson(){
        return lessons.pop();
    }

    /**
     *
     * @param firstAverage
     * @param firstAkts
     */
    public void assignFirstAverageAndAkts(double firstAverage, int firstAkts){
        if(firstAkts > 0 && firstAverage > 0) {
            this.firstAkts = firstAkts;
            this.firstAverage = firstAverage;
        }
    }

    /**
     * take name information
     * @param name is lesson's name
     * @param index is index in stack
     */
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

    /**
     *  take akts information
     * @param AKTS is credit of lesson
     * @param index is wwhere is in stack
     */
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

    /**
     * take information
     * @param gradeLetter new grade
     * @param index is where upload
     */
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

    /**
     * this class uplade all information and calculete this in function
     * @return the answer
     */
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

    /**
     * there we need the lesson and use
     */
    private static class Lesson{
        /**
         * name is lesson name
         */
        private String name;
        /**
         * akts is lesson akts
         */
        private int akts;
        /**
         * grade is user choice grade for lesson
         */
        private double grade;

        /**
         * no parameter constructure for new lesson
         */
        private Lesson(){
            name = "";
            akts = 0;
            grade = 0;
        }

        /**
         * call grade value
         * @return grade information
         */
        public double getGrade(){
            return grade;
        }

        /**
         * call name of lesson
         * @return name information
         */
        public String getName(){
            return name;
        }

        /**
         * akts assignment
         * @param akts lesson information
         */
        public void setAkts(int AKTS){
            if(AKTS > 0) {
                this.AKTS = AKTS;
            }
        }

        /**
         * name assignment
         * @param name is new lesson name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * take string and convert to double for grade
         * @param gradeLetter1 is string grade
         */
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
