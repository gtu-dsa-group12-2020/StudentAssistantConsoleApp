import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;

public abstract class User<E> implements Comparable<E> {
    private Profile profile;
    private Calender calendar = new Calender();
    private Stack<Notification> notifications = new Stack<>();
    // Lessons for schedule but I dont determine data type so I use linkedlist
    private LinkedList<Lesson> lessons = new LinkedList<>();
    
    public User(){
        profile = new Profile();
    }
    public User(String name, String surname){
        profile = new Profile(name, surname);
    }
    public User(String name, String surname, String mail) {
        profile = new Profile(name, surname, mail);
    }
    // getter for lesson
    public LinkedList<Lesson> getLessons() {
		return lessons;
	}
    // setter for lesson
	public void setLessons(LinkedList<Lesson> lessons) {
		this.lessons = lessons;
	}
	// adding lesson to lessons
	public boolean addLesson(Lesson newLesson) {
		return lessons.add(newLesson);
	}
	// removes lesson from lessons
	public boolean removeLesson(Lesson wiilremovedLesson) {
		return lessons.remove(wiilremovedLesson);
	}
	// showing lessons to consol
	public void showLessons() {
		for(Lesson temp : lessons) {
			System.out.println(temp);
		}
	}
	
	
	public Profile getProfile() {
        return profile;
    }

    public Calender getCalender() {
        return calendar;
    }

    public void addNotification(String note) {
        if(note != null)
            return;

        Notification n = new Notification(note);
        notifications.add(n);
    }

    public Notification setNotification(int index, String note){
        if(index < 0 || index >= notifications.size() || note == null)
            throw new IndexOutOfBoundsException();

        Notification n = new Notification(note);
        return notifications.set(index, n);
    }

    public Notification removeNotification(int index){
        if(index < 0 || index >= notifications.size())
            throw new IndexOutOfBoundsException();

        return notifications.remove(index);
    }

    public String getName() {
        return profile.getName();
    }

    public String getSurname() {
        return profile.getSurname();
    }

    public String getMail() {
        return profile.getMail();
    }

    public void setName(String name) {
        profile.setName(name);
    }

    public void setSurname(String surname) {
        profile.setSurname(surname);
    }

    public void setMail(String mail) {
        profile.setMail(mail);
    }
    // Showing Profile to consol
    public void showProfile() {
    	System.out.println(this.profile.toString());
    }
    // Showing notifications to consol
    public void showNotifications() {
    	System.out.println(notifications.toString());
    }	
    
    // Showing calendar to consol
    public void showCalendar() {
    	System.out.println(calendar.toString());
    }
    
    // CompareTo method , It compares profiles, If does not find then throw NoSuchElementExeption
    @Override
	public int compareTo(E other) {
		Profile temp=(Profile) other;
		if(temp!=null)
			return this.profile.compareTo(temp);
		throw new NoSuchElementException();
	}


	public static class Profile implements Comparable<Profile>{
        private String name;
        private String surname;
        private String mail;

        public Profile(){
            name = null;
            surname = null;
            mail = null;
        }
        public Profile(String name, String surname) {
            this.name = name;
            this.surname = surname;
            mail = null;
        }

        public Profile(String name, String surname, String mail) {
            this.name = name;
            this.surname = surname;
            this.mail = mail;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getMail() {
            return mail;
        }

        public void setName(String name) {
            if(name != null)
                this.name = name;
        }

        public void setSurname(String surname) {
            if(surname != null)
                this.surname = surname;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }
        // toString method
        @Override
        public String toString() {
            return "Name : " + name + " Surname : " + surname + "\n e-Mail : " + mail;
        }
        
        // CompareTo method compares profiles with respect to name than checks surname and mail
        @Override
        public int compareTo(Profile other) {
        	if(this.name.compareTo(other.name)==0) {
        		if(this.surname.equals(other.surname))
        			if(this.mail.equals(other.mail))
        				return 0;		
        	}
        	else if(this.name.compareTo(other.name)<0) {
        		return -1;
        	}	
        	return 1;
        }
        
    }

}
