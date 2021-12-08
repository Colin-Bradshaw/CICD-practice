/**
 * 
 */
package com.ss.bookingmsvc.dao;

import com.ss.bookingmsvc.entity.Booking;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Colin Bradshaw
 *
 */
public class BookingDAO extends BaseDAO<Booking>{

	public BookingDAO(){

	}
	public BookingDAO(Connection conn){
		super(conn);
	}

	@Override
	protected List<Booking> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		ArrayList<Booking> bk = new ArrayList<Booking>();
		while(rs.next()) {
			bk.add(new Booking(rs.getInt("id"), (0 != rs.getInt("is_active")), rs.getString("confirmation_code")));
		}
		return bk;
	}
}
