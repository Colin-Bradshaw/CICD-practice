/**
 * 
 */
package com.ss.bookingmsvc.dao;

import com.ss.bookingmsvc.entity.Booking_Guest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Colin Bradshaw
 *
 */
public class Booking_GuestDAO extends BaseDAO<Booking_Guest> {
	public Booking_GuestDAO(){

	}
	public Booking_GuestDAO(Connection conn){
		super(conn);
	}


	@Override
	protected List<Booking_Guest> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		ArrayList<Booking_Guest> bg = new ArrayList<Booking_Guest>();
		while(rs.next()) {
			bg.add(new Booking_Guest(rs.getInt("booking_id"), rs.getString("contact_email"), rs.getString("contact_phone")));
		}
		return bg;
	}
}
