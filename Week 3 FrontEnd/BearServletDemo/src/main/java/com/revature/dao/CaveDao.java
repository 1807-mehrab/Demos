package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Cave;
import com.revature.util.ConnectionUtil;

public class CaveDao {
	public List<Cave> getAllCaves() {
		PreparedStatement ps = null;
		Cave c = null;
		List<Cave> caves = new ArrayList<>();
		
		try(Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM CAVE";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				int cave_id = rs.getInt("cave_id");
				String cave_name = rs.getString("cave_name");
				int max_bears = rs.getInt("max_bears");
				
				c = new Cave(cave_id, cave_name, max_bears);
				caves.add(c);
			}
			
			rs.close();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return caves;
	}
}
