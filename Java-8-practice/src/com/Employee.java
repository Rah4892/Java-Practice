package com;

public class Employee {
    private String empName;
    private int empId;
    private int empSalary;
    private String projectTitle;
    //private List<String> projects;

    public Employee(String empName, int empId, int empSalary, String projectTitle) {
        this.empName = empName;
        this.empId = empId;
        this.empSalary = empSalary;
        this.projectTitle = projectTitle;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", empSalary=" + empSalary +
                ", projectTitle" + projectTitle +
                '}';
    }
}
