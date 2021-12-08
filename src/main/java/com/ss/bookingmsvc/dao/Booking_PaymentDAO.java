/**
 * 
 */
package com.ss.bookingmsvc.dao;

import com.ss.bookingmsvc.entity.Booking_Payment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Colin Bradshaw
 *
 */
public class Booking_PaymentDAO extends BaseDAO<Booking_Payment> {
	public Booking_PaymentDAO() {

	}
	public Booking_PaymentDAO(Connection conn){
		super(conn);
	}

	@Override
	protected List<Booking_Payment> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		ArrayList<Booking_Payment> bp = new ArrayList<Booking_Payment>();
		while(rs.next()) {
			bp.add(new Booking_Payment(rs.getInt("booking_id"), rs.getString("stripe_id"), (0 != rs.getInt("refunded"))));
		}
		return bp;
	}
}
