package data;

import java.util.PriorityQueue;

/**
 * Class for representing Users of the System
 */
public class User implements Comparable<User> {

    /**
     * Profile of the User
     */
    private final Profile profile;

    /**
     * PriorityQueue Data Structure for storing rooms of the user attended
     */
    private final PriorityQueue<Room> rooms;
    /**
     * Calendar of User
     */
    private final Calendar userCalendar;

    /**
     * Constructor method for inserting profile of the user
     *
     * @param userName Username of the User
     * @param mail     Mail of the User
     */
    User(String userName, String mail) {
        this.profile = new Profile(userName, mail);
        this.userCalendar = new Calendar();
        this.rooms = new PriorityQueue<>();
    }

    /**
     * Takes Message from user and creates an UserMessage object
     *
     * @param message User's Message
     * @return UserMessage Object
     */
    public UserMessage addMessage(String message) {
        return new UserMessage(this, message, new java.util.Date());
    }

    /**
     * Adds room to the priorityQueue
     *
     * @param newRoom Room to inserting
     * @return True if adding was successful else false
     */
    public boolean addRoom(Room newRoom) {
        updateCalendar(newRoom.getRoomCalendar());
        return rooms.add(newRoom);
    }

    /**
     * Getter method for Calendar
     * @return Calendar of user
     */
    public Calendar getCalendar() {
        return userCalendar;
    }

    /**
     * Update users calendar
     * @param roomCalendar Calendar of room
     */
    public void updateCalendar(Calendar roomCalendar) {
        userCalendar.getDates().putAll(roomCalendar.getDates());
    }

    /**
     * Remove given room from system
     *
     * @param room Target Room
     * @return True if removing was successful
     */
    public boolean removeRoom(Room room) {
        return rooms.remove(room);
    }

    /**
     * Getter method for Room queue
     *
     * @return Return PriorityQueue of users
     */
    public PriorityQueue<Room> roomList() {
        return rooms;
    }

    /**
     * Returns All rooms' information
     *
     * @return Rooms' string
     */
    public String getRoomString() {
        StringBuilder sb = new StringBuilder();
        for (Room room : rooms) {
            sb.append(room.getNameOfRoom()).append("\nID: ")
                    .append(room.getCodeOfRoom()).append("\n");
        }
        return sb.toString();
    }

    /**
     * Getter method of Profile
     * @return Profile of User
     */
    public Profile getProfile() {
        return profile;
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
    public int compareTo(User o) {
        return this.profile.compareTo(o.getProfile());
    }

    /**
     * Inner class for representing Profile of the User
     */
    public static class Profile implements Comparable<Profile> {
        private final String userName;
        private final String mail;

        public Profile(String name, String mail) {
            this.userName = name;
            this.mail = mail;
        }

        public String getUserName() {
            return userName;
        }


        public String getMail() {
            return mail;
        }


        // toString method
        @Override
        public String toString() {
            return "User Name: " + userName + "\n e-Mail : " + mail;
        }

        // CompareTo method compares profiles with respect to name than checks surname and mail
        @Override
        public int compareTo(Profile other) {
            if (this.userName.compareTo(other.userName) == 0) {
                if (this.mail.equals(other.mail))
                    return 0;
            } else if (this.userName.compareTo(other.userName) < 0) {
                return -1;
            }
            return 1;
        }
    }
}
