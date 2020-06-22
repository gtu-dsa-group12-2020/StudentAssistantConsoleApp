import java.util.LinkedList;

public class Teacher extends User<Teacher> {
	// Assistans but I dont determine data type so I use linkedlist
	private LinkedList<Assistant> assistants = new LinkedList<>();
	
    public Teacher() {
        super();
    }

    public Teacher(String name, String surname) {
        super(name, surname);
    }

    public Teacher(String name, String surname, String mail) {
        super(name, surname, mail);
    }
    // adding new Assistant to assistants
    public boolean  addAssistant(Assistant newAssistant) {
    	return assistants.add(newAssistant);
    }
    // removes assistant from assistants of teacher
    public boolean removeAssistant(Assistant willremovedAssistant) {
    	return assistants.remove(willremovedAssistant);
    }
    // showing Assistants to consol
    public void showAssistants() {
    	assistants.toString();
    }
    // CompareTo method
    @Override
    public int compareTo(Teacher o) {
        return super.compareTo(o);
    }
}
