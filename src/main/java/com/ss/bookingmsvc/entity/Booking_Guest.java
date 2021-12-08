/**
 * 
 */
package com.ss.bookingmsvc.entity;

/**
 * @author Colin Bradshaw
 *
 */
public class Booking_Guest {
	private Integer booking_ID;
	private String contact_email;
	private String contact_Phone;
	
	public Booking_Guest(int booking_ID, String email, String phone) {
		this.booking_ID = booking_ID;
		this.contact_email = email;
		this.contact_Phone = phone;
	}
	
	@Override
	public String toString() {
		return "Booking_Guest [booking_ID=" + booking_ID + ", contact_email=" + contact_email + ", contact_Phone="
				+ contact_Phone + "]";
	}

	public Object[] toArray(){
		return new Object[]{booking_ID, contact_email, contact_Phone};
	}
	public Integer getBooking_ID() {
		return booking_ID;
	}
	public void setBooking_ID(Integer booking_ID) {
		this.booking_ID = booking_ID;
	}
	public String getContact_email() {
		return contact_email;
	}
	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}
	public String getContact_Phone() {
		return contact_Phone;
	}
	public void setContact_Phone(String contact_Phone) {
		this.contact_Phone = contact_Phone;
	}
	
	
}
