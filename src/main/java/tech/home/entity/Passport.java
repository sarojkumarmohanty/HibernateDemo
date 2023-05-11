package tech.home.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_passport")
public class Passport implements Serializable {
	@Id
	@Column(name = "p_no")
	private Integer passportNo;
	@Column(name = "issue_date")
	private Date issueDate;
	@Column(name = "expiry_date")
	private Date expiryDate;
	public Integer getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(Integer passportNo) {
		this.passportNo = passportNo;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", issueDate=" + issueDate + ", expiryDate=" + expiryDate + "]";
	}
	
	
}
