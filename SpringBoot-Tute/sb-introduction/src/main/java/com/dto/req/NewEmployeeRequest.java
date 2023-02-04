package com.dto.req;

public class NewEmployeeRequest {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int empAge;
    private double salary;
    private short status;
    /*Permanent-True / Contract - FALSE */
    private boolean empType;

    public NewEmployeeRequest() {
    }

    public NewEmployeeRequest(String firstName, String lastName, String emailAddress, int empAge, double salary, short status, boolean empType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.empAge = empAge;
        this.salary = salary;
        this.status = status;
        this.empType = empType;
    }



    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public boolean isEmpType() {
        return empType;
    }

    public void setEmpType(boolean empType) {
        this.empType = empType;
    }

    @Override
    public String toString() {
        return "NewEmployeeRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", empAge=" + empAge +
                ", salary=" + salary +
                ", status=" + status +
                ", empType=" + empType +
                '}';
    }
}
