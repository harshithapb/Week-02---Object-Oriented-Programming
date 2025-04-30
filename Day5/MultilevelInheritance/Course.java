package MultilevelInheritance;

class Course {
    private String courseName;
    private double duration; // in hours

    public Course(String courseName, double duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getDuration() {
        return duration;
    }

    public String getCourseInfo() {
        return "Course: " + courseName + ", Duration: " + duration + " hours";
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", duration=" + duration +
                '}';
    }
}

// Subclass representing an online course
class OnlineCourse extends Course {
    private String platform; // e.g., Coursera, Udemy, edX
    private boolean isRecorded;

    public OnlineCourse(String courseName, double duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public String getPlatform() {
        return platform;
    }

    public boolean isRecorded() {
        return isRecorded;
    }

    @Override
    public String getCourseInfo() {
        return super.getCourseInfo() + ", Platform: " + platform + ", Recorded: " + isRecorded;
    }

    @Override
    public String toString() {
        return "OnlineCourse{" +
                "platform='" + platform + '\'' +
                ", isRecorded=" + isRecorded +
                "} " + super.toString();
    }
}

// Subclass representing a paid online course
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // in percentage

    public PaidOnlineCourse(String courseName, double duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFee() {
        return fee;
    }

    public double getDiscount() {
        return discount;
    }

    public double getFinalFee() {
        return fee * (1 - discount / 100);
    }


    @Override
    public String getCourseInfo() {
        return super.getCourseInfo() + ", Fee: $" + fee + ", Discount: " + discount + "%";
    }

    @Override
    public String toString() {
        return "PaidOnlineCourse{" +
                "fee=" + fee +
                ", discount=" + discount +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        // Create instances of each class
        Course course = new Course("Introduction to Programming", 30);
        OnlineCourse onlineCourse = new OnlineCourse("Web Development Basics", 40, "Udemy", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Data Science", 60, "Coursera", true, 1500, 20);

        // Display course information
        System.out.println(course);
        System.out.println("Course Info: " + course.getCourseInfo());

        System.out.println(onlineCourse);
        System.out.println("Course Info: " + onlineCourse.getCourseInfo());

        System.out.println(paidOnlineCourse);
        System.out.println("Course Info: " + paidOnlineCourse.getCourseInfo());
        System.out.println("Final Fee: $" + paidOnlineCourse.getFinalFee());
    }
}
