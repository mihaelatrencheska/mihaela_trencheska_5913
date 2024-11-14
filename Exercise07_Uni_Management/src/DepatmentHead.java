public class DepartmentHead extends Professor implements Administrator {
    private String departmentName;

    public DepartmentHead(String id, String name, String departmentName) {
        super(id, name);
        this.departmentName = departmentName;
        this.role = "Department Head";
    }

    @Override
    public void manageDepartment(String departmentName) {
        System.out.println(getName() + " is managing the department: " + departmentName);
    }
}