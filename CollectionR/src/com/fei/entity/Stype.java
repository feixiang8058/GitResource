package com.fei.entity;

import java.util.HashSet;
import java.util.Set;

public class Stype{

	// Fields

	private Integer tid;
	private String tname;
	private String simple;
	
	public String getSimple() {
		return simple;
	}

	public void setSimple(String simple) {
		this.simple = simple;
	}

	private Set ships = new HashSet(0);

	// Constructors

	/** default constructor */
	public Stype() {
	}

	/** full constructor */
	public Stype(String tname, Set ships) {
		this.tname = tname;
		this.ships = ships;
	}

	// Property accessors

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Set getShips() {
		return this.ships;
	}

	public void setShips(Set ships) {
		this.ships = ships;
	}

}