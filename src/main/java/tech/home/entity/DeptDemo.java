package tech.home.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept_demo")
public class DeptDemo implements Serializable {
	@Id
	@Column(name = "department_id")
	private Integer departmentId;
	
	@Column(name = "department_name")
	private String departmentName;
	
	
	@OneToMany(mappedBy = "deptDemo")
	private List<EmpDemo> empDemo;


	public Integer getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public List<EmpDemo> getEmpDemo() {
		return empDemo;
	}


	public void setEmpDemo(List<EmpDemo> empDemo) {
		this.empDemo = empDemo;
	}


	@Override
	public String toString() {
		return "DeptDemo [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}


	
	
	
}
