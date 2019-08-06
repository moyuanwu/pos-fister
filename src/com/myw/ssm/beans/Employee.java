package com.myw.ssm.beans;

public class Employee {

	private Integer id;
	private String last_name;
	private String email;
	private double salary;
	private Department dept;
	public Employee() {
		super();
	}
	public Employee(Integer id, String last_name, String email, double salary, Department dept) {
		super();
		this.id = id;
		this.last_name = last_name;
		this.email = email;
		this.salary = salary;
		this.dept = dept;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", last_name=" + last_name + ", email=" + email + ", salary=" + salary + ", dept="
				+ dept + "]";
	}
	
	
}
