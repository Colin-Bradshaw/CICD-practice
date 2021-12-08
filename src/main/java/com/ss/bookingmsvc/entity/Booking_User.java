/**
 * 
 */
package com.ss.bookingmsvc.entity;

/**
 * @author Colin Bradshaw
 *
 */
public class Booking_User {
	private Integer booking_ID;
	private Integer user_ID;
	
	public Booking_User(int booking_ID, int user_ID) {
		this.booking_ID = booking_ID;
		this.user_ID = user_ID;
	}
	
	@Override
	public String toString() {
		return "Booking_User [booking_ID=" + booking_ID + ", user_ID=" + user_ID + "]";
	}

	public Object[] toArray(){
		return new Object[]{booking_ID, user_ID};
	}
	public Integer getBooking_ID() {
		return booking_ID;
	}
	public void setBooking_ID(Integer booking_ID) {
		this.booking_ID = booking_ID;
	}
	public Integer getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(Integer user_ID) {
		this.user_ID = user_ID;
	}
	
	
}
