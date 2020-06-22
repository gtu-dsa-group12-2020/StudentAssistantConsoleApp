/**
 * Lesson Class to define lessons
 * @author mustafa
 *
 */
public class Lesson implements Comparable<Lesson> {
		private String name;
		private int cradit;
		private Teacher teacherOfthisLesson;
		private String lessonNote;
		private String date;
		// No parameter constructor 
		Lesson(){
			this.name=null;
			this.cradit=0;
			this.lessonNote=null;
			this.teacherOfthisLesson=null;
		}
		// 4 parameter constructor
		public Lesson(String name, int cradit, Teacher teacherOfthisLesson, String lessonNote,String date) {
			super();
			this.name = name;
			this.cradit = cradit;
			this.teacherOfthisLesson = teacherOfthisLesson;
			this.lessonNote = lessonNote;
			this.date=date;
		}
		
		// getters for name
		public String getName() {
			return name;
		}
		// setter for name
		public void setName(String name) {
			this.name = name;
		}
		// getters for cradit
		public int getCradit() {
			return cradit;
		}
		// setter for cradit
		public void setCradit(int cradit) {
			this.cradit = cradit;
		}
		// getters for teacher
		public Teacher getTeacherOfthisLesson() {
			return teacherOfthisLesson;
		}
		// setter for teacher
		public void setTeacherOfthisLesson(Teacher teacherOfthisLesson) {
			this.teacherOfthisLesson = teacherOfthisLesson;
		}
		// getters for note
		public String getLessonNote() {
			return lessonNote;
		}
		// setter for lesson note
		public void setLessonNote(String lessonNote) {
			this.lessonNote = lessonNote;
		}
		// getter for date
		public String getDate() {
			return date;
		}
		// setter for date
		public void setDate(String date) {
			this.date = date;
		}
		// ToString method
		@Override
		public String toString() {
			return "Lesson [Name=" + name + ", Cradit=" + cradit + ", Teacher=" + teacherOfthisLesson
					+ ", Note=" + lessonNote + " , Date="+ date +"]";
		}
		// CompareTo method
		@Override
		public int compareTo(Lesson other) {
			if(this.name.equals(other.name) && this.teacherOfthisLesson.equals(other.teacherOfthisLesson) && 
					this.cradit==other.cradit && this.lessonNote.equals(other.lessonNote) && 
						this.date.equals(other.date))
				return 0;
			return 1;
		}
		
}
