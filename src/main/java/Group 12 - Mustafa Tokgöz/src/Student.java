import java.util.Stack;


public class Student extends User<Student> {
    private Stack<Assignment> assignments = new Stack<>();

    
    public Student() {
        super();
    }

    public Student(String name, String surname) {
        super(name, surname);
    }

    public Student(String name, String surname, String mail) {
        super(name, surname, mail);
    }
    // adding assignment
    public void addAssignment(Assignment a){
        assignments.add(a);
    }

    public Assignment removeAssignment(int index){
        if(index < 0 || index >= assignments.size())
            throw new IndexOutOfBoundsException();

        return assignments.remove(index);
    }

    public Assignment setAssignments(int index,Assignment a) {
        if(index < 0 || index >= assignments.size())
            throw new IndexOutOfBoundsException();

        return assignments.set(index, a);
    }
    // Removing Assignment
    public boolean remove(Assignment removed) {
    	return assignments.remove(removed);
    }
    // Showing Assignments
    public void showAssignments() {
    	assignments.toString();
    }
    
    // It compares Studenets
    @Override
    public int compareTo(Student o) {
        return super.compareTo(o);
    }
}
