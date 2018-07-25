package com.revature.domain;

public class Cave {
	private int cave_id;
	private String cave_name;
	private int max_bears;

	public int getCave_id() {
		return cave_id;
	}

	public void setCave_id(int cave_id) {
		this.cave_id = cave_id;
	}

	public String getCave_name() {
		return cave_name;
	}

	public void setCave_name(String cave_name) {
		this.cave_name = cave_name;
	}

	public int getMax_bears() {
		return max_bears;
	}

	public void setMax_bears(int max_bears) {
		this.max_bears = max_bears;
	}

	public Cave(int cave_id, String cave_name, int max_bears) {
		super();
		this.cave_id = cave_id;
		this.cave_name = cave_name;
		this.max_bears = max_bears;
	}

	public Cave() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cave [cave_id=" + cave_id + ", cave_name=" + cave_name + ", max_bears=" + max_bears + "]";
	}

}
