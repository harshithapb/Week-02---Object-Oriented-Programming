package Level2;
import java.util.*;
public class Course {
    String courseName;
    int duration;
    float fee;
    static String instituteName;
    Course(String courseName, int duration, float fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    void displayCourseDetails(){
        System.out.println("Coursework "+courseName+" has a fee of "+fee +" for duration of "+ duration);
    }
    static void updateInstituteName(String newName){
        instituteName=newName;
        System.out.println(" New institute name:"+instituteName);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
            System.out.println("Enter 1 for selecting your course , 2 for changing your institute and 0 to exit");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter course");
                    sc.nextLine();
                    String name=sc.nextLine();
                    System.out.println("Enter duration of course");
                    int time=sc.nextInt();
                    System.out.println("Enter fee of course");
                    float fees=sc.nextFloat();
                    Course o=new Course(name,time,fees);
                    o.displayCourseDetails();
                    break;
                case 2:
                    System.out.println("Enter new name of Institute");
                    sc.nextLine();
                    String i=sc.nextLine();
                    updateInstituteName(i);
                    break;
                default:
                    if (ch == 0) {
                        System.out.println("Exiting sys");
                    }
                    else {
                        System.out.println("Invalid choice");
                    }
            }

        }while(ch!=0);

    }

}
