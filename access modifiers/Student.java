public class Student {
        public int rollNumber;
        protected String name;
        private double cgpa;
        public Student(int rollNumber, String name, double cgpa) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.cgpa = cgpa;
        }
        public double getCgpa() {
            return cgpa;
        }
        public void setCgpa(double cgpa) {
            if (cgpa >= 0.0 && cgpa <= 10.0) {
                this.cgpa = cgpa;
            } else {
                System.out.println("Invalid");
            }
        }
        public void displayDetails() {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("CGPA: " + cgpa);
        }
    
    public static class PostgraduateStudent extends Student {
        public PostgraduateStudent(int rollNumber, String name, double cgpa) {
            super(rollNumber, name, cgpa);
        }
        public void changeName(String newName) {
            name = newName; 
        }
        @Override
        public void displayDetails() {
            super.displayDetails();
        }
    }
    public static void main(String[] args) {
        Student undergrad = new Student(1, "Reena", 9.87);
        System.out.println("Roll number: " + undergrad.rollNumber);
        System.out.println("Initial CGPA: " + undergrad.getCgpa());
        undergrad.setCgpa(9.97);
        System.out.println("Updated CGPA: " + undergrad.getCgpa());
        System.out.println("Undergraduate Student Details:");
        undergrad.displayDetails();

        PostgraduateStudent pgStd = new PostgraduateStudent(2, "Dev", 8.67);
        pgStd.changeName("Adele");
        System.out.println("Postgraduate Student Details:");
        pgStd.displayDetails();
    }
}
