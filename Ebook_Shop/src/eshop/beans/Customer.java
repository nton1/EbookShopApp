package eshop.beans;

public class Customer {
	
	private String contactName = "";
	private String deliveryAdress = "";
	private String ccName= "";
	private String ccNumber = "";
	private String ccExpiryDate = "";
	
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getDeliveryAdress() {
		return deliveryAdress;
	}
	public void setDeliveryAdress(String deliveryAdress) {
		this.deliveryAdress = deliveryAdress;
	}
	public String getCcName() {
		return ccName;
	}
	public void setCcName(String ccName) {
		this.ccName = ccName;
	}
	public String getCcNumber() {
		return ccNumber;
	}
	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}
	public String getCcExpiryDate() {
		return ccExpiryDate;
	}
	public void setCcExpireDate(String ccExpiryDate) {
		this.ccExpiryDate = ccExpiryDate;
	}
	

}
