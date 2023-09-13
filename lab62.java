class Student {
    protected String registrationNumber;
    protected String name;
    protected int age;

    public Student(String registrationNumber, String name, int age) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class UGStudent extends Student {
    private int semester;
    private double fees;

    public UGStudent(String registrationNumber, String name, int age, int semester, double fees) {
        super(registrationNumber, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    public void displayUGDetails() {
        System.out.println("\nUG Student Details:");
        displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
    }
}

class PGStudent extends Student {
    private int semester;
    private double fees;

    public PGStudent(String registrationNumber, String name, int age, int semester, double fees) {
        super(registrationNumber, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    public void displayPGDetails() {
        System.out.println("\nPG Student Details:");
        displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
    }
}

public class Main {
    public static void main(String[] args) {
        UGStudent ug1 = new UGStudent("UG123", "John", 20, 2, 5000.0);
        UGStudent ug2 = new UGStudent("UG124", "Alice", 21, 3, 5500.0);
        PGStudent pg1 = new PGStudent("PG101", "Bob", 24, 1, 8000.0);
        PGStudent pg2 = new PGStudent("PG102", "Eva", 23, 2, 7500.0);

        ug1.displayUGDetails();
        ug2.displayUGDetails();
        pg1.displayPGDetails();
        pg2.displayPGDetails();

        int totalUGAdmissions = 2;
        int totalPGAdmissions = 2;

        System.out.println("\nTotal UG Admissions: " + totalUGAdmissions);
        System.out.println("Total PG Admissions: " + totalPGAdmissions);
    }
}
