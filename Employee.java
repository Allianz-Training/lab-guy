package com.Allianz.Homeworkoop;

public class Employee {
  private int id;
  private String firstName;
  private String lastName;
  private int salary;

  public static void main(String[] args) {
    Employee em1 = new Employee(001, "Ekkapon", "Shansiri", 200000);
    System.out.println(em1);
  }

  public Employee(int idInput, String firstNameInput, String lastNameInput, int salaryInput) {
    id = idInput;
    firstName = firstNameInput;
    lastName = lastNameInput;
    salary = salaryInput;
  }

  public int getID() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getName() {
    return firstName + " " + lastName;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getAnnualSalary() {
    return salary * 12;
  }

  public int raiseSalary(int percent) {
    return salary = (salary * percent / 100);
  }

  public String toString() {
    return "Employee[id= " + id + ", name= " + this.getName() + ", salary= " + salary + "]";
  }

}
