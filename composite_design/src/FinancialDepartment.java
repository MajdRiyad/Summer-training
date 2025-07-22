public class FinancialDepartment implements Department {

    private String name;
    private int id;
    public FinancialDepartment(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void displayDepartmentName(){
        System.out.println(this.name);
    }
}
