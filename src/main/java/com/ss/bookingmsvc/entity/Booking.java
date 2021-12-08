/**
 * 
 */
package com.ss.bookingmsvc.entity;

/**
 * @author Colin Bradshaw
 *
 */
public class Booking {
	private Integer id;
	private boolean isActive;
	private String confirmation_Code;
	
	public Booking(int id, boolean isActive, String conf) {
		this.id = id;
		this.isActive = isActive;
		this.confirmation_Code = conf;
	}
	
	@Override
	public String toString() {
		return "Booking [id=" + id + ", isActive=" + isActive + ", confirmation_Code=" + confirmation_Code + "]";
	}

	public Object[] toArray(){
		return new Object[]{id, isActive, confirmation_Code};
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public String getConfirmation_Code() {
		return confirmation_Code;
	}
	public void setConfirmation_Code(String confirmation_Code) {
		this.confirmation_Code = confirmation_Code;
	}
	
	
}
