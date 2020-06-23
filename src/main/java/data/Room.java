package data;

import utils.AVL;
import utils.AVLTree;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * The type Room.
 */
public class Room implements Comparable<String> {
    /**
     * Name of Room
     */
    private final String nameOfRoom;
    /**
     * Invite Code of room
     */
    private final String codeOfRoom;
    /**
     * Set for storing Admins
     */
    private final Set<User> admins;
    /**
     * AVLTree for storing Users
     */
    private final AVL<User> userAVLTree;
    /**
     * Room's Calendar
     */
    private final Calendar roomCalendar;
    /**
     * Chat SkipList
     */
    private final ConcurrentSkipListSet<UserMessage> chat;

    private final LinkedList<Message> assignmentList;

    /**
     * Constructor
     * @param nameOfRoom Name of Room
     * @param admin Creator of Room
     */
    Room(String nameOfRoom, User admin) {
        this.nameOfRoom = nameOfRoom;
        this.admins = new HashSet<>();
        this.userAVLTree = new AVL<>();
        this.codeOfRoom = generateRoomCode();
        this.roomCalendar = new Calendar();
        this.chat = new ConcurrentSkipListSet<>();
        this.assignmentList = new LinkedList<>();
        admins.add(admin);
    }

    /**
     * Adds message to Chat
     * @param message Given user message
     * @return true if adding was successful
     */
    public boolean addChatMessage(UserMessage message) {
        return chat.add(message);
    }

    /**
     * Return all Chat
     * @return Chat
     */
    public String returnChat() {
        StringBuilder sb = new StringBuilder();
        for (UserMessage message : chat) {
            sb.append(message.toString()).append("\n");
        }
        return sb.toString();
    }

    /**
     * Add Assignment to the Assignment to the
     * @param date Date of the assignment
     * @param assignment Given Assignment object
     * @return True if adding was successful
     */
    public boolean addAssignment(Date date, Assignment assignment) {
        return roomCalendar.addAssignmentToDate(date, assignment) != null && assignmentList.add(assignment);
    }

    /**
     * Getter method for Calendar
     * @return Calendar of the Room
     */
    public Calendar getRoomCalendar() {
        return roomCalendar;
    }

    /**
     * Add admin to the Admin List
     * @param newAdmin New Admin
     * @return True if successful
     */
    public boolean addAdmin(User newAdmin) {
        return admins.add(newAdmin);
    }

    /**
     * Remove Admin from Room
     * @param target Admin to remove
     * @return True if removing was successful
     */
    public boolean removeAdmin(User target) {
        return admins.remove(target);
    }


    /**
     * Gets code of room.
     *
     * @return the code of room
     */
    public String getCodeOfRoom() {
        return codeOfRoom;
    }

    /**
     * Gets name of room.
     *
     * @return the name of room
     */
    public String getNameOfRoom() {
        return nameOfRoom;
    }

    /**
     * Gets user avl tree.
     *
     * @return the user avl tree
     */
    public AVLTree<User> getUserAVLTree() {
        return userAVLTree;
    }

    /**
     * Gets admins.
     *
     * @return the admins
     */
    public Set<User> getAdmins() {
        return admins;
    }

    /**
     * Generate room code and return it.
     *
     * @return Generated Code
     */
    public String generateRoomCode() {
        byte[] array = new byte[256];
        int n = 7;
        new Random().nextBytes(array);

        String randomString = new String(array, StandardCharsets.UTF_8);

        StringBuilder r = new StringBuilder();

        for (int k = 0; k < randomString.length(); k++) {

            char ch = randomString.charAt(k);

            if (((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) && (n > 0)) {
                r.append(ch);
                n--;
            }
        }

        // return the resultant string
        return r.toString();
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
    public int compareTo(String o) {
        return nameOfRoom.compareTo(o);
    }
}
