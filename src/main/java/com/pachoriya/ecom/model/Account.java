/**
 * 
 */
package com.pachoriya.ecom.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author OmPrakashP
 *
 */
@Document(collection = "account")
public class Account {
	@Id
	@Field(value = "_id")
	private Object _id ; 

	private Date insertDate = new Date();
    private Boolean isActive;
    private String name;
    private String emailId;
    private String mobileNumber;
	/**
	 * @param _id
	 * @param insertDate
	 * @param isActive
	 * @param name
	 * @param emailId
	 * @param mobileNumber
	 */
	public Account(Object _id, Date insertDate, Boolean isActive, String name, String emailId, String mobileNumber) {
		super();
		this._id = _id;
		this.insertDate = insertDate;
		this.isActive = isActive;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}
	public Object get_id() {
		return _id;
	}
	public void set_id(Object _id) {
		this._id = _id;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
    
    
}
