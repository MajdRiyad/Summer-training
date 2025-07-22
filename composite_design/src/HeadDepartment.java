import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {

    private String name;
    private int id ;
    private List<Department> childDepartments;

    public HeadDepartment(String name, int id) {
        this.name = name;
        this.id = id;
        this.childDepartments = new ArrayList<Department>();
    }

    public void displayDepartmentName() {
        System.out.println(this.name);
        System.out.println("The Department that in: ");
        childDepartments.forEach(Department::displayDepartmentName);
    }
    public String getName() {
        return name;
    }
    public void addDepartment(Department department) {
        childDepartments.add(department);
    }
    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }


}
