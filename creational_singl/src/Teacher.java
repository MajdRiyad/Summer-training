import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {


    private List<String> courses;

    public Teacher(String name, int id , String username, String password) {
        super(name,id,username, password);
        this.courses = new ArrayList<String>();

    }


    public List<String> getCourses() {
        return courses;
    }
    public void addCourses(String course) {
        this.courses.add(course);
    }
    public void removeCourses(String course) {
        this.courses.remove(course);
    }

}
