public class Main {
    public static void main(String[] args)
    {
        Department salesDepartment = new SalesDepartment("Sales department",1);
        Department financialDepartment = new FinancialDepartment("Financial department",2);

        HeadDepartment headDepartment = new HeadDepartment("Head department",3);
        HeadDepartment headDepartment2 = new HeadDepartment("Head2 department",4);


        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);
        headDepartment.addDepartment(headDepartment2);

        headDepartment.displayDepartmentName();
    }
}