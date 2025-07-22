public class SalesDepartment implements Department {

    private String name;
    private int id ;

    public SalesDepartment(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void displayDepartmentName() {
        System.out.println(this.name);
    }
}
