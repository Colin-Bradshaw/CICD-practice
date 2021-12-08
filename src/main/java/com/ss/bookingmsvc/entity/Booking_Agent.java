/**
 * 
 */
package com.ss.bookingmsvc.entity;

/**
 * @author Colin Bradshaw
 *
 */
public class Booking_Agent {
	private Integer booking_ID;
	private Integer agent_ID;
	
	public Booking_Agent(int booking_ID, int agent_ID) {
		this.booking_ID = booking_ID;
		this.agent_ID = agent_ID;
	}
	
	@Override
	public String toString() {
		return "Booking_Agent [booking_ID=" + booking_ID + ", agent_ID=" + agent_ID + "]";
	}

	public Object[] toArray(){
		return new Object[]{booking_ID, agent_ID};
	}
	public Integer getBooking_ID() {
		return booking_ID;
	}
	public void setBooking_ID(Integer booking_ID) {
		this.booking_ID = booking_ID;
	}
	public Integer getAgent_ID() {
		return agent_ID;
	}
	public void setAgent_ID(Integer agent_ID) {
		this.agent_ID = agent_ID;
	}
	
	
}
