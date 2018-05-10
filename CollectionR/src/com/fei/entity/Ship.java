package com.fei.entity;

/**
 * Ship entity. @author MyEclipse Persistence Tools
 */

public class Ship {

	// Fields

	private Integer id;
	private String code;
	private String name;
	private Integer state;
	private Stype stype;
	private Nationality nationality;


	// Constructors

	/** default constructor */
	public Ship() {
	}

	/** full constructor */
	public Ship(Stype stype, Nationality nationality, String code, String name,
			Integer state) {
		this.stype = stype;
		this.nationality = nationality;
		this.code = code;
		this.name = name;
		this.state = state;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Stype getStype() {
		return this.stype;
	}

	public void setStype(Stype stype) {
		this.stype = stype;
	}

	public Nationality getNationality() {
		return this.nationality;
	}

	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}