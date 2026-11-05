package istiklal.edu.tr;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                break;
            }
        }
    }

    @Override
    public Object clone() {
        try {
            Course courseClone = (Course) super.clone();
            courseClone.students = new String[this.students.length];
            System.arraycopy(this.students, 0, courseClone.students, 0, this.students.length);
            return courseClone;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}