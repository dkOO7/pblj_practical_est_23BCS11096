import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private double marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}

public class Q_2 {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Dikshay");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll number: ");
        int a = sc.nextInt();
        while (a < 0) {
            System.out.println("Enter a positive Roll number: ");
            a = sc.nextInt();
        }

        s.setRollNo(a);
        s.setMarks(92.5);

        System.out.println("Student Name: " + s.getName());
        System.out.println("Roll Number: " + s.getRollNo());
        System.out.println("Marks: " + s.getMarks());
    }
}
