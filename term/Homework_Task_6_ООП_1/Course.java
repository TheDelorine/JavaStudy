public class Course {
	private static Scanner scanner = new Scanner(System.in);
	private final int max_credits_per_semester = 0;

	private String courseCode;
	private String courseName;
	private int maxStudents;
	private int currentStudent;
	private boolean isActive;

	public Course() {
		this("Course Code", "Course Name", 0, 0, false);
	}
	public Course(String courseCode, String courseName, int maxStudents) {
		this(courseCode, courseName, maxStudents, 0, 0, false);
	}
	public Course(String courseCode, String courseName, int maxStudents, int currentStudent, boolean isActive) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.maxStudents = maxStudents;
		this.currentStudent = currentStudent;
		this.isActive = isActive;
	}

	public String getCourseCode() {
		return courseCode;
	}
	public String getCourseName() {
		return courseName;
	}
	public int getMaxStudents() {
		return maxStudents;
	}
	public int getCurrentStudent() {
		return currentStudent;
	}
	public boolean getIsActive() {
		return isActive;
	}

	public static int calculateWorkload() {
		return currentStudent / (maxStudents / 100);
	}

	public void enrollStudent() {
		currentStudent++;
	}

	public void enrollStudent(String studentId) {
		currentStudent++;
		System.out.println(currentStudent);
	}

	public String displayInfo() {
		return courseCode + "\n" + courseName + "\n" + maxStudents + "\n" + currentStudent + "\n" + isActive;
	}

	public String displayInfo(boolean showAvailability) {
		int availability = maxStudents - currentStudent;
		if (showAvailability == true) {
			return courseCode + "\n" + courseName + "\n" + maxStudents + "\n" + currentStudent + "\n" + isActive + "\n Осталось место" + availability;
		}
		return courseCode + "\n" + courseName + "\n" + maxStudents + "\n" + currentStudent + "\n" + isActive;
	}
}