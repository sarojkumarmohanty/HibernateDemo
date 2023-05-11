package tech.home.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_demo")
public class EmpDemo implements Serializable{
	
	@Id
	@Column(name="employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;
	
	@Column(name="last_name")
	private String lastName;
	
	private Double salary;
	
	@Column(name="hire_date")
	private Date hireDate;
	
//	@Column(name="department_id")
//	private Integer departmentId;
	
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private DeptDemo deptDemo;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="p_no")
	private Passport passport;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public DeptDemo getDeptDemo() {
		return deptDemo;
	}

	public void setDeptDemo(DeptDemo deptDemo) {
		this.deptDemo = deptDemo;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "EmpDemo [employeeId=" + employeeId + ", lastName=" + lastName + ", salary=" + salary + ", hireDate="
				+ hireDate + ", deptDemo=" + deptDemo + ", passport=" + passport + "]";
	}
	
	

	

}
