public class Department {
	public static Scanner scanner = new Scanner(System.in);
	public final int university_budget = 0;
	public static int totalDepartments = 0; 

	private String departmentName;
	private String headOfDepartment;
	private String officeRoom;
	private String email;
	private String phoneNumber;
	private double budget;

	public Department() {
		this("departmentName", "headOfDepartment", "officeRoom", "email", "phoneNumber", 0);
	}

	public Depratament(String departmentName, String headOfDepartment, String officeRoom) {
		this(departmentName, headOfDepartment, officeRoom, "", "", 0);
	}

	public Department(String departmentName, String headOfDepartment, String officeRoom, String email, String phoneNumber, double budget) {
		this.departmentName = departmentName;
		this.headOfDepartment = headOfDepartment;
		this.officeRoom = officeRoom;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.budget = budget;
		totalDepartments++;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public String getHeadOfDepartment() {
		return headOfDepartment;
	}

	public String getOfficeRoom() {
		return officeRoom;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		retrun phoneNumber;
	}
	public double getBudget() {
		retrun budget;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public void setHeadOfDepartment(String headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}

	public void setOfficeRoom(String officeRoom) {
		this.officeRoom = officeRoom;
	}

	public void setEmail(String email) {
		while (validateEmail(email) == false) {
			System.out.println("Error");
			email = scanner.nextLine();
		}
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber) {
		while (phoneNumber.matches("[0-9]*") == false) {
			System.out.println("Error");
			phoneNumber = scanner.nextLine();
		}
		this.phoneNumber = phoneNumber;
	}
	public void getBudget(double budget) {
		while (budget < 0) {
			System.out.println("Error");
			budget = scanner.nextDouble();
		}
		this.budget = budget;
	}

	public static boolean validateEmail(String email) {
		return email.matches("[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]{2, }");
	}

	public String countact() {
		return email + "\n" + phoneNumber;
	}

	public String countact(String message) {
		return phoneNumber + ": " + message;
	}

	public void allocateBudget(double amount) {
		while (budget - amount < 0) {
			System.out.println("Error");
			amount = scanner.nextDouble();
		}
		budget = budget - amount;
	}
	public void allocateBudget(double amount, String purpose) {
		while (budget - amount < 0) {
			System.out.println("Error");
			amount = scanner.nextDouble();
		}
		budget = budget - amount;
		System.out.println(purpose);
	}
}