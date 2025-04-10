package Sample_Pbm;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    @Override
    public String toString() {
        return "Hybrid_Inheritance.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// Subclass representing a teacher
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher, Subject: " + subject);
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();
        displayRole();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                "} " + super.toString();
    }
}

// Subclass representing a student
class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void displayRole() {
        System.out.println("Role: Student, Grade: " + grade);
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();
        displayRole();
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                "} " + super.toString();
    }
}

// Subclass representing a staff member
class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void displayRole() {
        System.out.println("Role: Staff, Department: " + department);
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();
        displayRole();
    }

    @Override
    public String toString() {
        return "Staff{" +
                "department='" + department + '\'' +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        // Create instances of each class
        Person person = new Person("John Doe", 30);
        Teacher teacher = new Teacher("Jane Smith", 35, "Mathematics");
        Student student = new Student("Alice Johnson", 16, 10);
        Staff staff = new Staff("Bob Williams", 40, "Administration");

        // Display information about each person
        person.displayPersonInfo();
        System.out.println(person);

        teacher.displayPersonInfo();
        System.out.println(teacher);

        student.displayPersonInfo();
        System.out.println(student);

        staff.displayPersonInfo();
        System.out.println(staff);
    }
}
