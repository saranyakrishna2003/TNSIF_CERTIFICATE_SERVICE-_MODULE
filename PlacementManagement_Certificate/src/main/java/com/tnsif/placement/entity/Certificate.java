package com.tnsif.placement.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Certificate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String certificateName;
	private String issuingOrganization;
	private LocalDate issueDate;
	private Long studentId;
	// getters and setters
	public Certificate() {
		super();
	}
	public Certificate(String certificateName, String issuingOrganization, LocalDate issueDate, Long studentId) {
		super();
		this.certificateName = certificateName;
		this.issuingOrganization = issuingOrganization;
		this.issueDate = issueDate;
		this.studentId = studentId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	public String getIssuingOrganization() {
		return issuingOrganization;
	}
	public void setIssuingOrganization(String issuingOrganization) {
		this.issuingOrganization = issuingOrganization;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	
	
	
	

}
