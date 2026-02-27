import java.util.Scanner;

public class Book {
	private static Scanner scanner = new Scanner(System.in);
	private static int totalBooks = 0;
	private final int maxYear = 2025;
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;
    private int pageCount;

    public Book() {
        this("Title", "Author", 0, false, 0);
    }

    public Book(String title, String author, int year) {
        this(title, author, year, false, 0);
    }

    public Book(String title, String author, int year, boolean isAvailable, int pageCount) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
        this.pageCount = pageCount;
        totalBooks++;
    }

    public int getTotalBooks() {
    	return totalBooks;
    }

    public String getTitle() {
    	return title;
    }
    public String getAuthor() {
    	return author;
    }
    public int getYear() {
    	return year;
    }
    public boolean getIsAvailable() {
    	return isAvailable;
    }
    public int getPageCount() {
    	return pageCount;
    }

    public void setTitle(String title) {
    	while (title == null || title == "") {
    		System.out.println("Error");
    		title = scanner.nextLine();
    	}
    	this.title = title;
    }

    public void setAuthor(String author) {
    	while (author == null || author == "") {
    		System.out.println("Error");
    		author = scanner.nextLine();
    	}
    	this.author = author;
    }

    public void setYear(int year) {
    	while (year <= 1 || year >= maxYear) {
    		System.out.println("Error");
    		year = scanner.nextInt();
    	}
    	this.year = year;
    }

    public void setIsAvailable(boolean isAvailable) {
    	this.isAvailable = isAvailable;
    }

    public void setPageCount(int pageCount) {
    	while (pageCount < 0) {
    		System.out.println("Error");
    		pageCount = scanner.nextInt();
    	}
    	this.pageCount = pageCount;
    }

    public String displayInfo(boolean detailed) {
    	String result = "";
    	if (detailed == true) {
    		result = title + "\n" + author + "\n" + year + "\n" + isAvailable + "\n" + pageCount;
    	} else {
    		result = title + "\n" + author + "\n" + year;
    	}
        return result; 
    }

       public String displayInfo() {
    	String result = "";
    	result = title + "\n" + author + "\n" + year + "\n" + isAvailable + "\n" + pageCount;
        return result; 
    }

    public void borrowBook(String borrowerName) {
        isAvailable = false;
        System.out.println(borrowerName);
    }

    public void borrowBook() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public void updateYear(int newYear) {
        year = newYear;
    }
}