import java.util.ArrayList;
import java.util.List;
class Student {
    private String name;
    private int id;
    private List<Course> courses = new ArrayList<>();

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public String getName() {
        return name;
    }
}

class Professor {
    private String name;
    private int id;
    private List<Course> courses = new ArrayList<>();

    public Professor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void assignCourse(Course course) {
        courses.add(course);
        course.setProfessor(this); 
        System.out.println(name + " assigned to teach " + course.getCourseName());
    }

    public String getName() {
        return name;
    }
}


class Course {
    private String courseName;
    private String courseCode;
    private Professor professor; 
    private List<Student> students = new ArrayList<>(); 

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getCourseName() {
        return courseName;
    }
}

class UniMgmtSys {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);
        Professor p1 = new Professor("Dr. Smith", 201);
        Course c1 = new Course("Data Structures", "CS101");
        Course c2 = new Course("Operating Systems", "CS102");
        p1.assignCourse(c1);
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s2.enrollCourse(c2);
    }
}
