import java.util.ArrayList;

class SchoolStdCourse {

    // ----------- Course class (Association) -----------
    static class Course {
        private String courseName;
        private ArrayList<Student> enrolledStudents;

        public Course(String courseName) {
            this.courseName = courseName;
            this.enrolledStudents = new ArrayList<>();
        }

        public String getCourseName() {
            return courseName;
        }

        public void enrollStudent(Student student) {
            enrolledStudents.add(student);
        }

        public void displayStudents() {
            System.out.println("Students enrolled in " + courseName + ":");
            for (Student s : enrolledStudents) {
                System.out.println(" - " + s.getStudentName());
            }
        }
    }

    // ----------- Student class (Aggregation with School, Association with Course) -----------
    static class Student {
        private String stdName;
        private ArrayList<Course> courses;

        public Student(String stdName) {
            this.stdName = stdName;
            courses = new ArrayList<>();
        }

        public String getStudentName() {
            return stdName;
        }

        public void addCourse(Course course) {
            courses.add(course);
            course.enrollStudent(this);  // associate back to course
        }

        public void displayCourses() {
            System.out.println(stdName + " has enrolled in:");
            for (Course c : courses) {
                System.out.println(" - " + c.getCourseName());
            }
        }
    }

    // ----------- School class (Aggregation) -----------
    static class School {
        private String schoolName;
        private ArrayList<Student> students;

        public School(String schoolName) {
            this.schoolName = schoolName;
            students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void displaySchool() {
            System.out.println("School Name: " + schoolName);
            System.out.println("Students in the school:");
            for (Student s : students) {
                System.out.println(" - " + s.getStudentName());
            }
        }
    }

    // ----------- Main Method -----------
    public static void main(String[] args) {
        // Create school
        School school = new School("ABC School");
        school.displaySchool();

        // Create courses
        Course c1 = new Course("AI");
        Course c2 = new Course("Data Science");
        Course c3 = new Course("Web Development");

        // Create students
        Student s1 = new Student("Alice");
        Student s2 = new Student("Elina");
        Student s3 = new Student("Rupert");

        // Enroll students in courses
        s1.addCourse(c1);
        s1.addCourse(c3);

        s2.addCourse(c2);
        s2.addCourse(c3);

        s3.addCourse(c1);

        // Add students to school (Aggregation)
        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);

        // Display all students and their courses
        System.out.println();
        s1.displayCourses();
        s2.displayCourses();
        s3.displayCourses();

        // Display all courses and their enrolled students
        System.out.println();
        c1.displayStudents();
        c2.displayStudents();
        c3.displayStudents();
    }
}
