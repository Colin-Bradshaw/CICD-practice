/**
 * 
 */
package com.ss.bookingmsvc.entity;

/**
 * @author Colin Bradshaw
 *
 */
public class Flight_Bookings {
	private Integer flight_ID;
	private Integer booking_ID;
	
	public Flight_Bookings(int flight_ID, int booking_ID) {
		this.flight_ID = flight_ID;
		this.booking_ID = booking_ID;
	}
	
	@Override
	public String toString() {
		return "Flight_Bookings [flight_ID=" + flight_ID + ", booking_ID=" + booking_ID + "]";
	}

	public Object[] toArray(){
		return new Object[]{flight_ID, booking_ID};
	}
	public Integer getFlight_ID() {
		return flight_ID;
	}
	public void setFlight_ID(Integer flight_ID) {
		this.flight_ID = flight_ID;
	}
	public Integer getBooking_ID() {
		return booking_ID;
	}
	public void setBooking_ID(Integer booking_ID) {
		this.booking_ID = booking_ID;
	}
	
	
}
