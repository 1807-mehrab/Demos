package com.revature.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Bear;
import com.revature.util.ConnectionUtil;

public class BearDao {
	public List<Bear> getAllBears() {
		PreparedStatement ps = null;
		Bear b = null;
		List<Bear> bears = new ArrayList<Bear>();
		
		try(Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM BEAR";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt("bear_id");
				String name = rs.getString("bear_name");
				int age = rs.getInt("bear_age");
				int weight = rs.getInt("bear_weight");
				
				b = new Bear(id, name, age, weight);
				bears.add(b);
			}
			
			rs.close();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return bears;
	}
	
	public Bear getBear(int id) {
		PreparedStatement ps = null;
		Bear b = null;
		ResultSet rs = null;
		
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM BEAR WHERE BEAR_ID = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				int bid = rs.getInt("bear_id");
				String name = rs.getString("bear_name");
				int age = rs.getInt("bear_age");
				int weight = rs.getInt("bear_weight");
				
				b = new Bear(bid, name, age, weight);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		
		return b;
	}
	
	public void feedBear(int bid, int bhid, int hamt) {
		CallableStatement cs = null;
		
		try(Connection conn = ConnectionUtil.getConnection()) {
			String sql = "{CALL SP_FEED_BEAR(?, ?, ?)}";
			cs = conn.prepareCall(sql);
			cs.setInt(1, bid);
			cs.setInt(2, bhid);
			cs.setInt(3, hamt);
			
			Boolean result = cs.execute();
			if (!result) {
				System.out.println("Fed Bear");
			} else {
				System.out.println("Failed");
			}
			
			cs.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
