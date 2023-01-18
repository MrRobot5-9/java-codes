package Engineering;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}

class Marks {
    private int math;
    private int science;
    private int english;

    public Marks(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public int getScience() {
        return science;
    }

    public int getEnglish() {
        return english;
    }
}

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student roll number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(name, rollNo);

        System.out.print("Enter marks for math: ");
        int math = scanner.nextInt();
        System.out.print("Enter marks for science: ");
        int science = scanner.nextInt();
        System.out.print("Enter marks for english: ");
        int english = scanner.nextInt();

        Marks marks = new Marks(math, science, english);

        System.out.println("Student: " + student.getName() + ", Roll No: " + student.getRollNo());
        System.out.println("Marks: Math: " + marks.getMath() + ", Science: " + marks.getScience() + ", English: " + marks.getEnglish());
    }
}
