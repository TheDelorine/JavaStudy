public class Student {
	private static Scanner scanner = new Scanner(System.in);
	private static int totalStudents = 0;
	private final String university_name = "КФУ";


	private String studentId;
	private String firstName;
	private String lastName;
	private int age;
	private double averageGrade;
	private String faculty;

	public Student() {
		this("Student ID", "First Name", "Last Name", 0, 0, "Faculty")
	}

	public Student(String studentId, String firstName, String lastName) {
		this(studentId, firstName, lastName, 0, 0, "Faculty")
	}

	public Student(String studentId, String firstName, String lastName, int age, double averageGrade, String faculty) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.averageGrade = averageGrade;
		this.faculty = faculty;
		totalStudents++;
	}

	public static int getTotalStudents() {
		return totalStudents;
	}

	public String getStudentId() {
		return studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public double getAverageGrade() {
		return averageGrade;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setStudentId(String studentId) {
		while (studentId == null || studentId == "") {
			System.out.println("Error");
			studentId = scanner.nextLine();
		}
		this.studentId = studentId;
	}

	public void setFirstName(String firstName) {
		while (firstName == null || firstName == "") {
			System.out.println("Error");
			firstName = scanner.nextLine();
		}
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		while (lastName == null || lastName == "") {
			System.out.println("Error");
			lastName = scanner.nextLine();
		}
		this.lastName = lastName;
	}

	public void setAge(int age) {
		while (age < 16 || age > 70) {
			System.out.println("Error");
			age = scanner.nextInt();
		}
		this.age = age;
	}

	public void setAverageGrade(double averageGrade) {
		while (averageGrade < 0.0 || averageGrade > 5.0) {
			System.out.println("Error");
			averageGrade = scanner.nextDouble();
		}
		this.averageGrade = averageGrade;
	}

	public void setFaculty(String faculty) {
		while (faculty == null || faculty == "") {
			System.out.println("Error");
			faculty = scanner.nextLine();
		}
		this.faculty = faculty;
	}

	public void updateGrade(double newGrade) {
		while (newGrade < 0.0 || newGrade > 5.0) {
			System.out.println("Error");
			newGrade = scanner.nextDouble();
		}
		this.averageGrade = newGrade;
	}

	public void updateGrade(double newGrade, String subject) {
		while (newGrade < 0.0 || newGrade > 5.0) {
			System.out.println("Error");
			newGrade = scanner.nextDouble();
		}
		this.averageGrade = newGrade;
		System.out.println(subject);
	}

	public String displayInfo() {
		String result = studentId + "\n" + firstName + "\n" + lastName + "\n" + age + "\n" + averageGrade + "\n" + faculty;
		return result;
	}

	public String displayInfo(boolean detailed) {
		if (detailed == true) {
			String result = studentId + "\n" + firstName + "\n" + lastName + "\n" + age + "\n" + averageGrade + "\n" + faculty;
			return result;
		}
		return studentId + "\n" + firstName + "\n" + lastName;
	}
}