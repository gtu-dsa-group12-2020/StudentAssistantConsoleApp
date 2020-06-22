import java.util.Stack;

public class Room {
    private Teacher teacher;
    private BinarySearchTree<Assistant> assistants;
    private BinarySearchTree<Student> students;
    private Stack<Assignment> assignments;
    private String roomName;

    public Room(String roomName, Teacher teacher){
        this.roomName = roomName;
        this.teacher = teacher;
        assistants = new BinarySearchTree<>();
        students = new BinarySearchTree<>();
        assignments = new Stack<>();
    }

    public void addStudent(Student s) {
        if(s != null)
            students.add(s);
    }

    public void removeStudent(Student s) {

    }

    public void addAssistant(Assistant a) {

    }

    public void removeAssistant(Assistant a){

    }

    public void addAssignment(Assignment a){

    }

    public void removeAssignment(Assignment a){

    }

    public void setAssignment(int index, Assignment a){

    }

    public Assignment getAssignment(int index) {
        if(index < 0 || index > assignments.size())
            throw new IndexOutOfBoundsException();

        return assignments.get(index);
    }

    private void sendNotification(User u, String note){
        if(note != null && u != null)
            u.addNotification(note);
    }


}
