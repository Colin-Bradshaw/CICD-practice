/**
 * 
 */
package com.ss.bookingmsvc.dao;

import com.ss.bookingmsvc.entity.Flight_Bookings;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Colin Bradshaw
 *
 */
public class Flight_BookingsDAO extends BaseDAO<Flight_Bookings> {
	public Flight_BookingsDAO(){

	}
	public Flight_BookingsDAO(Connection conn){
		super(conn);
	}


	@Override
	protected List<Flight_Bookings> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		ArrayList<Flight_Bookings> fb = new ArrayList<Flight_Bookings>();
		while(rs.next()) {
			fb.add(new Flight_Bookings(rs.getInt("flight_id"), rs.getInt("booking_id")));
		}
		return fb;
	}
}
