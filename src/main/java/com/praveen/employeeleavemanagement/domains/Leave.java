/**
 * 
 */
package com.praveen.employeeleavemanagement.domains;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 * @author Madan
 *
 */
@Entity
@Table(name="employeeleaves")
public class Leave implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8954337050580548973L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@DateTimeFormat(iso=ISO.DATE) // This is for bind Date with @ModelAttribute
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="from_date")
	private Date fromdate;
	
	@DateTimeFormat(iso=ISO.DATE) // This is for bind Date with @ModelAttribute
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="to_date")
	private Date todate;
	
	private String remarks;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getFromdate() {
		return fromdate;
	}

	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}

	public Date getTodate() {
		return todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "EmployeeLeave [id=" + id + ", name=" + name + ", fromdate=" + fromdate + ", todate=" + todate
				+ ", remarks=" + remarks + "]";
	}
	
	

}
