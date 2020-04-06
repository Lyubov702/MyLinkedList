package com.mycode.comparison;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int AnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        salary *= percent;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null || o.getClass()!=this.getClass()) return false;
        Employee employee = (Employee) o;
        return employee.firstName.equals(firstName)
                && employee.lastName.equals(lastName)
                && employee.salary == salary
                && employee.id == id;
    }

    @Override
    public int hashCode() {
        int result = 19;
        result = 31*result+id;
        result = 31*result+firstName.hashCode();
        result = 31*result+lastName.hashCode();
        result = 31*result+salary;

        return result;
    }
}
