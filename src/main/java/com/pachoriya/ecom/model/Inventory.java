package com.pachoriya.ecom.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "inventory")
public class Inventory {
	@Id
	@Field(value = "_id")
	private Object _id ; 

	private Date insertDate = new Date();
    private Boolean isActive;
    private String productName;
    private String productDescription;
    private String productSearchLabel;
    private Integer unitPurchased;
    private Integer unitSold;
    private Float purchasedCost;
    private Float saleCost;
    private String remark;
	/**
	 * @param _id
	 * @param insertDate
	 * @param isActive
	 * @param productName
	 * @param productDescription
	 * @param productSearchLabel
	 * @param unitPurchased
	 * @param unitSold
	 * @param purchasedCost
	 * @param saleCost
	 * @param remark
	 */
	public Inventory(Object _id, Date insertDate, Boolean isActive, String productName, String productDescription,
			String productSearchLabel, Integer unitPurchased, Integer unitSold, Float purchasedCost, Float saleCost,
			String remark) {
		super();
		this._id = _id;
		this.insertDate = insertDate;
		this.isActive = isActive;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productSearchLabel = productSearchLabel;
		this.unitPurchased = unitPurchased;
		this.unitSold = unitSold;
		this.purchasedCost = purchasedCost;
		this.saleCost = saleCost;
		this.remark = remark;
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
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}
	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	/**
	 * @return the productSearchLabel
	 */
	public String getProductSearchLabel() {
		return productSearchLabel;
	}
	/**
	 * @param productSearchLabel the productSearchLabel to set
	 */
	public void setProductSearchLabel(String productSearchLabel) {
		this.productSearchLabel = productSearchLabel;
	}
	/**
	 * @return the unitPurchased
	 */
	public Integer getUnitPurchased() {
		return unitPurchased;
	}
	/**
	 * @param unitPurchased the unitPurchased to set
	 */
	public void setUnitPurchased(Integer unitPurchased) {
		this.unitPurchased = unitPurchased;
	}
	/**
	 * @return the unitSold
	 */
	public Integer getUnitSold() {
		return unitSold;
	}
	/**
	 * @param unitSold the unitSold to set
	 */
	public void setUnitSold(Integer unitSold) {
		this.unitSold = unitSold;
	}
	/**
	 * @return the purchasedCost
	 */
	public Float getPurchasedCost() {
		return purchasedCost;
	}
	/**
	 * @param purchasedCost the purchasedCost to set
	 */
	public void setPurchasedCost(Float purchasedCost) {
		this.purchasedCost = purchasedCost;
	}
	/**
	 * @return the saleCost
	 */
	public Float getSaleCost() {
		return saleCost;
	}
	/**
	 * @param saleCost the saleCost to set
	 */
	public void setSaleCost(Float saleCost) {
		this.saleCost = saleCost;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
    
    
}
