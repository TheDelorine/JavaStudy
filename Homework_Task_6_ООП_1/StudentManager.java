public class StudentManager {
	public void addStudentToCourse(Student student, Course course) {
		course.enrollStudent();
		student.setFaculty(course.getCourseName());
	}

	public Student findStudentById(String studentId, Student[] array) {
		for (int i = 0; i < array.length(); i++) {
			if (array[i].getStudentId() == studentId) {
				return array[i];
				break;
			}
		}
	}

	public void getStudentsByFaculty(String faculty, Student[] array) {
		
	}

	public void calculateFacultyAverage(String faculty) {

	}
}