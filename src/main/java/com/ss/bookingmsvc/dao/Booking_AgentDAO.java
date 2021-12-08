/**
 * 
 */
package com.ss.bookingmsvc.dao;

import com.ss.bookingmsvc.entity.Booking_Agent;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Colin Bradshaw
 *
 */
public class Booking_AgentDAO extends BaseDAO<Booking_Agent> {
	public Booking_AgentDAO(){

	}
	public Booking_AgentDAO(Connection conn){
		super(conn);
	}

	@Override
	protected List<Booking_Agent> extractData(ResultSet rs) throws ClassNotFoundException, SQLException {
		ArrayList<Booking_Agent> ba = new ArrayList<Booking_Agent>();
		while(rs.next()) {
			ba.add(new Booking_Agent(rs.getInt("booking_id"), rs.getInt("agent_ID")));
		}
		return ba;
	}
}
