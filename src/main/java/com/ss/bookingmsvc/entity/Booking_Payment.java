/**
 * 
 */
package com.ss.bookingmsvc.entity;

/**
 * @author Colin Bradshaw
 *
 */
public class Booking_Payment {
	private Integer booking_ID;
	private String stripe_ID;
	private Boolean refunded;
	
	public Booking_Payment(int booking_ID, String stripe, Boolean refund) {
		this.booking_ID = booking_ID;
		this.stripe_ID = stripe;
		this.refunded = refund;
	}
	
	@Override
	public String toString() {
		return "Booking_Payment [booking_ID=" + booking_ID + ", stripe_ID=" + stripe_ID + ", refunded=" + refunded
				+ "]";
	}

	public Object[] toArray(){
		return new Object[]{booking_ID, stripe_ID, refunded};
	}
	public Integer getBooking_ID() {
		return booking_ID;
	}
	public void setBooking_ID(Integer booking_ID) {
		this.booking_ID = booking_ID;
	}
	public String getStripe_ID() {
		return stripe_ID;
	}
	public void setStripe_ID(String stripe_ID) {
		this.stripe_ID = stripe_ID;
	}
	public Boolean getRefunded() {
		return refunded;
	}
	public void setRefunded(Boolean refunded) {
		this.refunded = refunded;
	}
	
}
