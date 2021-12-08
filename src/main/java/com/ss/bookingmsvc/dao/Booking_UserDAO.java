/**
 * 
 */
package com.ss.bookingmsvc.dao;

import com.ss.bookingmsvc.entity.Booking_User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Colin Bradshaw
 *
 */
public class Booking_UserDAO extends BaseDAO<Booking_User> {
	public  Booking_UserDAO(){

	}
	public Booking_UserDAO(Connection conn){
		super(conn);
	}

	@Override
	protected List<Booking_User> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		ArrayList<Booking_User> bu = new ArrayList<Booking_User>();
		while(rs.next()) {
			bu.add(new Booking_User(rs.getInt("booking_id"), rs.getInt("user_id")));
		}
		return bu;
	}
}
