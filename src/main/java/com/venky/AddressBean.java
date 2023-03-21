package com.venky;

public class AddressBean {
	private int Hno;
	private String city;
	private String state;
	public int getHno() {
		return Hno;
	}
	public void setHno(int hno) {
		Hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "AddressBean [getHno()=" + getHno() + ", getCity()=" + getCity() + ", getState()=" + getState() + "]";
	}
	
	
	

}
