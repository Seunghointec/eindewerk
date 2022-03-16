package applicationPackage.data.implementation;

public class Staff {

    private int employeeID;
    private String name;
    private String jobTitle;

    public Staff(int employeeID, String name, String jobTitle) {
        this.employeeID = employeeID;
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
