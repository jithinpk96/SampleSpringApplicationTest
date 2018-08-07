package com.kg.sampll;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Employee{
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// @TableGenerator(name = "employee", allocationSize = 1)
	// @JsonIgnore
	private Long employeeId;
	private String firstName;
	private String lastName;
	private Long salary;
	private String department;
 
	public Employee(){}
	public Long getEmployeeId() {
		return employeeId;
	}
 
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
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
 
	public Long getSalary() {
		return salary;
	}
 
	public void setSalary(Long salary) {
		this.salary = salary;
	}
 
	public String getDepartment() {
		return department;
	}
 
	public void setDepartment(String department) {
		this.department = department;
	}
 
	// public String getEmployee(){
	// 	return getEmployeeId()+getFirstName()+getLastName()+getDepartment()+getSalary();
	// }

	// @Override
	// public String toString() {
	// 	return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
	// 			+ ", salary=" + salary + ", department=" + department + "]";
	// }

	@Override
	public String toString() {
		return "Employee [employeeId=" + getEmployeeId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName()
				+ ", salary=" + getSalary() + ", department=" + getDepartment() + "]";
	}
 
}