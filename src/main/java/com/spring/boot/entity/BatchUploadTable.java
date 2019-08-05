package com.spring.boot.entity;
/*import javax.persistence.*;*/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by dpgupta on 10/12/2018.
 */
@Entity
@Table(schema = "LOWES", name = "T7246_SYC_PLN_BTC_UPL_TYP")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BatchUploadTable {

	@Id
    @Column(name="T7246_SYC_PLN_BTC_UPL_CD")
    private int uploadCode;
    
    @Column(name="SYC_PLN_BTC_UPL_DES_TXT")
    private String uploadDescription;

    @Column(name="ADD_DM")
    private String AddDateTime;

	@Column(name="UPD_ID")
    private String uploadId;

    @Column(name="UPD_DM")
    private String uploadDate;

    public BatchUploadTable() {

    }
    
    public BatchUploadTable(Long id, int uploadCode, String uploadDescription, String addDateTime, String uploadId,
			String uploadDate) {
		super();
//		this.id = id;
		this.uploadCode = uploadCode;
		this.uploadDescription = uploadDescription;
		AddDateTime = addDateTime;
		this.uploadId = uploadId;
//		this.uploadDate = uploadDate;
	}
    
    /* (non-Javadoc)
   	 * @see java.lang.Object#toString()
   	 */
   	@Override
   	public String toString() {
   		return "BatchUploadTable [uploadCode=" + uploadCode + ", uploadDescription=" + uploadDescription
   				+ ", AddDateTime=" + AddDateTime + ", uploadId=" + uploadId + ", uploadDate=" + uploadDate + "]";
   	}

	/**
	 * @return the id
	 */
//	public Long getId() {
//		return id;
//	}
//
//	/**
//	 * @param id the id to set
//	 */
//	public void setId(Long id) {
//		this.id = id;
//	}

	/**
	 * @return the uploadCode
	 */
	public int getUploadCode() {
		return uploadCode;
	}

	/**
	 * @param uploadCode the uploadCode to set
	 */
	public void setUploadCode(int uploadCode) {
		this.uploadCode = uploadCode;
	}

	/**
	 * @return the uploadDescription
	 */
	public String getUploadDescription() {
		return uploadDescription;
	}

	/**
	 * @param uploadDescription the uploadDescription to set
	 */
	public void setUploadDescription(String uploadDescription) {
		this.uploadDescription = uploadDescription;
	}

	/**
	 * @return the addDateTime
	 */
	public String getAddDateTime() {
		return AddDateTime;
	}

	/**
	 * @param addDateTime the addDateTime to set
	 */
	public void setAddDateTime(String addDateTime) {
		AddDateTime = addDateTime;
	}

	/**
	 * @return the uploadId
	 */
	public String getUploadId() {
		return uploadId;
	}

	/**
	 * @param uploadId the uploadId to set
	 */
	public void setUploadId(String uploadId) {
		this.uploadId = uploadId;
	}

	/**
	 * @return the uploadDate
	 */
	public String getUploadDate() {
		return uploadDate;
	}

	/**
	 * @param uploadDate the uploadDate to set
	 */
	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}

}
