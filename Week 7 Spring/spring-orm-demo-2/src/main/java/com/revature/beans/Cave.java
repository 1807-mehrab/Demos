package com.revature.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cave {
	@Id
	private int cave_id;
	private String cave_name;

	@Override
	public String toString() {
		return "Cave [cave_id=" + cave_id + ", cave_name=" + cave_name + "]";
	}

}
