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
@Document(collection = "order")
public class Order {
	@Id
	@Field(value = "_id")
	private Object _id ; 

	private Date insertDate = new Date();
    private Boolean isActive;    
    private String productName ; 
    private String emailId ; 
    private Integer quanity ;
    private Double amount ; 
    private Integer discountInPercent ;
    private String paymentType ;
    private Boolean isReturn ;
    private Boolean isExchange ;
    private Double refundAmount ;
    private String shippingAddress ;
	/**
	 * @param _id
	 * @param insertDate
	 * @param isActive
	 * @param productName
	 * @param emailId
	 * @param quanity
	 * @param amount
	 * @param discountInPercent
	 * @param paymentType
	 * @param isReturn
	 * @param isExchange
	 * @param refundAmount
	 * @param shippingAddress
	 */
	public Order(Object _id, Date insertDate, Boolean isActive, String productName, String emailId, Integer quanity,
			Double amount, Integer discountInPercent, String paymentType, Boolean isReturn, Boolean isExchange,
			Double refundAmount, String shippingAddress) {
		super();
		this._id = _id;
		this.insertDate = insertDate;
		this.isActive = isActive;
		this.productName = productName;
		this.emailId = emailId;
		this.quanity = quanity;
		this.amount = amount;
		this.discountInPercent = discountInPercent;
		this.paymentType = paymentType;
		this.isReturn = isReturn;
		this.isExchange = isExchange;
		this.refundAmount = refundAmount;
		this.shippingAddress = shippingAddress;
	}
	/**
	 * @return the _id
	 */
	public Object get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(Object _id) {
		this._id = _id;
	}
	/**
	 * @return the insertDate
	 */
	public Date getInsertDate() {
		return insertDate;
	}
	/**
	 * @param insertDate the insertDate to set
	 */
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	/**
	 * @return the isActive
	 */
	public Boolean getIsActive() {
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the quanity
	 */
	public Integer getQuanity() {
		return quanity;
	}
	/**
	 * @param quanity the quanity to set
	 */
	public void setQuanity(Integer quanity) {
		this.quanity = quanity;
	}
	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	/**
	 * @return the discountInPercent
	 */
	public Integer getDiscountInPercent() {
		return discountInPercent;
	}
	/**
	 * @param discountInPercent the discountInPercent to set
	 */
	public void setDiscountInPercent(Integer discountInPercent) {
		this.discountInPercent = discountInPercent;
	}
	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}
	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	/**
	 * @return the isReturn
	 */
	public Boolean getIsReturn() {
		return isReturn;
	}
	/**
	 * @param isReturn the isReturn to set
	 */
	public void setIsReturn(Boolean isReturn) {
		this.isReturn = isReturn;
	}
	/**
	 * @return the isExchange
	 */
	public Boolean getIsExchange() {
		return isExchange;
	}
	/**
	 * @param isExchange the isExchange to set
	 */
	public void setIsExchange(Boolean isExchange) {
		this.isExchange = isExchange;
	}
	/**
	 * @return the refundAmount
	 */
	public Double getRefundAmount() {
		return refundAmount;
	}
	/**
	 * @param refundAmount the refundAmount to set
	 */
	public void setRefundAmount(Double refundAmount) {
		this.refundAmount = refundAmount;
	}
	/**
	 * @return the shippingAddress
	 */
	public String getShippingAddress() {
		return shippingAddress;
	}
	/**
	 * @param shippingAddress the shippingAddress to set
	 */
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
    
    

}
