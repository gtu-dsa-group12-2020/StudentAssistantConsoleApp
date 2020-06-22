import java.util.PriorityQueue;

public class Average {
    private PriorityQueue<Lesson> lessons = new PriorityQueue<>();

    public void addLesson(String name, int akts) {
        lessons.add(new Lesson(name, akts));
    }

    public boolean removeLesson(int index){
        return lessons.remove(index);
    }

    private class Lesson{
        private String name;
        private int akts;

        private Lesson(String name, int akts){
            this.name = name;
            this.akts = akts;
        }
    }


}
