package com.cmr.amazon.entity;

import java.io.Serializable;
//@Entity
//@Tab;e("category")
public class Category implements Serializable{
	private static final long serialVersionUID=1L;
	
	//@Id
	//@Generated
	//@Column(name='id' type="int")
	private int id;
	private String catname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCatname() {
		return catname;
	}
	public void setCatname(String catname) {
		this.catname = catname;
	}
	
}
