package lab4;

// We have to calculate the percentage of marks obtained in three subjects (each out of 100) by
// student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks'
// with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each
// having a method with the same name which returns the percentage of the students. The
// constructor of student A takes the marks in three subjects as its parameters and the marks in
// four subjects as its parameters for student B. Create an object for eac of the two classes and
// print the percentage of marks for both the students.

// Abstract class Marks
abstract class Marks {
    // Abstract method to get percentage
    abstract double getPercentage();
}

// Class A inheriting from Marks
class A extends Marks {
    // Marks in three subjects for student A
    private int subject1;
    private int subject2;
    private int subject3;

    // Constructor for student A
    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    // Override method to calculate percentage for student A
    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3.0;
    }
}

// Class B inheriting from Marks
class B extends Marks {
    // Marks in four subjects for student B
    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;

    // Constructor for student B
    public B(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    // Override method to calculate percentage for student B
    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4.0;
    }
}

// Main class to demonstrate the usage
public class q3 {
    public static void main(String[] args) {
        // Create objects for students A and B
        A studentA = new A(80, 90, 85);
        B studentB = new B(75, 85, 90, 88);

        // Print the percentage of marks for both students
        System.out.println("Percentage of marks for Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of marks for Student B: " + studentB.getPercentage() + "%");
    }
}
