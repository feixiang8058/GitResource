package com.fei.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Nationality entity. @author MyEclipse Persistence Tools
 */

public class Nationality{

	// Fields

	private Integer nid;
	private String nname;
	private String logogram;
	private Set ships = new HashSet(0);

	// Constructors

	/** default constructor */
	public Nationality() {
	}

	/** full constructor */
	public Nationality(String nname, String logogram, Set ships) {
		this.nname = nname;
		this.logogram = logogram;
		this.ships = ships;
	}

	// Property accessors

	public Integer getNid() {
		return this.nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public String getNname() {
		return this.nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	public String getLogogram() {
		return this.logogram;
	}

	public void setLogogram(String logogram) {
		this.logogram = logogram;
	}

	public Set getShips() {
		return this.ships;
	}

	public void setShips(Set ships) {
		this.ships = ships;
	}

}