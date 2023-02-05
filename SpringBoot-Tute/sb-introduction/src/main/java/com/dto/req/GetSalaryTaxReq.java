package com.dto.req;

public class GetSalaryTaxReq {
    private String name;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GetSalaryTaxReq{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
