package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cave {
	@Id
	@Column(name="CAVE_ID")
	private int id;
	@Column(name="CAVE_NAME")
	private String name;

	@Override
	public String toString() {
		return "Cave [cave_id=" + id + ", cave_name=" + name + "]";
	}

}
